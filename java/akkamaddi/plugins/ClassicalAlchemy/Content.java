package akkamaddi.plugins.ClassicalAlchemy;

import alexndr.api.content.blocks.SimpleBlock;
import alexndr.api.content.items.SimpleItem;
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
		stannumHelm = new SimpleArmor(armorStannum, rendererStannum, 0)
				.modId("classicalalchemy").setType("stannum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumHelm");
		stannumChest = new SimpleArmor(armorStannum, rendererStannum, 1)
				.modId("classicalalchemy").setType("stannum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumChest");
		stannumLegs = new SimpleArmor(armorStannum, rendererStannum, 2)
				.modId("classicalalchemy").setType("stannum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumLegs");
		stannumBoots = new SimpleArmor(armorStannum, rendererStannum, 3)
				.modId("classicalalchemy").setType("stannum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumBoots");
		
		cuprumHelm = new SimpleArmor(armorCuprum, rendererCuprum, 0)
				.modId("classicalalchemy").setType("cuprum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumHelm");
		cuprumChest = new SimpleArmor(armorCuprum, rendererCuprum, 1)
				.modId("classicalalchemy").setType("cuprum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumChest");
		cuprumLegs = new SimpleArmor(armorCuprum, rendererCuprum, 2)
				.modId("classicalalchemy").setType("cuprum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumLegs");
		cuprumBoots = new SimpleArmor(armorCuprum, rendererCuprum, 3)
				.modId("classicalalchemy").setType("cuprum")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumBoots");
		
		pyropusBronzeHelm = new SimpleArmor(armorPyropusBronze,
				rendererPyropusBronze, 0)
				.modId("classicalalchemy")
				.setType("pyropusBronze")
				.setCreativeTab(
						ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeHelm");
		pyropusBronzeChest = new SimpleArmor(armorPyropusBronze,
				rendererPyropusBronze, 1)
				.modId("classicalalchemy")
				.setType("pyropusBronze")
				.setCreativeTab(
						ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeChest");
		pyropusBronzeLegs = new SimpleArmor(armorPyropusBronze,
				rendererPyropusBronze, 2)
				.modId("classicalalchemy")
				.setType("pyropusBronze")
				.setCreativeTab(
						ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeLegs");
		pyropusBronzeBoots = new SimpleArmor(armorPyropusBronze,
				rendererPyropusBronze, 3)
				.modId("classicalalchemy")
				.setType("pyropusBronze")
				.setCreativeTab(
						ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeBoots");
		
		tombBronzeHelm = new SimpleArmor(armorTombBronze, rendererTombBronze, 0)
				.modId("classicalalchemy").setType("tombBronze")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeHelm");
		tombBronzeChest = new SimpleArmor(armorTombBronze, rendererTombBronze,
				1).modId("classicalalchemy").setType("tombBronze")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeChest");
		tombBronzeLegs = new SimpleArmor(armorTombBronze, rendererTombBronze, 2)
				.modId("classicalalchemy").setType("tombBronze")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeLegs");
		tombBronzeBoots = new SimpleArmor(armorTombBronze, rendererTombBronze,
				3).modId("classicalalchemy").setType("tombBronze")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeBoots");
		
	} // end doArmor()

	public static void doTools() 
	{
		stannumSword = new SimpleSword(toolStannum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumSword");
		stannumShovel = new SimpleShovel(toolStannum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumShovel");
		stannumAxe = new SimpleAxe(toolStannum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumAxe");
		stannumPickaxe = new SimplePickaxe(toolStannum)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumPickaxe");
		stannumHoe = new SimpleHoe(toolStannum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumHoe");

		cuprumSword = new SimpleSword(toolCuprum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumSword");
		cuprumShovel = new SimpleShovel(toolCuprum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumShovel");
		cuprumAxe = new SimpleAxe(toolCuprum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumAxe");
		cuprumPickaxe = new SimplePickaxe(toolCuprum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumPickaxe");
		cuprumHoe = new SimpleHoe(toolCuprum).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumHoe");

		pyropusBronzeSword = new SimpleSword(toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeSword");
		pyropusBronzeShovel = new SimpleShovel(toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeShovel");
		pyropusBronzeAxe = new SimpleAxe(toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeAxe");
		pyropusBronzePickaxe = new SimplePickaxe(toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzePickaxe");
		pyropusBronzeHoe = new SimpleHoe(toolPyropusBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeHoe");

		pulchrumBronzeSword = new SimpleSword(toolPulchrumBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzeSword");
		pulchrumBronzeShovel = new SimpleShovel(toolPulchrumBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzeShovel");
		pulchrumBronzeAxe = new SimpleAxe(toolPulchrumBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzeAxe");
		pulchrumBronzePickaxe = new SimplePickaxe(toolPulchrumBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzePickaxe");

		tombBronzeSword = new SimpleSword(toolTombBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeSword");
		tombBronzeShovel = new SimpleShovel(toolTombBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeShovel");
		tombBronzeAxe = new SimpleAxe(toolTombBronze).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeAxe");
		tombBronzePickaxe = new SimplePickaxe(toolTombBronze)
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzePickaxe");

	} // end doTools()

	public static void doBlocks() 
	{
		// define blocks
		blockStannum = new SimpleBlock(Material.iron)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setHardness(4.0F).setResistance(8.0F)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockStannum");
		blockCuprum = new SimpleBlock(Material.iron)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setHardness(8.0F).setResistance(16.0F)
				.setStepSound(Block.soundTypeMetal).setBlockName("blockCuprum");
		blockPyropusBronze = new SimpleBlock(Material.iron)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setHardness(10.0F).setResistance(18.0F)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockPyropusBronze");
		blockPulchrumBronze = new SimpleBlock(Material.iron)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setHardness(8.0F).setResistance(20.0F)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockPulchrumBronze");
		blockTombBronze = new SimpleBlock(Material.iron)
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setHardness(12.0F).setResistance(24.0F)
				.setStepSound(Block.soundTypeMetal)
				.setBlockName("blockTombBronze");

		blockStannum.setHarvestLevel("pickaxe", 0);
		blockCuprum.setHarvestLevel("pickaxe", 0);
		blockPyropusBronze.setHarvestLevel("pickaxe", 0);
		blockPulchrumBronze.setHarvestLevel("pickaxe", 0);
		blockTombBronze.setHarvestLevel("pickaxe", 0);
		((SimpleBlock) blockStannum).setAsBeaconBase(true);
		((SimpleBlock) blockCuprum).setAsBeaconBase(true);
		((SimpleBlock) blockPyropusBronze).setAsBeaconBase(true);
		((SimpleBlock) blockPulchrumBronze).setAsBeaconBase(true);
		((SimpleBlock) blockTombBronze).setAsBeaconBase(true);
	} // end doBlocks()

	/**
	 * Loads SimpleOres 2 Items.
	 */
	public static void doItems()
	{
		// define items
		// Stannum
		stannumIngot = new SimpleItem()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("stannumIngot");
		smallStannumChunkItem = new SimpleItem()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("smallStannumChunkItem");
		mediumStannumChunkItem = new SimpleItem()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("mediumStannumChunkItem");
		largeStannumChunkItem = new SimpleItem()
				.modId("classicalalchemy")
				.setCreativeTab(
						ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largeStannumChunkItem");
		
		cuprumIngot = new SimpleIngot().modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("cuprumIngot");
		smallCuprumChunkItem = new SimpleIngot().modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("smallCuprumChunkItem");
		mediumCuprumChunkItem = new SimpleIngot().modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("mediumCuprumChunkItem");
		largeCuprumChunkItem = new SimpleIngot().modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largeCuprumChunkItem");
		
		pyropusBronzeIngot = new SimpleIngot().modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pyropusBronzeIngot");
		smallPyropusBronzeChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("smallPyropusBronzeChunkItem");
		mediumPyropusBronzeChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("mediumPyropusBronzeChunkItem");
		largePyropusBronzeChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largePyropusBronzeChunkItem");
	
		pulchrumBronzeIngot = new SimpleIngot().modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("pulchrumBronzeIngot");
		largePulchrumBronzeChunkItem = new SimpleIngot()
				.modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("largePulchrumBronzeChunkItem");
		
		tombBronzeIngot = new SimpleIngot().modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("tombBronzeIngot");
		smallTombBronzeChunkItem = new SimpleIngot().modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("smallTombBronzeChunkItem");
		mediumTombBronzeChunkItem = new SimpleIngot().modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemy.tabAkkamaddiClassicalAlchemy)
				.setUnlocalizedName("mediumTombBronzeChunkItem");
		largeTombBronzeChunkItem = new SimpleIngot().modId("classicalalchemy")
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
