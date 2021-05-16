package mod.akkamaddi.classicalalchemy.datagen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import mod.akkamaddi.classicalalchemy.config.ClassicalAlchemyConfig;
import mod.akkamaddi.classicalalchemy.init.ModItems;
import mod.akkamaddi.classicalalchemy.init.ModTags;
import mod.alexndr.fusion.api.datagen.FusionRecipeSetBuilder;
import mod.alexndr.fusion.api.recipe.AbstractFusionRecipeProvider;
import mod.alexndr.simplecorelib.datagen.ISimpleConditionBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class FusionRecipes extends AbstractFusionRecipeProvider implements IConditionBuilder, ISimpleConditionBuilder
{
    private FusionRecipeSetBuilder fusionbuilder;

    public FusionRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
        fusionbuilder = new FusionRecipeSetBuilder(ClassicalAlchemy.MODID);
    }

    
    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer)
    {
        registerCuprumRecipes(consumer);
        registerStannumRecipes(consumer);
        registerPyropusBronzeRecipes(consumer);
        registerPulchrumBronzeRecipes(consumer);
        registerTombBronzeRecipes(consumer);
    }

    /**
     * Cuprum alloying and fusion recycling recipes.
     */
    protected void registerCuprumRecipes(Consumer<IFinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_COPPER));
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_COPPER));
        catalysts[0] = Ingredient.of(ItemTags.COALS);
        catalysts[1] = Ingredient.of(Items.BONE_MEAL);
        catalysts[2] = Ingredient.of(Items.GUNPOWDER);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                ModItems.cuprum_nugget.get(), ModItems.medium_cuprum_chunk.get(), ModItems.large_cuprum_chunk.get(),
                1.0F, 600, flag("cuprum_making"));
        
        // cuprum fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.cuprum_axe.get(), 
                ModItems.cuprum_boots.get(), ModItems.cuprum_helmet.get(),
                ModItems.cuprum_hoe.get(), ModItems.cuprum_pickaxe.get(),
                ModItems.cuprum_shovel.get(), ModItems.cuprum_sword.get()),
                Ingredient.of(ModItems.cuprum_chestplate.get(), ModItems.cuprum_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.cuprum_ingot.get(), 7.0F, 600, flag("recycling_enabled"), "recycle_cuprum_items");
    } // end registerCuprumRecipes

    /**
     * Stannum alloying and fusion recycling recipes.
     */
    protected void registerStannumRecipes(Consumer<IFinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_TIN));
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_TIN));
        catalysts[0] = Ingredient.of(ItemTags.COALS);
        catalysts[1] = Ingredient.of(Items.BONE_MEAL);
        catalysts[2] = Ingredient.of(Items.GUNPOWDER);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                ModItems.stannum_nugget.get(), ModItems.medium_stannum_chunk.get(), ModItems.large_stannum_chunk.get(),
                0.4F, 600, flag("stannum_making"));
        
        // stannum fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.stannum_axe.get(), 
                ModItems.stannum_boots.get(), ModItems.stannum_helmet.get(),
                ModItems.stannum_hoe.get(), ModItems.stannum_pickaxe.get(),
                ModItems.stannum_shovel.get(), ModItems.stannum_sword.get()),
                Ingredient.of(ModItems.stannum_chestplate.get(), ModItems.stannum_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.stannum_ingot.get(), 7.0F, 600, flag("recycling_enabled"), "recycle_stannum_items");
    } // end registerStannumRecipes

    /**
     * Pyropus Bronze alloying and fusion recycling recipes.
     */
    protected void registerPyropusBronzeRecipes(Consumer<IFinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(ModItems.cuprum_ingot.get()));
        primary_inputs.add(Ingredient.of(ModItems.stannum_ingot.get()));
        catalysts[0] = Ingredient.of(Items.BONE_MEAL);
        catalysts[1] = Ingredient.of(Items.GUNPOWDER);
        catalysts[2] = Ingredient.of(Items.REDSTONE);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                ModItems.pyropus_bronze_nugget.get(), ModItems.medium_pyropus_bronze_chunk.get(), ModItems.large_pyropus_bronze_chunk.get(),
                3.0F, 600, flag("pyropus_bronze_making"));
        
        // pyropus_bronze fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.pyropus_bronze_axe.get(), 
                ModItems.pyropus_bronze_boots.get(), ModItems.pyropus_bronze_helmet.get(),
                ModItems.pyropus_bronze_hoe.get(), ModItems.pyropus_bronze_pickaxe.get(),
                ModItems.pyropus_bronze_shovel.get(), ModItems.pyropus_bronze_sword.get()),
                Ingredient.of(ModItems.pyropus_bronze_chestplate.get(), ModItems.pyropus_bronze_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.pyropus_bronze_ingot.get(), 10.0F, 600, flag("recycling_enabled"), "recycle_pyropus_bronze_items");
    } // end registerPyropusBronzeRecipes

    
    /**
     * Pulchrum Bronze alloying and fusion recycling recipes.
     */
    protected void registerPulchrumBronzeRecipes(Consumer<IFinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(ModItems.pyropus_bronze_ingot.get()));
        primary_inputs.add(Ingredient.of(Items.GOLD_INGOT));
        catalysts[0] = null;
        catalysts[1] = null;
        catalysts[2] = Ingredient.of(Items.REDSTONE);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                null, null, ModItems.large_pulchrum_bronze_chunk.get(),
                4.0F, 600, flag("pulchrum_bronze_making"));
        
        // pulchrum_bronze fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.pulchrum_bronze_axe.get(), 
                ModItems.pulchrum_bronze_pickaxe.get(),ModItems.pulchrum_bronze_shovel.get(), ModItems.pulchrum_bronze_sword.get()),
                null,
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.pulchrum_bronze_ingot.get(), 10.0F, 600, flag("recycling_enabled"), "recycle_pulchrum_bronze_items");
    } // end registerPulchrumBronzeRecipes

    /**
     * Tomb Bronze alloying and fusion recycling recipes.
     */
    protected void registerTombBronzeRecipes(Consumer<IFinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(ModItems.pyropus_bronze_ingot.get()));
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_ARSENIDE_BRONZE));
        catalysts[0] = Ingredient.of(Items.ROTTEN_FLESH);
        catalysts[1] = Ingredient.of(Items.REDSTONE);
        catalysts[2] = Ingredient.of(Items.GLOWSTONE_DUST);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                ModItems.tomb_bronze_nugget.get(), ModItems.medium_tomb_bronze_chunk.get(), ModItems.large_tomb_bronze_chunk.get(),
                6.0F, 600, and(flag("tomb_bronze_making"), modLoaded("arsenic")));
        
        catalysts[0] = null; catalysts[1] = null;
        catalysts[2] = Ingredient.of(ModTags.Items.REAGENT_OLD_LACE);
      
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, null, null, 
                ModItems.large_tomb_bronze_chunk.get(), 6.0F, 600, and(flag("tomb_bronze_making"), 
                modLoaded("arsenic")), "_with_old_lace");
        
        // tomb_bronze fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.tomb_bronze_axe.get(), 
                ModItems.tomb_bronze_boots.get(), ModItems.tomb_bronze_helmet.get(), ModItems.tomb_bronze_pickaxe.get(),
                ModItems.tomb_bronze_shovel.get(), ModItems.tomb_bronze_sword.get()),
                Ingredient.of(ModItems.tomb_bronze_chestplate.get(), ModItems.tomb_bronze_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(Items.ROTTEN_FLESH), 
                ModItems.tomb_bronze_ingot.get(), 15.0F, 600, flag("recycling_enabled"), "recycle_tomb_bronze_items");
    } // end registerTombBronzeRecipes
    

    @Override
    public ICondition flag(String name)
    {
        return impl_flag(ClassicalAlchemy.MODID, ClassicalAlchemyConfig.INSTANCE, name);
    }

} // end class
