package akkamaddi.plugins.ClassicalAlchemy;

import akkamaddi.api.core.LootHelper;
import alexndr.api.content.blocks.SimpleBlock;
import alexndr.api.content.items.SimpleArmor;
import alexndr.api.content.items.SimpleAxe;
import alexndr.api.content.items.SimpleHoe;
import alexndr.api.content.items.SimpleItem;
import alexndr.api.content.items.SimplePickaxe;
import alexndr.api.content.items.SimpleShovel;
import alexndr.api.content.items.SimpleSword;
import alexndr.api.core.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Content 
{

	/**
	 * Loads all the Classical Alchemy content, by calling the methods below.
	 */
	public static void preInitialize()
	{
		try {
			doItems();
			LogHelper.verboseInfo(ModInfo.ID,
					"All items were added successfully");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Items were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
		try {
			doBlocks();
			LogHelper.verboseInfo(ModInfo.ID,
					"All blocks were added successfully");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Blocks were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
		try {
			doTools();
			LogHelper.verboseInfo(ModInfo.ID,
					"All tools were added successfully");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Tools were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
		try {
			doArmor();
			LogHelper.verboseInfo(ModInfo.ID,
					"All armor was added successfully");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Armor was not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
		//		try{doAchievements(); LogHelper.verboseInfo(ModInfo.ID, "All achievements were added successfully");}
//			catch(Exception e){LogHelper.severe(ModInfo.ID, "Achievements were not added successfully. This is a serious problem!"); e.printStackTrace();}
	} // end preInitialize()

	public static void doArmor() 
	{
		stannumHelm = new SimpleArmor(ClassicalAlchemy.armorStannum,  0)
				.modId("classicalalchemy").setType("stannum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumHelm");
		stannumChest = new SimpleArmor(ClassicalAlchemy.armorStannum,  1)
				.modId("classicalalchemy").setType("stannum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumChest");
		stannumLegs = new SimpleArmor(ClassicalAlchemy.armorStannum,  2)
				.modId("classicalalchemy").setType("stannum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumLegs");
		stannumBoots = new SimpleArmor(ClassicalAlchemy.armorStannum,  3)
				.modId("classicalalchemy").setType("stannum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumBoots");
		
		cuprumHelm = new SimpleArmor(ClassicalAlchemy.armorCuprum,  0)
				.modId("classicalalchemy").setType("cuprum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumHelm");
		cuprumChest = new SimpleArmor(ClassicalAlchemy.armorCuprum,  1)
				.modId("classicalalchemy").setType("cuprum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumChest");
		cuprumLegs = new SimpleArmor(ClassicalAlchemy.armorCuprum,  2)
				.modId("classicalalchemy").setType("cuprum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumLegs");
		cuprumBoots = new SimpleArmor(ClassicalAlchemy.armorCuprum,  3)
				.modId("classicalalchemy").setType("cuprum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumBoots");
		
		pyropusBronzeHelm = new SimpleArmor(
				ClassicalAlchemy.armorPyropusBronze, 0)
				.modId("classicalalchemy").setType("pyropusBronze")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeHelm");
		pyropusBronzeChest = new SimpleArmor(
				ClassicalAlchemy.armorPyropusBronze, 1)
				.modId("classicalalchemy").setType("pyropusBronze")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeChest");
		pyropusBronzeLegs = new SimpleArmor(
				ClassicalAlchemy.armorPyropusBronze, 2)
				.modId("classicalalchemy").setType("pyropusBronze")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeLegs");
		pyropusBronzeBoots = new SimpleArmor(
				ClassicalAlchemy.armorPyropusBronze, 3)
				.modId("classicalalchemy").setType("pyropusBronze")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeBoots");

		tombBronzeHelm = new SimpleArmor(ClassicalAlchemy.armorTombBronze, 0)
				.modId("classicalalchemy").setType("tombBronze")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeHelm");
		tombBronzeChest = new SimpleArmor(ClassicalAlchemy.armorTombBronze, 1)
				.modId("classicalalchemy").setType("tombBronze")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeChest");
		tombBronzeLegs = new SimpleArmor(ClassicalAlchemy.armorTombBronze, 2)
				.modId("classicalalchemy").setType("tombBronze")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeLegs");
		tombBronzeBoots = new SimpleArmor(ClassicalAlchemy.armorTombBronze, 3)
				.modId("classicalalchemy").setType("tombBronze")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeBoots");
		
	} // end doArmor()

	public static void doTools() 
	{
		stannumSword = new SimpleSword(ClassicalAlchemy.toolStannum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumSword");
		stannumShovel = new SimpleShovel(ClassicalAlchemy.toolStannum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumShovel");
		stannumAxe = new SimpleAxe(ClassicalAlchemy.toolStannum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumAxe");
		stannumPickaxe = new SimplePickaxe(ClassicalAlchemy.toolStannum)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumPickaxe");
		stannumHoe = new SimpleHoe(ClassicalAlchemy.toolStannum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumHoe");

		cuprumSword = new SimpleSword(ClassicalAlchemy.toolCuprum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumSword");
		cuprumShovel = new SimpleShovel(ClassicalAlchemy.toolCuprum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumShovel");
		cuprumAxe = new SimpleAxe(ClassicalAlchemy.toolCuprum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumAxe");
		cuprumPickaxe = new SimplePickaxe(ClassicalAlchemy.toolCuprum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumPickaxe");
		cuprumHoe = new SimpleHoe(ClassicalAlchemy.toolCuprum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumHoe");

		pyropusBronzeSword = new SimpleSword(ClassicalAlchemy.toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeSword");
		pyropusBronzeShovel = new SimpleShovel(ClassicalAlchemy.toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeShovel");
		pyropusBronzeAxe = new SimpleAxe(ClassicalAlchemy.toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeAxe");
		pyropusBronzePickaxe = new SimplePickaxe(ClassicalAlchemy.toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzePickaxe");
		pyropusBronzeHoe = new SimpleHoe(ClassicalAlchemy.toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeHoe");

		pulchrumBronzeSword = new SimpleSword(ClassicalAlchemy.toolPulchrumBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzeSword");
		pulchrumBronzeShovel = new SimpleShovel(ClassicalAlchemy.toolPulchrumBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzeShovel");
		pulchrumBronzeAxe = new SimpleAxe(ClassicalAlchemy.toolPulchrumBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzeAxe");
		pulchrumBronzePickaxe = new SimplePickaxe(ClassicalAlchemy.toolPulchrumBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzePickaxe");

		tombBronzeSword = new SimpleSword(ClassicalAlchemy.toolTombBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeSword");
		tombBronzeShovel = new SimpleShovel(ClassicalAlchemy.toolTombBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeShovel");
		tombBronzeAxe = new SimpleAxe(ClassicalAlchemy.toolTombBronze).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeAxe");
		tombBronzePickaxe = new SimplePickaxe(ClassicalAlchemy.toolTombBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzePickaxe");

	} // end doTools()

	public static void doBlocks() 
	{
		// define blocks
		blockStannum = new SimpleBlock(Material.iron).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setHardness(Settings.stannumHardness)
				.setResistance(Settings.stannumResistance)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockStannum");
		blockCuprum = new SimpleBlock(Material.iron).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setHardness(Settings.cuprumHardness)
				.setResistance(Settings.cuprumResistance)
				.setStepSound(Block.soundTypeMetal).setBlockName("blockCuprum");
		blockPyropusBronze = new SimpleBlock(Material.iron)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setHardness(Settings.pyropusBronzeHardness)
				.setResistance(Settings.pyropusBronzeResistance)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockPyropusBronze");
		blockPulchrumBronze = new SimpleBlock(Material.iron)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setHardness(Settings.pulchrumBronzeHardness)
				.setResistance(Settings.pulchrumBronzeResistance)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockPulchrumBronze");
		blockTombBronze = new SimpleBlock(Material.iron)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setHardness(Settings.tombBronzeHardness)
				.setResistance(Settings.tombBronzeResistance)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockTombBronze");

		blockStannum.setHarvestLevel("pickaxe", Settings.stannumHarvestLevel);
		blockCuprum.setHarvestLevel("pickaxe", Settings.cuprumHarvestLevel);
		blockPyropusBronze.setHarvestLevel("pickaxe", Settings.pyropusBronzeHarvestLevel);
		blockPulchrumBronze.setHarvestLevel("pickaxe", Settings.pulchrumBronzeHarvestLevel);
		blockTombBronze.setHarvestLevel("pickaxe", Settings.tombBronzeHarvestLevel);
		((SimpleBlock) blockStannum).setBeaconBase(true);
		((SimpleBlock) blockCuprum).setBeaconBase(true);
		((SimpleBlock) blockPyropusBronze).setBeaconBase(true);
		((SimpleBlock) blockPulchrumBronze).setBeaconBase(true);
		((SimpleBlock) blockTombBronze).setBeaconBase(true);
	} // end doBlocks()

	/**
	 * Loads SimpleOres 2 Items.
	 */
	public static void doItems()
	{
		// define items
		// Stannum
		stannumIngot = new SimpleItem().modId("classicalalchemy").isIngot()
				.isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumIngot");
		smallStannumChunkItem = new SimpleItem().modId("classicalalchemy")
				.isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("smallStannumChunkItem");
		mediumStannumChunkItem = new SimpleItem().modId("classicalalchemy")
				.isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("mediumStannumChunkItem");
		largeStannumChunkItem = new SimpleItem().modId("classicalalchemy")
				.isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largeStannumChunkItem");

		cuprumIngot = new SimpleItem().modId("classicalalchemy").isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumIngot");
		smallCuprumChunkItem = new SimpleItem().modId("classicalalchemy")
				.isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("smallCuprumChunkItem");
		mediumCuprumChunkItem = new SimpleItem().modId("classicalalchemy")
				.isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("mediumCuprumChunkItem");
		largeCuprumChunkItem = new SimpleItem().modId("classicalalchemy")
				.isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largeCuprumChunkItem");

		pyropusBronzeIngot = new SimpleItem().modId("classicalalchemy")
				.isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeIngot");
		smallPyropusBronzeChunkItem = new SimpleItem()
				.modId("classicalalchemy").isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("smallPyropusBronzeChunkItem");
		mediumPyropusBronzeChunkItem = new SimpleItem()
				.modId("classicalalchemy").isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("mediumPyropusBronzeChunkItem");
		largePyropusBronzeChunkItem = new SimpleItem()
				.modId("classicalalchemy").isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largePyropusBronzeChunkItem");

		pulchrumBronzeIngot = new SimpleItem().modId("classicalalchemy")
				.isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzeIngot");
		largePulchrumBronzeChunkItem = new SimpleItem()
				.modId("classicalalchemy").isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largePulchrumBronzeChunkItem");

		tombBronzeIngot = new SimpleItem().modId("classicalalchemy").isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeIngot");
		smallTombBronzeChunkItem = new SimpleItem().modId("classicalalchemy")
				.isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("smallTombBronzeChunkItem");
		mediumTombBronzeChunkItem = new SimpleItem().modId("classicalalchemy")
				.isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("mediumTombBronzeChunkItem");
		largeTombBronzeChunkItem = new SimpleItem().modId("classicalalchemy")
				.isIngot()
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largeTombBronzeChunkItem");

	} // end doItems()

	public static void setLoot() 
	{
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
	} // end setLoot()


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


} // end class Content
