package akkamaddi.plugins.ClassicalAlchemy;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import alexndr.api.content.inventory.SimpleTab;
import alexndr.api.core.ContentTypes;
import alexndr.api.core.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
// used in 1.6.2

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
		toolStannum = EnumHelper.addToolMaterial("STANNUM",
				Settings.stannumMiningLevel, Settings.stannumUsesNum,
				Settings.stannumMiningSpeed, Settings.stannumDamageVsEntity,
				Settings.stannumEnchantability);
		toolCuprum = EnumHelper.addToolMaterial("CUPRUM",
				Settings.cuprumMiningLevel, Settings.cuprumUsesNum,
				Settings.cuprumMiningSpeed, Settings.cuprumDamageVsEntity,
				Settings.cuprumEnchantability);
		toolPyropusBronze = EnumHelper.addToolMaterial("PYROPUSBRONZE",
				Settings.pyropusBronzeMiningLevel,
				Settings.pyropusBronzeUsesNum,
				Settings.pyropusBronzeMiningSpeed,
				Settings.pyropusBronzeDamageVsEntity,
				Settings.pyropusBronzeEnchantability);
		toolPulchrumBronze = EnumHelper.addToolMaterial("PULCHRUMBRONZE",
				Settings.pulchrumBronzeMiningLevel,
				Settings.pulchrumBronzeUsesNum,
				Settings.pulchrumBronzeMiningSpeed,
				Settings.pulchrumBronzeDamageVsEntity,
				Settings.pulchrumBronzeEnchantability);
		toolTombBronze = EnumHelper.addToolMaterial("TOMBBRONZE",
				Settings.tombBronzeMiningLevel, Settings.tombBronzeUsesNum,
				Settings.tombBronzeMiningSpeed,
				Settings.tombBronzeDamageVsEntity,
				Settings.tombBronzeEnchantability);

		/**
		 * EnumArmorMaterial. In form ("NAME", max damage (like uses, multiply by
		 * pieces for their max damage), new int[] {helmet defense, chestplate
		 * defense, leggings defense, boots defense}, enchantability)
		 */
		armorStannum = EnumHelper.addArmorMaterial("STANNUM",
				Settings.stannumArmorDurability,
				Settings.stannumArmorDamageReduction,
				Settings.stannumArmorEnchantability);
		armorCuprum = EnumHelper.addArmorMaterial("CUPRUM",
				Settings.cuprumArmorDurability,
				Settings.cuprumArmorDamageReduction,
				Settings.cuprumArmorEnchantability);
		armorPyropusBronze = EnumHelper.addArmorMaterial("PYROPUSBRONZE",
				Settings.pyropusBronzeArmorDurability,
				Settings.pyropusBronzeArmorDamageReduction,
				Settings.pyropusBronzeArmorEnchantability);
		armorTombBronze = EnumHelper.addArmorMaterial("TOMBBRONZE",
				Settings.tombBronzeArmorDurability,
				Settings.tombBronzeArmorDamageReduction,
				Settings.tombBronzeArmorEnchantability);
	} // end setToolAndArmorStats()
	
	/**
	 * Sets repair materials for the tools/armor of that type. ie. Copper Ingot to repair copper tools and armor.
	 */
	private static void setRepairMaterials()
	{
		
		toolStannum.setRepairItem(new ItemStack(Content.stannumIngot));
		toolCuprum.setRepairItem(new ItemStack(Content.cuprumIngot));
		toolPyropusBronze.setRepairItem(new ItemStack(Content.pyropusBronzeIngot));
		toolPulchrumBronze.setRepairItem(new ItemStack(Content.pulchrumBronzeIngot));
		toolTombBronze.setRepairItem(new ItemStack(Content.tombBronzeIngot));
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
