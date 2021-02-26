package mod.akkamaddi.classicalalchemy.datagen;

import java.util.function.Consumer;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import mod.akkamaddi.classicalalchemy.config.ClassicalAlchemyConfig;
import mod.akkamaddi.classicalalchemy.init.ModBlocks;
import mod.akkamaddi.classicalalchemy.init.ModItems;
import mod.alexndr.simplecorelib.datagen.ISimpleConditionBuilder;
import mod.alexndr.simplecorelib.datagen.RecipeSetBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class Recipes extends RecipeProvider implements IConditionBuilder, ISimpleConditionBuilder
{
    private RecipeSetBuilder setbuilder;

    public Recipes(DataGenerator generatorIn)
    {
        super(generatorIn);
        setbuilder = new RecipeSetBuilder(ClassicalAlchemy.MODID);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {
        registerStorageRecipes(consumer);
        registerMiscRecipes(consumer);
        registerToolRecipes(consumer);
        registerArmorRecipes(consumer);
        registerFurnaceRecipes(consumer);
    } // end registerRecipes
    
    private void registerFurnaceRecipes(Consumer<IFinishedRecipe> consumer)
    {
    } // end registerFurnaceRecipes()

    private void registerArmorRecipes(Consumer<IFinishedRecipe> consumer)
    {
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.fromItems(ModItems.cuprum_ingot.get()), 
                "cuprum", hasItem(ModItems.cuprum_ingot.get()), null);
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.fromItems(ModItems.stannum_ingot.get()), 
                "stannum", hasItem(ModItems.stannum_ingot.get()), null);
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.fromItems(ModItems.pyropus_bronze_ingot.get()), 
                "pyropus_bronze", hasItem(ModItems.pyropus_bronze_ingot.get()), null);
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.fromItems(ModItems.tomb_bronze_ingot.get()), 
                "tomb_bronze", hasItem(ModItems.tomb_bronze_ingot.get()), null);
    } // end registerArmorRecipes()

    private void registerToolRecipes(Consumer<IFinishedRecipe> consumer)
    {
        setbuilder.buildSimpleToolSet(consumer, Ingredient.fromItems(ModItems.cuprum_ingot.get()), "cuprum",
                hasItem(ModItems.cuprum_ingot.get()), null, false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.fromItems(ModItems.stannum_ingot.get()), "stannum",
                hasItem(ModItems.stannum_ingot.get()), null, false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.fromItems(ModItems.pulchrum_bronze_ingot.get()), "pulchrum_bronze",
                hasItem(ModItems.pulchrum_bronze_ingot.get()), null, false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.fromItems(ModItems.pyropus_bronze_ingot.get()), "pyropus_bronze",
                hasItem(ModItems.pyropus_bronze_ingot.get()), null, false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.fromItems(ModItems.tomb_bronze_ingot.get()), "tomb_bronze",
                hasItem(ModItems.tomb_bronze_ingot.get()), null, false);
    } // end registerToolRecipes()

    private void registerMiscRecipes(Consumer<IFinishedRecipe> consumer)
    {
    } // end registerMiscRecipes()

    /**
     * build and register storage recipes; i.e., nugget => ingot => block conversions.
     * @param consumer
     */
    private void registerStorageRecipes(Consumer<IFinishedRecipe> consumer)
    {
        // vanilla storage recipes
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.cuprum_ingot.get(), ModBlocks.cuprum_block.get(),
                ModItems.cuprum_nugget.get(), hasItem(ModItems.cuprum_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.stannum_ingot.get(), ModBlocks.stannum_block.get(),
                ModItems.stannum_nugget.get(), hasItem(ModItems.stannum_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.pyropus_bronze_ingot.get(), ModBlocks.pyropus_bronze_block.get(),
                ModItems.pyropus_bronze_nugget.get(), hasItem(ModItems.pyropus_bronze_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.pulchrum_bronze_ingot.get(), ModBlocks.pulchrum_bronze_block.get(),
                ModItems.pulchrum_bronze_nugget.get(), hasItem(ModItems.pulchrum_bronze_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.tomb_bronze_ingot.get(), ModBlocks.tomb_bronze_block.get(),
                ModItems.tomb_bronze_nugget.get(), hasItem(ModItems.tomb_bronze_ingot.get()));
        
        // chunk conversion recipes
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.cuprum_nugget.get(),
                ModItems.medium_cuprum_chunk.get(), ModItems.large_cuprum_chunk.get(), 
                hasItem(ModItems.cuprum_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.stannum_nugget.get(),
                ModItems.medium_stannum_chunk.get(), ModItems.large_stannum_chunk.get(), 
                hasItem(ModItems.stannum_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.pyropus_bronze_nugget.get(),
                ModItems.medium_pyropus_bronze_chunk.get(), ModItems.large_pyropus_bronze_chunk.get(), 
                hasItem(ModItems.pyropus_bronze_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.tomb_bronze_nugget.get(),
                ModItems.medium_tomb_bronze_chunk.get(), ModItems.large_tomb_bronze_chunk.get(), 
                hasItem(ModItems.tomb_bronze_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.pulchrum_bronze_nugget.get(),
                null, ModItems.large_pulchrum_bronze_chunk.get(), 
                hasItem(ModItems.pulchrum_bronze_nugget.get()));

    } // end registerStorageRecipes()


    @Override
    public ICondition flag(String name)
    {
        return impl_flag(ClassicalAlchemy.MODID, ClassicalAlchemyConfig.INSTANCE, name);
    }

} // end class
