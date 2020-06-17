package akkamaddi.plugins.ClassicalAlchemy;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import alexndr.api.core.LogHelper;
import alexndr.plugins.Fusion.FusionFurnaceRecipes;
import alexndr.plugins.Fusion.FusionMaterial;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 
{
	public static final SimpleArsenicContents SA = new SimpleArsenicContents();

	public static void preInitialize()
	{
		try {
			addOreDictEntries();
			LogHelper.verboseInfo(ModInfo.ID,
					"All OreDictionary entries were added successfully.");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
			 "OreDictionary entries were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
	} // end preInitialize()
	
	
	public static void initialize()
	{
		try {
			addRecipes();
			LogHelper.verboseInfo(ModInfo.ID,
					"All recipes were added successfully.");
		} catch (Exception e) {
			LogHelper.severe(ModInfo.ID,
							"Recipes were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
	} // end initialize()
	
	public static void addOreDictEntries()
	{
		// Ore Dictionary
		OreDictionary.registerOre("ingotStannum", new ItemStack(
				Content.stannumIngot));
		OreDictionary.registerOre("ingotCuprum", new ItemStack(
				Content.cuprumIngot));
		OreDictionary.registerOre("ingotPyropusBronze", new ItemStack(
				Content.pyropusBronzeIngot));
		OreDictionary.registerOre("ingotPulchrumBronze", new ItemStack(
				Content.pulchrumBronzeIngot));
		OreDictionary.registerOre("ingotTombBronze", new ItemStack(
				Content.tombBronzeIngot));
	} // end addOreDictEntries()

	@SuppressWarnings("unchecked")
	public static void addRecipes() 
	{

		// recipes: Crafting
		// Storage Block
		GameRegistry.addRecipe(new ItemStack(Content.blockStannum,
				1), new Object[] { "AAA", "AAA", "AAA", 'A',
				Content.stannumIngot });
		GameRegistry.addRecipe(new ItemStack(Content.blockCuprum,
				1), new Object[] { "AAA", "AAA", "AAA", 'A',
				Content.cuprumIngot });
		GameRegistry.addRecipe(new ItemStack(
				Content.blockPyropusBronze, 1), new Object[] {
				"AAA", "AAA", "AAA", 'A',
				Content.pyropusBronzeIngot });
		GameRegistry.addRecipe(new ItemStack(
				Content.blockPulchrumBronze, 1), new Object[] {
				"AAA", "AAA", "AAA", 'A',
				Content.pulchrumBronzeIngot });
		GameRegistry.addRecipe(new ItemStack(
				Content.blockTombBronze, 1), new Object[] { "AAA",
				"AAA", "AAA", 'A', Content.tombBronzeIngot });

		// Item Recipe
		// Ingot Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.stannumIngot, 9),
				new Object[] { Content.blockStannum });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.cuprumIngot, 9),
				new Object[] { Content.blockCuprum });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.pyropusBronzeIngot, 9),
				new Object[] { Content.blockPyropusBronze });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.pulchrumBronzeIngot, 9),
				new Object[] { Content.blockPulchrumBronze });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.tombBronzeIngot, 9),
				new Object[] { Content.blockTombBronze });

		// Tools
		// Stannum Tool Recipes
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.stannumPickaxe,
						true, new Object[] { "XXX", " Y ", " Y ", 'X',
								"ingotStannum", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.stannumAxe, true,
						new Object[] { "XX ", "XY ", " Y ", 'X',
								"ingotStannum", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.stannumShovel,
						true, new Object[] { "X", "Y", "Y", 'X',
								"ingotStannum", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.stannumSword,
						true, new Object[] { "X", "X", "Y", 'X',
								"ingotStannum", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.stannumHoe, true,
						new Object[] { "XX ", " Y ", " Y ", 'X',
								"ingotStannum", 'Y', "stickWood" }));

		// Stannum Armor
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.stannumHelm,
						true,
						new Object[] { "XXX", "X X", 'X', "ingotStannum" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.stannumChest,
						true, new Object[] { "X X", "XXX", "XXX", 'X',
								"ingotStannum" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.stannumLegs,
						true, new Object[] { "XXX", "X X", "X X", 'X',
								"ingotStannum" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.stannumBoots,
						true,
						new Object[] { "X X", "X X", 'X', "ingotStannum" }));

		// Stannum chunks
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeStannumChunkItem, 1), new Object[] {
				Content.smallStannumChunkItem,
				Content.smallStannumChunkItem,
				Content.smallStannumChunkItem,
				Content.smallStannumChunkItem,
				Content.smallStannumChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeStannumChunkItem, 1), new Object[] {
				Content.mediumStannumChunkItem,
				Content.mediumStannumChunkItem,
				Content.mediumStannumChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeStannumChunkItem, 1), new Object[] {
				Content.mediumStannumChunkItem,
				Content.mediumStannumChunkItem,
				Content.smallStannumChunkItem,
				Content.smallStannumChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.mediumStannumChunkItem, 1), new Object[] {
				Content.smallStannumChunkItem,
				Content.smallStannumChunkItem,
				Content.smallStannumChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.mediumStannumChunkItem, 2),
				new Object[] { Content.largeStannumChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.smallStannumChunkItem, 2),
				new Object[] { Content.mediumStannumChunkItem });

		// Cuprum Tool Recipes
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.cuprumPickaxe,
						true, new Object[] { "XXX", " Y ", " Y ", 'X',
								"ingotCuprum", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.cuprumAxe, true,
						new Object[] { "XX ", "XY ", " Y ", 'X', "ingotCuprum",
								'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.cuprumShovel,
						true, new Object[] { "X", "Y", "Y", 'X', "ingotCuprum",
								'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.cuprumSword,
						true, new Object[] { "X", "X", "Y", 'X', "ingotCuprum",
								'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.cuprumHoe, true,
						new Object[] { "XX ", " Y ", " Y ", 'X', "ingotCuprum",
								'Y', "stickWood" }));

		// Cuprum Armor
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.cuprumHelm, true,
						new Object[] { "XXX", "X X", 'X', "ingotCuprum" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.cuprumChest,
						true, new Object[] { "X X", "XXX", "XXX", 'X',
								"ingotCuprum" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(
						Content.cuprumLegs,
						true,
						new Object[] { "XXX", "X X", "X X", 'X', "ingotCuprum" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.cuprumBoots,
						true, new Object[] { "X X", "X X", 'X', "ingotCuprum" }));

		// Cuprum chunks
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeCuprumChunkItem, 1), new Object[] {
				Content.smallCuprumChunkItem,
				Content.smallCuprumChunkItem,
				Content.smallCuprumChunkItem,
				Content.smallCuprumChunkItem,
				Content.smallCuprumChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeCuprumChunkItem, 1), new Object[] {
				Content.mediumCuprumChunkItem,
				Content.mediumCuprumChunkItem,
				Content.mediumCuprumChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeCuprumChunkItem, 1), new Object[] {
				Content.mediumCuprumChunkItem,
				Content.mediumCuprumChunkItem,
				Content.smallCuprumChunkItem,
				Content.smallCuprumChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.mediumCuprumChunkItem, 1), new Object[] {
				Content.smallCuprumChunkItem,
				Content.smallCuprumChunkItem,
				Content.smallCuprumChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.mediumCuprumChunkItem, 2),
				new Object[] { Content.largeCuprumChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.smallCuprumChunkItem, 2),
				new Object[] { Content.mediumCuprumChunkItem });

		// Pyropus Bronze Tool Recipes
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(
						Content.pyropusBronzePickaxe, true,
						new Object[] { "XXX", " Y ", " Y ", 'X',
								"ingotPyropusBronze", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.pyropusBronzeAxe,
						true, new Object[] { "XX ", "XY ", " Y ", 'X',
								"ingotPyropusBronze", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(
						Content.pyropusBronzeShovel, true,
						new Object[] { "X", "Y", "Y", 'X',
								"ingotPyropusBronze", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(
						Content.pyropusBronzeSword, true,
						new Object[] { "X", "X", "Y", 'X',
								"ingotPyropusBronze", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.pyropusBronzeHoe,
						true, new Object[] { "XX ", " Y ", " Y ", 'X',
								"ingotPyropusBronze", 'Y', "stickWood" }));

		// PyropusBronze Armor
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(
						Content.pyropusBronzeHelm,
						true,
						new Object[] { "XXX", "X X", 'X', "ingotPyropusBronze" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(
						Content.pyropusBronzeChest, true,
						new Object[] { "X X", "XXX", "XXX", 'X',
								"ingotPyropusBronze" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(
						Content.pyropusBronzeLegs, true,
						new Object[] { "XXX", "X X", "X X", 'X',
								"ingotPyropusBronze" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(
						Content.pyropusBronzeBoots,
						true,
						new Object[] { "X X", "X X", 'X', "ingotPyropusBronze" }));

		// PyropusBronze chunks
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largePyropusBronzeChunkItem, 1),
				new Object[] {
						Content.smallPyropusBronzeChunkItem,
						Content.smallPyropusBronzeChunkItem,
						Content.smallPyropusBronzeChunkItem,
						Content.smallPyropusBronzeChunkItem,
						Content.smallPyropusBronzeChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largePyropusBronzeChunkItem, 1),
				new Object[] {
						Content.mediumPyropusBronzeChunkItem,
						Content.mediumPyropusBronzeChunkItem,
						Content.mediumPyropusBronzeChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largePyropusBronzeChunkItem, 1),
				new Object[] {
						Content.mediumPyropusBronzeChunkItem,
						Content.mediumPyropusBronzeChunkItem,
						Content.smallPyropusBronzeChunkItem,
						Content.smallPyropusBronzeChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.mediumPyropusBronzeChunkItem, 1),
				new Object[] {
						Content.smallPyropusBronzeChunkItem,
						Content.smallPyropusBronzeChunkItem,
						Content.smallPyropusBronzeChunkItem });
		GameRegistry
				.addShapelessRecipe(
						new ItemStack(
								Content.mediumPyropusBronzeChunkItem,
								2),
						new Object[] { Content.largePyropusBronzeChunkItem });
		GameRegistry
				.addShapelessRecipe(
						new ItemStack(
								Content.smallPyropusBronzeChunkItem,
								2),
						new Object[] { Content.mediumPyropusBronzeChunkItem });

		// Pulchrum Bronze Tool Recipes
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(
						Content.pulchrumBronzePickaxe, true,
						new Object[] { "XXX", " Y ", " Y ", 'X',
								"ingotPulchrumBronze", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(
						Content.pulchrumBronzeAxe, true,
						new Object[] { "XX ", "XY ", " Y ", 'X',
								"ingotPulchrumBronze", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(
						Content.pulchrumBronzeShovel, true,
						new Object[] { "X", "Y", "Y", 'X',
								"ingotPulchrumBronze", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(
						Content.pulchrumBronzeSword, true,
						new Object[] { "X", "X", "Y", 'X',
								"ingotPulchrumBronze", 'Y', "stickWood" }));

		// Tomb Bronze Tool Recipes
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(
						Content.tombBronzePickaxe, true,
						new Object[] { "XXX", " Y ", " Y ", 'X',
								"ingotTombBronze", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.tombBronzeAxe,
						true, new Object[] { "XX ", "XY ", " Y ", 'X',
								"ingotTombBronze", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.tombBronzeShovel,
						true, new Object[] { "X", "Y", "Y", 'X',
								"ingotTombBronze", 'Y', "stickWood" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.tombBronzeSword,
						true, new Object[] { "X", "X", "Y", 'X',
								"ingotTombBronze", 'Y', "stickWood" }));

		// TombBronze Armor
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.tombBronzeHelm,
						true, new Object[] { "XXX", "X X", 'X',
								"ingotTombBronze" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.tombBronzeChest,
						true, new Object[] { "X X", "XXX", "XXX", 'X',
								"ingotTombBronze" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.tombBronzeLegs,
						true, new Object[] { "XXX", "X X", "X X", 'X',
								"ingotTombBronze" }));
		CraftingManager
				.getInstance()
				.getRecipeList()
				.add(new ShapedOreRecipe(Content.tombBronzeBoots,
						true, new Object[] { "X X", "X X", 'X',
								"ingotTombBronze" }));

		// TombBronze chunks
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeTombBronzeChunkItem, 1),
				new Object[] { Content.smallTombBronzeChunkItem,
						Content.smallTombBronzeChunkItem,
						Content.smallTombBronzeChunkItem,
						Content.smallTombBronzeChunkItem,
						Content.smallTombBronzeChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeTombBronzeChunkItem, 1),
				new Object[] { Content.mediumTombBronzeChunkItem,
						Content.mediumTombBronzeChunkItem,
						Content.mediumTombBronzeChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.largeTombBronzeChunkItem, 1),
				new Object[] { Content.mediumTombBronzeChunkItem,
						Content.mediumTombBronzeChunkItem,
						Content.smallTombBronzeChunkItem,
						Content.smallTombBronzeChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.mediumTombBronzeChunkItem, 1),
				new Object[] { Content.smallTombBronzeChunkItem,
						Content.smallTombBronzeChunkItem,
						Content.smallTombBronzeChunkItem });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.mediumTombBronzeChunkItem, 2),
				new Object[] { Content.largeTombBronzeChunkItem });
		GameRegistry
				.addShapelessRecipe(
						new ItemStack(
								Content.smallTombBronzeChunkItem,
								2),
						new Object[] { Content.mediumTombBronzeChunkItem });

		// recipes: Smelting
		GameRegistry.addSmelting(
				Content.largeStannumChunkItem,
				new ItemStack(Content.stannumIngot), 1.0F);
		GameRegistry.addSmelting(
				Content.largeCuprumChunkItem,
				new ItemStack(Content.cuprumIngot), 1.0F);
		GameRegistry.addSmelting(
				Content.largePyropusBronzeChunkItem,
				new ItemStack(Content.pyropusBronzeIngot), 1.4F);
		GameRegistry.addSmelting(
				Content.largePulchrumBronzeChunkItem,
				new ItemStack(Content.pulchrumBronzeIngot), 2.0F);
		GameRegistry.addSmelting(
				Content.largeTombBronzeChunkItem,
				new ItemStack(Content.tombBronzeIngot), 3.0F);

		// Fusion Furnace
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotTin"),
				FusionMaterial.of("ingotTin"),
				FusionMaterial.of(Items.coal, 1, OreDictionary.WILDCARD_VALUE), 
				new ItemStack(Content.smallStannumChunkItem),0.4F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotTin"),
				FusionMaterial.of("ingotTin"),
				FusionMaterial.of(Items.dye, 1, 15), 
				new ItemStack(Content.mediumStannumChunkItem), 0.8F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotTin"),
				FusionMaterial.of("ingotTin"),
				FusionMaterial.of(Items.gunpowder), 
				new ItemStack(Content.largeStannumChunkItem), 1.2F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotCopper"),
				FusionMaterial.of("ingotCopper"),
				FusionMaterial.of(Items.coal, 1, OreDictionary.WILDCARD_VALUE), 
				new ItemStack( Content.smallCuprumChunkItem), 1.0F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotCopper"),
				FusionMaterial.of("ingotCopper"),
				FusionMaterial.of(Items.dye, 1, 15), 
				new ItemStack(Content.mediumCuprumChunkItem), 2.0F);
		FusionFurnaceRecipes.addSmelting(
				FusionMaterial.of("ingotCopper"),
				FusionMaterial.of("ingotCopper"),
				FusionMaterial.of(Items.gunpowder), 
				new ItemStack(Content.largeCuprumChunkItem), 5.0F);
		FusionFurnaceRecipes.addSmelting(
				new ItemStack(Content.stannumIngot), 
				new ItemStack(Content.cuprumIngot), 
				new ItemStack(Items.dye, 1, 15), 
				new ItemStack(Content.smallPyropusBronzeChunkItem), 3.0F);
		FusionFurnaceRecipes.addSmelting(
				new ItemStack(Content.stannumIngot), 
				new ItemStack(Content.cuprumIngot),
				new ItemStack(Items.gunpowder), 
				new ItemStack(Content.mediumPyropusBronzeChunkItem),
				5.0F);
		FusionFurnaceRecipes.addSmelting(
				new ItemStack(Content.stannumIngot), 
				new ItemStack(Content.cuprumIngot),
				new ItemStack(Items.redstone), 
				new ItemStack(Content.largePyropusBronzeChunkItem),
				16.0F);
		FusionFurnaceRecipes.addSmelting(
				new ItemStack(Content.pyropusBronzeIngot), 
				new ItemStack(Items.gold_ingot), 
				new ItemStack(Items.redstone), 
				new ItemStack(Content.largePulchrumBronzeChunkItem), 16.0F);

		// Recycling

		if (Settings.enableRecycling) {
			// Stannum
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.stannumHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeStannumChunkItem),
					7.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.stannumChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.largeStannumChunkItem, 2, 0), 14.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.stannumLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.largeStannumChunkItem, 2, 0), 14.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.stannumBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeStannumChunkItem),
					7.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.stannumSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeStannumChunkItem),
					7.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.stannumShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeStannumChunkItem),
					7.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.stannumPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeStannumChunkItem),
					7.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.stannumAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeStannumChunkItem),
					7.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.stannumHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeStannumChunkItem),
					7.0F);
			// Cuprum
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cuprumHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeCuprumChunkItem),
					7.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cuprumChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.largeCuprumChunkItem, 2, 0), 14.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cuprumLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.largeCuprumChunkItem, 2, 0), 14.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cuprumBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeCuprumChunkItem),
					7.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cuprumSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeCuprumChunkItem),
					7.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cuprumShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeCuprumChunkItem),
					7.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cuprumPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeCuprumChunkItem),
					7.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cuprumAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeCuprumChunkItem),
					7.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.cuprumHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(Content.largeCuprumChunkItem),
					7.0F);
			// Pyropus Bronze
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.pyropusBronzeHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largePyropusBronzeChunkItem),
					10.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.pyropusBronzeChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.largePyropusBronzeChunkItem, 2, 0),
					20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.pyropusBronzeLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					Content.largePyropusBronzeChunkItem, 2, 0),
					20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.pyropusBronzeBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largePyropusBronzeChunkItem),
					10.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.pyropusBronzeSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largePyropusBronzeChunkItem),
					10.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.pyropusBronzeShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largePyropusBronzeChunkItem),
					10.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.pyropusBronzePickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largePyropusBronzeChunkItem),
					10.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.pyropusBronzeAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largePyropusBronzeChunkItem),
					10.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.pyropusBronzeHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largePyropusBronzeChunkItem),
					10.0F);
			// Pulchrum Bronze
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.pulchrumBronzeSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largePulchrumBronzeChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.pulchrumBronzeShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largePulchrumBronzeChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.pulchrumBronzePickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largePulchrumBronzeChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.pulchrumBronzeAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							Content.largePulchrumBronzeChunkItem),
					15.0F);
			// Tomb Bronze
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tombBronzeHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.rotten_flesh), new ItemStack(
							Content.largeTombBronzeChunkItem),
					15.0F);
			FusionFurnaceRecipes
					.addSmelting(
							new ItemStack(Content.tombBronzeChest,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel, 2, 0),
							new ItemStack(Items.rotten_flesh),
							new ItemStack(
									Content.largeTombBronzeChunkItem,
									2, 0), 30.0F);
			FusionFurnaceRecipes
					.addSmelting(
							new ItemStack(Content.tombBronzeLegs,
									1, OreDictionary.WILDCARD_VALUE),
							new ItemStack(Blocks.gravel, 2, 0),
							new ItemStack(Items.rotten_flesh),
							new ItemStack(
									Content.largeTombBronzeChunkItem,
									2, 0), 30.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tombBronzeBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.rotten_flesh), new ItemStack(
							Content.largeTombBronzeChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tombBronzeSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.rotten_flesh), new ItemStack(
							Content.largeTombBronzeChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tombBronzeShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.rotten_flesh), new ItemStack(
							Content.largeTombBronzeChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tombBronzePickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.rotten_flesh), new ItemStack(
							Content.largeTombBronzeChunkItem),
					15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(
					Content.tombBronzeAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.rotten_flesh), new ItemStack(
							Content.largeTombBronzeChunkItem),
					15.0F);
		}
	}

	public static void craftTombBronze() 
	{
		if (SA.isModLoaded()) 
		{
			// new ItemStack(SA.arsenicIngot.get())
			FusionFurnaceRecipes.addSmelting(
					FusionMaterial.of(Content.pyropusBronzeIngot), 
					FusionMaterial.of("ingotArsenideBronze"), 
					FusionMaterial.of(Items.rotten_flesh), 
					new ItemStack(Content.smallTombBronzeChunkItem), 6.0F);
			
			FusionFurnaceRecipes.addSmelting(
					FusionMaterial.of(Content.pyropusBronzeIngot), 
					FusionMaterial.of("ingotArsenideBronze"), 
					FusionMaterial.of(Items.redstone),
					new ItemStack(Content.mediumTombBronzeChunkItem),
					12.0F);
			FusionFurnaceRecipes.addSmelting(
					FusionMaterial.of(Content.pyropusBronzeIngot), 
					FusionMaterial.of("ingotArsenideBronze"), 
					FusionMaterial.of(Items.glowstone_dust),
					new ItemStack(Content.largeTombBronzeChunkItem),
							20.0F);
			FusionFurnaceRecipes.addSmelting(
					FusionMaterial.of(Content.pyropusBronzeIngot), 
					FusionMaterial.of("ingotArsenideBronze"), 
					FusionMaterial.of(SA.oldLaceChest.get()),
					new ItemStack(Content.largeTombBronzeChunkItem),
							20.0F);
		} // end-if modLoadead
	} // end craftTombBronze()
} // end class Recipes
