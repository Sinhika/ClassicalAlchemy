package akkamaddi.plugins.ClassicalAlchemy;

import java.io.File;

import alexndr.api.content.inventory.SimpleTab;
import alexndr.api.core.ContentTypes;
import alexndr.api.core.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION, 
dependencies = "required-after:simplecore; required-after:simpleores ; required-after:fusion ; required-after:akkamaddicore; after: arsenic")
public class ClassicalAlchemy 
{
	// tab
	public static SimpleTab tabAkkamaddiClassicalAlchemy;

	public static ToolMaterial toolStannum, toolCuprum, toolPyropusBronze, toolPulchrumBronze, 
		toolTombBronze; 

	public static ArmorMaterial armorStannum,armorCuprum, armorPyropusBronze, armorTombBronze; 

	/**
	 * Run before anything else. Read your config, create blocks, items, etc,
	 * and register them with the GameRegistry. Register recipes.
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		// Tab
		LogHelper.info("Loading ClassicalAlchemy...");
		tabAkkamaddiClassicalAlchemy = new SimpleTab("tabAkkamaddiClassicalAlchemy", 
												     ContentTypes.CreativeTab.GENERAL);
		//Configuration
		Settings.createOrLoadSettings(event);
		
		//Content
		setToolAndArmorStats();
		Content.preInitialize();
		Recipes.preInitialize();
		Content.setLoot();

		MinecraftForge.EVENT_BUS.register(new HandlerArmor());


	} // end preInit()

	/**
	 * Do your mod setup. Build whatever data structures you care about.
	 */
	@EventHandler
	public void load(FMLInitializationEvent event) 
	{
		// run tab icon call
		setTabIcons();
		setRepairMaterials();
		Recipes.initialize();
	
	} // end load()

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		Recipes.craftTombBronze();
		LogHelper.info("ClassicalAlchemy loaded");
	}
	
	/**
	 * Sets the tool and armor stats from the Settings file.
	 */
	private static void setToolAndArmorStats() 
	{
		// set tool properties
		// EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage
		// to entity, enchantability)
		  toolStannum = EnumHelper.addToolMaterial("STANNUM", 2, 380, 8.5F, 2, 10);
		  toolCuprum = EnumHelper.addToolMaterial("CUPRUM", 2, 345, 9.0F, 2, 10);
		  toolPyropusBronze = EnumHelper.addToolMaterial("PYROPUSBRONZE", 2, 840, 11.0F, 3, 18);
		  toolPulchrumBronze = EnumHelper.addToolMaterial("PULCHRUMBRONZE", 3, 336, 12.0F, 3, 22);
		  toolTombBronze = EnumHelper.addToolMaterial("TOMBBRONZE", 3, 920, 14.05F, 3, 28);

		/**
		 * EnumArmorMaterial. In form ("NAME", max damage (like uses, multiply by
		 * pieces for their max damage), new int[] {helmet defense, chestplate
		 * defense, leggings defense, boots defense}, enchantability)
		 */
		  armorStannum = EnumHelper.addArmorMaterial(
				"STANNUM", 14, new int[] { 2, 4, 3, 2 }, 10);
		  armorCuprum = EnumHelper.addArmorMaterial(
				"CUPRUM", 13, new int[] { 2, 4, 3, 2 }, 9);
		  armorPyropusBronze = EnumHelper
				.addArmorMaterial("PYROPUSBRONZE", 20, new int[] { 4, 5, 4, 2 }, 18);
		  armorTombBronze = EnumHelper.addArmorMaterial(
				"TOMBBRONZE", 24, new int[] { 4, 6, 5, 4 }, 28);
	} // end setToolAndArmorStats()
	
	/**
	 * Sets repair materials for the tools/armor of that type. ie. Copper Ingot to repair copper tools and armor.
	 */
	private static void setRepairMaterials()
	{
		
		toolStannum.customCraftingMaterial = Content.stannumIngot;
		toolCuprum.customCraftingMaterial = Content.cuprumIngot;
		toolPyropusBronze.customCraftingMaterial = Content.pyropusBronzeIngot;
		toolPulchrumBronze.customCraftingMaterial = Content.pulchrumBronzeIngot;
		toolTombBronze.customCraftingMaterial = Content.tombBronzeIngot;
		armorStannum.customCraftingMaterial = Content.stannumIngot;
		armorCuprum.customCraftingMaterial = Content.cuprumIngot;
		armorPyropusBronze.customCraftingMaterial = Content.pyropusBronzeIngot;
		armorTombBronze.customCraftingMaterial = Content.tombBronzeIngot;
	} // end setRepairMaterials()

	/**
	 * Creating the custom tab using the API class "SimpleTab" and setting
	 * its icon.
	 */
	private void setTabIcons() 
	{
		tabAkkamaddiClassicalAlchemy.setIcon(new ItemStack(
				Content.blockPyropusBronze));
	} // end setTabIcons

	
} // end class ClassicalAlchemy
