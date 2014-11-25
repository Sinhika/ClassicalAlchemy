package akkamaddi.ClassicalAlchemy.code;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import akkamaddi.akkamaddiCore.api.APIcore;
import akkamaddi.akkamaddiCore.api.CommonProxy;
import alexndr.SimpleOres.api.content.SimpleArmor;
import alexndr.SimpleOres.api.content.SimpleAxe;
import alexndr.SimpleOres.api.content.SimpleBlock;
import alexndr.SimpleOres.api.content.SimpleHoe;
import alexndr.SimpleOres.api.content.SimpleIngot;
import alexndr.SimpleOres.api.content.SimplePickaxe;
import alexndr.SimpleOres.api.content.SimpleShovel;
import alexndr.SimpleOres.api.content.SimpleSword;
import alexndr.SimpleOres.api.content.SimpleTab;
import alexndr.SimpleOres.api.helpers.LootHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "classicalalchemy", name = "Classical Alchemy", version = "1.7.10-1.2.3", dependencies = "required-after:simpleores; required-after:fusionplugin ; required-after:akkamaddicore; after: arsenic")
public class ClassicalAlchemyCore {
	// The instance of your mod that Forge uses.
	@Instance("classicalalchemy")
	public static ClassicalAlchemyCore instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "akkamaddi.ClassicalAlchemy.code.ClientProxy", serverSide = "akkamaddi.akkamaddiCore.api.CommonProxy")
	public static CommonProxy proxy;

	// set actual item names
	// Stannum
	public static Item stannumIngot;
	public static Item smallStannumChunkItem;
	public static Item mediumStannumChunkItem;
	public static Item largeStannumChunkItem;

	public static Item stannumSword;
	public static Item stannumShovel;
	public static Item stannumAxe;
	public static Item stannumPickaxe;
	public static Item stannumHoe;

	public static Item stannumHelm;
	public static Item stannumChest;
	public static Item stannumLegs;
	public static Item stannumBoots;

	public static Item cuprumIngot;
	public static Item smallCuprumChunkItem;
	public static Item mediumCuprumChunkItem;
	public static Item largeCuprumChunkItem;

	public static Item cuprumSword;
	public static Item cuprumShovel;
	public static Item cuprumAxe;
	public static Item cuprumPickaxe;
	public static Item cuprumHoe;

	public static Item cuprumHelm;
	public static Item cuprumChest;
	public static Item cuprumLegs;
	public static Item cuprumBoots;

	public static Item pyropusBronzeIngot;
	public static Item smallPyropusBronzeChunkItem;
	public static Item mediumPyropusBronzeChunkItem;
	public static Item largePyropusBronzeChunkItem;

	public static Item pyropusBronzeSword;
	public static Item pyropusBronzeShovel;
	public static Item pyropusBronzeAxe;
	public static Item pyropusBronzePickaxe;
	public static Item pyropusBronzeHoe;

	public static Item pyropusBronzeHelm;
	public static Item pyropusBronzeChest;
	public static Item pyropusBronzeLegs;
	public static Item pyropusBronzeBoots;

	public static Item pulchrumBronzeIngot;
	public static Item largePulchrumBronzeChunkItem;

	public static Item pulchrumBronzeSword;
	public static Item pulchrumBronzeShovel;
	public static Item pulchrumBronzeAxe;
	public static Item pulchrumBronzePickaxe;

	public static Item tombBronzeIngot;
	public static Item smallTombBronzeChunkItem;
	public static Item mediumTombBronzeChunkItem;
	public static Item largeTombBronzeChunkItem;

	public static Item tombBronzeSword;
	public static Item tombBronzeShovel;
	public static Item tombBronzeAxe;
	public static Item tombBronzePickaxe;

	public static Item tombBronzeHelm;
	public static Item tombBronzeChest;
	public static Item tombBronzeLegs;
	public static Item tombBronzeBoots;

	// set block names
	public static Block blockStannum;
	public static Block blockCuprum;
	public static Block blockPyropusBronze;
	public static Block blockPulchrumBronze;
	public static Block blockTombBronze;

	// booleans

	public static boolean enableRecycling;
	public static boolean itemizeMobs;

	// tab
	public static SimpleTab tabAkkamaddiClassicalAlchemy = new SimpleTab(
			"tabAkkamaddiClassicalAlchemy");

	// set tool properties
	// EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage
	// to entity, enchantability)
	public static ToolMaterial toolStannum = EnumHelper.addToolMaterial(
			"STANNUM", 2, 380, 8.5F, 2, 10);
	public static ToolMaterial toolCuprum = EnumHelper.addToolMaterial(
			"CUPRUM", 2, 345, 9.0F, 2, 10);
	public static ToolMaterial toolPyropusBronze = EnumHelper.addToolMaterial(
			"PYROPUSBRONZE", 2, 840, 11.0F, 3, 18);
	public static ToolMaterial toolPulchrumBronze = EnumHelper.addToolMaterial(
			"PULCHRUMBRONZE", 3, 336, 12.0F, 3, 22);
	public static ToolMaterial toolTombBronze = EnumHelper.addToolMaterial(
			"TOMBBRONZE", 3, 920, 14.05F, 3, 28);

	/**
	 * EnumArmorMaterial. In form ("NAME", max damage (like uses, multiply by
	 * pieces for their max damage), new int[] {helmet defense, chestplate
	 * defense, leggings defense, boots defense}, enchantability)
	 */
	public static ArmorMaterial armorStannum = EnumHelper.addArmorMaterial(
			"STANNUM", 14, new int[] { 2, 4, 3, 2 }, 10);
	public static ArmorMaterial armorCuprum = EnumHelper.addArmorMaterial(
			"CUPRUM", 13, new int[] { 2, 4, 3, 2 }, 9);
	public static ArmorMaterial armorPyropusBronze = EnumHelper
			.addArmorMaterial("PYROPUSBRONZE", 20, new int[] { 4, 5, 4, 2 }, 18);
	public static ArmorMaterial armorTombBronze = EnumHelper.addArmorMaterial(
			"TOMBBRONZE", 24, new int[] { 4, 6, 5, 4 }, 28);

	// Armor
	public static int rendererStannum;
	public static int rendererCuprum;
	public static int rendererPyropusBronze;
	public static int rendererTombBronze;

	// Tab
	public void setTabIcons() {
		/**
		 * Creating the custom tabs using the API class "SimpleTab" and setting
		 * their icon.
		 */
		tabAkkamaddiClassicalAlchemy.setIcon(new ItemStack(
				ClassicalAlchemyCore.blockPyropusBronze));
	}

	/**
	 * Run before anything else. Read your config, create blocks, items, etc,
	 * and register them with the GameRegistry. Register recipes.
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		File installDir = event.getModConfigurationDirectory();
		File configDir = new File(installDir, "akkamaddi");
		File configFile = new File(configDir, "classicalalchemy.cfg");
		Configuration config = new Configuration(configFile);

		config.load();
		// Stannum
		enableRecycling = config
				.get(Configuration.CATEGORY_GENERAL,
						"Enable Classical Alchemy item recycling recipes: false or true?",
						false).getBoolean(false);
		itemizeMobs = config.get(Configuration.CATEGORY_GENERAL,
				"Equip Mobs with Classical Alchemy gear,  false or true?",
				false).getBoolean(false);

		config.save();

		// define items
		// Stannum
		stannumIngot = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumIngot");
		smallStannumChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("smallStannumChunkItem");
		mediumStannumChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("mediumStannumChunkItem");
		largeStannumChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largeStannumChunkItem");
		stannumSword = new SimpleSword(toolStannum)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumSword");
		stannumShovel = new SimpleShovel(toolStannum)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumShovel");
		stannumAxe = new SimpleAxe(toolStannum)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumAxe");
		stannumPickaxe = new SimplePickaxe(toolStannum)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumPickaxe");
		stannumHoe = new SimpleHoe(toolStannum)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumHoe");
		stannumHelm = new SimpleArmor(armorStannum, rendererStannum, 0)
				.modId("classicalalchemy")
				.setType("stannum")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumHelm");
		stannumChest = new SimpleArmor(armorStannum, rendererStannum, 1)
				.modId("classicalalchemy")
				.setType("stannum")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumChest");
		stannumLegs = new SimpleArmor(armorStannum, rendererStannum, 2)
				.modId("classicalalchemy")
				.setType("stannum")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumLegs");
		stannumBoots = new SimpleArmor(armorStannum, rendererStannum, 3)
				.modId("classicalalchemy")
				.setType("stannum")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumBoots");
		cuprumIngot = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumIngot");
		smallCuprumChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("smallCuprumChunkItem");
		mediumCuprumChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("mediumCuprumChunkItem");
		largeCuprumChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largeCuprumChunkItem");
		cuprumSword = new SimpleSword(toolCuprum)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumSword");
		cuprumShovel = new SimpleShovel(toolCuprum)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumShovel");
		cuprumAxe = new SimpleAxe(toolCuprum)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumAxe");
		cuprumPickaxe = new SimplePickaxe(toolCuprum)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumPickaxe");
		cuprumHoe = new SimpleHoe(toolCuprum)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumHoe");
		cuprumHelm = new SimpleArmor(armorCuprum, rendererCuprum, 0)
				.modId("classicalalchemy")
				.setType("cuprum")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumHelm");
		cuprumChest = new SimpleArmor(armorCuprum, rendererCuprum, 1)
				.modId("classicalalchemy")
				.setType("cuprum")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumChest");
		cuprumLegs = new SimpleArmor(armorCuprum, rendererCuprum, 2)
				.modId("classicalalchemy")
				.setType("cuprum")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumLegs");
		cuprumBoots = new SimpleArmor(armorCuprum, rendererCuprum, 3)
				.modId("classicalalchemy")
				.setType("cuprum")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumBoots");
		pyropusBronzeIngot = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeIngot");
		smallPyropusBronzeChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("smallPyropusBronzeChunkItem");
		mediumPyropusBronzeChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("mediumPyropusBronzeChunkItem");
		largePyropusBronzeChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largePyropusBronzeChunkItem");
		pyropusBronzeSword = new SimpleSword(toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeSword");
		pyropusBronzeShovel = new SimpleShovel(toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeShovel");
		pyropusBronzeAxe = new SimpleAxe(toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeAxe");
		pyropusBronzePickaxe = new SimplePickaxe(toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzePickaxe");
		pyropusBronzeHoe = new SimpleHoe(toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeHoe");
		pyropusBronzeHelm = new SimpleArmor(armorPyropusBronze,
				rendererPyropusBronze, 0)
				.modId("classicalalchemy")
				.setType("pyropusBronze")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeHelm");
		pyropusBronzeChest = new SimpleArmor(armorPyropusBronze,
				rendererPyropusBronze, 1)
				.modId("classicalalchemy")
				.setType("pyropusBronze")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeChest");
		pyropusBronzeLegs = new SimpleArmor(armorPyropusBronze,
				rendererPyropusBronze, 2)
				.modId("classicalalchemy")
				.setType("pyropusBronze")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeLegs");
		pyropusBronzeBoots = new SimpleArmor(armorPyropusBronze,
				rendererPyropusBronze, 3)
				.modId("classicalalchemy")
				.setType("pyropusBronze")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeBoots");
		pulchrumBronzeIngot = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzeIngot");
		largePulchrumBronzeChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largePulchrumBronzeChunkItem");
		pulchrumBronzeSword = new SimpleSword(toolPulchrumBronze)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzeSword");
		pulchrumBronzeShovel = new SimpleShovel(toolPulchrumBronze)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzeShovel");
		pulchrumBronzeAxe = new SimpleAxe(toolPulchrumBronze)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzeAxe");
		pulchrumBronzePickaxe = new SimplePickaxe(toolPulchrumBronze)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzePickaxe");
		tombBronzeIngot = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeIngot");
		smallTombBronzeChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("smallTombBronzeChunkItem");
		mediumTombBronzeChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("mediumTombBronzeChunkItem");
		largeTombBronzeChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largeTombBronzeChunkItem");
		tombBronzeSword = new SimpleSword(toolTombBronze)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeSword");
		tombBronzeShovel = new SimpleShovel(toolTombBronze)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeShovel");
		tombBronzeAxe = new SimpleAxe(toolTombBronze)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeAxe");
		tombBronzePickaxe = new SimplePickaxe(toolTombBronze)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzePickaxe");
		tombBronzeHelm = new SimpleArmor(armorTombBronze, rendererTombBronze, 0)
				.modId("classicalalchemy")
				.setType("tombBronze")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeHelm");
		tombBronzeChest = new SimpleArmor(armorTombBronze, rendererTombBronze,
				1)
				.modId("classicalalchemy")
				.setType("tombBronze")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeChest");
		tombBronzeLegs = new SimpleArmor(armorTombBronze, rendererTombBronze, 2)
				.modId("classicalalchemy")
				.setType("tombBronze")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeLegs");
		tombBronzeBoots = new SimpleArmor(armorTombBronze, rendererTombBronze,
				3)
				.modId("classicalalchemy")
				.setType("tombBronze")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeBoots");

		// define blocks
		blockStannum = new SimpleBlock(Material.iron)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setHardness(4.0F).setResistance(8.0F)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockStannum");
		blockCuprum = new SimpleBlock(Material.iron)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setHardness(8.0F).setResistance(16.0F)
				.setStepSound(Block.soundTypeMetal).setBlockName("blockCuprum");
		blockPyropusBronze = new SimpleBlock(Material.iron)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setHardness(10.0F).setResistance(18.0F)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockPyropusBronze");
		blockPulchrumBronze = new SimpleBlock(Material.iron)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setHardness(8.0F).setResistance(20.0F)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockPulchrumBronze");
		blockTombBronze = new SimpleBlock(Material.iron)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
				.setHardness(12.0F).setResistance(24.0F)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockTombBronze");

		blockStannum.setHarvestLevel("pickaxe", 0);
		blockCuprum.setHarvestLevel("pickaxe", 0);
		blockPyropusBronze.setHarvestLevel("pickaxe", 0);
		blockPulchrumBronze.setHarvestLevel("pickaxe", 0);
		blockTombBronze.setHarvestLevel("pickaxe", 0);

		toolStannum.customCraftingMaterial = ClassicalAlchemyCore.stannumIngot;
		toolCuprum.customCraftingMaterial = ClassicalAlchemyCore.cuprumIngot;
		toolPyropusBronze.customCraftingMaterial = ClassicalAlchemyCore.pyropusBronzeIngot;
		toolPulchrumBronze.customCraftingMaterial = ClassicalAlchemyCore.pulchrumBronzeIngot;
		toolTombBronze.customCraftingMaterial = ClassicalAlchemyCore.tombBronzeIngot;
		armorStannum.customCraftingMaterial = ClassicalAlchemyCore.stannumIngot;
		armorCuprum.customCraftingMaterial = ClassicalAlchemyCore.cuprumIngot;
		armorPyropusBronze.customCraftingMaterial = ClassicalAlchemyCore.pyropusBronzeIngot;
		armorTombBronze.customCraftingMaterial = ClassicalAlchemyCore.tombBronzeIngot;

		// loot
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(stannumIngot), 2,
				4, 2);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(stannumSword), 1,
				2, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(stannumPickaxe),
				1, 5, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(stannumShovel),
				2, 4, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(stannumAxe), 1,
				3, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(stannumIngot), 3,
				6, 2);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(stannumSword), 3,
				5, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(stannumPickaxe),
				2, 4, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(stannumAxe), 2,
				4, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(stannumHoe), 1,
				2, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(stannumHelm), 2,
				3, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(stannumChest), 2,
				4, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(stannumLegs), 2,
				3, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(stannumBoots), 2,
				3, 1);
		LootHelper
				.addLoot("dungeonChest", new ItemStack(stannumIngot), 3, 5, 2);
		LootHelper
				.addLoot("dungeonChest", new ItemStack(stannumSword), 2, 3, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(stannumPickaxe), 2, 3,
				1);
		LootHelper.addLoot("dungeonChest", new ItemStack(stannumShovel), 1, 1,
				1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(cuprumIngot), 2,
				4, 2);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(cuprumSword), 1,
				2, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(cuprumPickaxe),
				1, 5, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(cuprumShovel), 2,
				4, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(cuprumAxe), 1, 2,
				1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(cuprumIngot), 3,
				6, 2);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(cuprumSword), 3,
				5, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(cuprumPickaxe),
				2, 4, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(cuprumAxe), 2, 4,
				1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(cuprumHoe), 1, 2,
				1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(cuprumHelm), 2,
				3, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(cuprumChest), 2,
				4, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(cuprumLegs), 2,
				3, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(cuprumBoots), 2,
				3, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(cuprumIngot), 3, 5, 2);
		LootHelper.addLoot("dungeonChest", new ItemStack(cuprumSword), 2, 3, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(cuprumPickaxe), 2, 3,
				1);
		LootHelper
				.addLoot("dungeonChest", new ItemStack(cuprumShovel), 1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				pyropusBronzePickaxe), 3, 5, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				pyropusBronzeShovel), 2, 3, 1);
		LootHelper.addLoot("mineshaftCorridor",
				new ItemStack(pyropusBronzeAxe), 1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				pyropusBronzeIngot), 2, 3, 2);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				pyropusBronzeSword), 1, 3, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				pyropusBronzePickaxe), 2, 4, 1);
		LootHelper.addLoot("villageBlacksmith",
				new ItemStack(pyropusBronzeAxe), 2, 4, 1);
		LootHelper.addLoot("villageBlacksmith",
				new ItemStack(pyropusBronzeHoe), 1, 2, 1);
		LootHelper.addLoot("villageBlacksmith",
				new ItemStack(pyropusBronzeHelm), 1, 2, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				pyropusBronzeChest), 1, 2, 1);
		LootHelper.addLoot("villageBlacksmith",
				new ItemStack(pyropusBronzeLegs), 1, 2, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				pyropusBronzeBoots), 1, 2, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(pyropusBronzeIngot),
				3, 4, 3);
		LootHelper.addLoot("dungeonChest", new ItemStack(pyropusBronzeSword),
				1, 3, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(pyropusBronzePickaxe),
				1, 3, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(pyropusBronzeShovel),
				1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				pulchrumBronzePickaxe), 1, 3, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				pulchrumBronzeShovel), 1, 2, 1);
		LootHelper.addLoot("mineshaftCorridor",
				new ItemStack(pulchrumBronzeAxe), 1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				pulchrumBronzeIngot), 1, 3, 2);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				pulchrumBronzeSword), 1, 3, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				pulchrumBronzePickaxe), 1, 3, 1);
		LootHelper.addLoot("villageBlacksmith",
				new ItemStack(pulchrumBronzeAxe), 1, 2, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(pulchrumBronzeIngot),
				1, 2, 2);
		LootHelper.addLoot("dungeonChest", new ItemStack(pulchrumBronzeSword),
				1, 1, 1);
		LootHelper.addLoot("dungeonChest",
				new ItemStack(pulchrumBronzePickaxe), 1, 2, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(pulchrumBronzeShovel),
				1, 1, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				pulchrumBronzeIngot), 3, 9, 3);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				pulchrumBronzeSword), 1, 2, 2);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				pulchrumBronzePickaxe), 1, 2, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				pulchrumBronzeShovel), 6, 9, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				pulchrumBronzeIngot), 2, 4, 6);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				pulchrumBronzeSword), 1, 1, 2);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				pulchrumBronzePickaxe), 1, 2, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				pulchrumBronzeAxe), 4, 7, 2);
		LootHelper.addLoot("dungeonChest", new ItemStack(tombBronzeIngot), 1,
				2, 4);
		LootHelper.addLoot("dungeonChest", new ItemStack(tombBronzeHelm), 1, 3,
				1);
		LootHelper.addLoot("dungeonChest", new ItemStack(tombBronzeChest), 1,
				3, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(tombBronzeLegs), 1, 3,
				1);
		LootHelper.addLoot("dungeonChest", new ItemStack(tombBronzeBoots), 1,
				3, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(tombBronzeSword), 1,
				2, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(tombBronzePickaxe), 1,
				2, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(tombBronzeShovel), 1,
				2, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(tombBronzeAxe), 1, 2,
				1);
		LootHelper.addLoot("strongholdCorridor",
				new ItemStack(tombBronzeShovel), 1, 1, 1);
		LootHelper.addLoot("strongholdCorridor", new ItemStack(
				tombBronzePickaxe), 1, 1, 1);
		LootHelper.addLoot("strongholdCorridor",
				new ItemStack(tombBronzeSword), 1, 1, 1);
		LootHelper.addLoot("strongholdCrossing",
				new ItemStack(tombBronzeShovel), 1, 1, 1);
		LootHelper.addLoot("strongholdCrossing", new ItemStack(
				tombBronzePickaxe), 1, 1, 1);
		LootHelper.addLoot("strongholdLibrary", new ItemStack(tombBronzeSword),
				2, 4, 1);
		LootHelper.addLoot("strongholdLibrary", new ItemStack(tombBronzeHelm),
				4, 5, 1);
		LootHelper.addLoot("strongholdLibrary", new ItemStack(tombBronzeChest),
				4, 5, 1);
		LootHelper.addLoot("strongholdLibrary", new ItemStack(tombBronzeLegs),
				4, 5, 1);
		LootHelper.addLoot("strongholdLibrary", new ItemStack(tombBronzeBoots),
				4, 5, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(tombBronzeSword),
				1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor",
				new ItemStack(tombBronzePickaxe), 1, 2, 1);
		LootHelper.addLoot("mineshaftCorridor",
				new ItemStack(tombBronzeShovel), 1, 1, 1);
		LootHelper.addLoot("pyramidDesertyChest",
				new ItemStack(tombBronzeIngot), 3, 9, 3);
		LootHelper.addLoot("pyramidDesertyChest",
				new ItemStack(tombBronzeSword), 1, 3, 2);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				tombBronzePickaxe), 1, 7, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(tombBronzeAxe),
				1, 1, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				tombBronzeShovel), 5, 8, 1);
		LootHelper.addLoot("pyramidDesertyChest",
				new ItemStack(tombBronzeHelm), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest",
				new ItemStack(tombBronzeChest), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest",
				new ItemStack(tombBronzeLegs), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest",
				new ItemStack(tombBronzeBoots), 1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest",
				new ItemStack(tombBronzeIngot), 2, 4, 6);
		LootHelper.addLoot("pyramidJungleChest",
				new ItemStack(tombBronzeSword), 1, 1, 2);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				tombBronzePickaxe), 1, 2, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(tombBronzeAxe),
				3, 5, 2);

		// run tab icon call
		setTabIcons();

		// recipes
		ClassicalAlchemyRecipes.doCARecipes();
		if (itemizeMobs) {
			APIcore.instance.joinWorldModRegistry.add(new JoinWorldHandler());
		}
		MinecraftForge.EVENT_BUS.register(new HandlerArmor());

	} // end preInit()

	/**
	 * Do your mod setup. Build whatever data structures you care about.
	 */
	@EventHandler
	// used in 1.6.2
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();

		ClassicalAlchemyRecipes.craftTombBronze();
	} // end load()

	@EventHandler
	// used in 1.6.2
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
} // end class
