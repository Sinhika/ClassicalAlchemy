package mod.akkamaddi.classicalalchemy.datagen;

import java.util.function.Consumer;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import mod.akkamaddi.classicalalchemy.config.ClassicalAlchemyConfig;
import mod.akkamaddi.classicalalchemy.init.ModBlocks;
import mod.akkamaddi.classicalalchemy.init.ModItems;
import mod.alexndr.simplecorelib.datagen.ISimpleConditionBuilder;
import mod.alexndr.simplecorelib.datagen.RecipeSetBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
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
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        registerStorageRecipes(consumer);
        registerMiscRecipes(consumer);
        registerToolRecipes(consumer);
        registerArmorRecipes(consumer);
        registerFurnaceRecipes(consumer);
    } // end registerRecipes
    
    private void registerFurnaceRecipes(Consumer<FinishedRecipe> consumer)
    {
        // large chunks
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_cuprum_chunk.get()),
                ModItems.cuprum_ingot.get(), has(ModItems.large_cuprum_chunk.get()), 
                1.0F, 200);
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_stannum_chunk.get()),
                ModItems.stannum_ingot.get(), has(ModItems.large_stannum_chunk.get()), 
                1.0F, 200);
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_pyropus_bronze_chunk.get()),
                ModItems.pyropus_bronze_ingot.get(), has(ModItems.large_pyropus_bronze_chunk.get()), 
                1.4F, 200);
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_pulchrum_bronze_chunk.get()),
                ModItems.pulchrum_bronze_ingot.get(), has(ModItems.large_pulchrum_bronze_chunk.get()), 
                2.0F, 200);
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_tomb_bronze_chunk.get()),
                ModItems.tomb_bronze_ingot.get(), has(ModItems.large_tomb_bronze_chunk.get()), 
                3.0F, 200);
        
        // vanilla recycling.
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.stannum_axe.get(), 
                ModItems.stannum_boots.get(), ModItems.stannum_chestplate.get(), ModItems.stannum_helmet.get(),
                ModItems.stannum_hoe.get(), ModItems.stannum_leggings.get(), ModItems.stannum_pickaxe.get(),
                ModItems.stannum_shovel.get(), ModItems.stannum_sword.get()), 
                ModItems.stannum_nugget.get(), has(ModItems.stannum_axe.get()), 1.0F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.cuprum_axe.get(), 
                ModItems.cuprum_boots.get(), ModItems.cuprum_chestplate.get(), ModItems.cuprum_helmet.get(),
                ModItems.cuprum_hoe.get(), ModItems.cuprum_leggings.get(), ModItems.cuprum_pickaxe.get(),
                ModItems.cuprum_shovel.get(), ModItems.cuprum_sword.get()), 
                ModItems.cuprum_nugget.get(), has(ModItems.cuprum_axe.get()), 1.0F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.pyropus_bronze_axe.get(), 
                ModItems.pyropus_bronze_boots.get(), ModItems.pyropus_bronze_chestplate.get(), ModItems.pyropus_bronze_helmet.get(),
                ModItems.pyropus_bronze_hoe.get(), ModItems.pyropus_bronze_leggings.get(), ModItems.pyropus_bronze_pickaxe.get(),
                ModItems.pyropus_bronze_shovel.get(), ModItems.pyropus_bronze_sword.get()), 
                ModItems.pyropus_bronze_nugget.get(), has(ModItems.pyropus_bronze_axe.get()), 1.4F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer,
                Ingredient.of(ModItems.pulchrum_bronze_axe.get(), ModItems.pulchrum_bronze_pickaxe.get(),
                        ModItems.pulchrum_bronze_shovel.get(), ModItems.pulchrum_bronze_sword.get()),
                ModItems.pulchrum_bronze_nugget.get(), has(ModItems.pulchrum_bronze_axe.get()), 2.0F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.tomb_bronze_axe.get(), 
                ModItems.tomb_bronze_boots.get(), ModItems.tomb_bronze_chestplate.get(), ModItems.tomb_bronze_helmet.get(),
                ModItems.tomb_bronze_leggings.get(), ModItems.tomb_bronze_pickaxe.get(),
                ModItems.tomb_bronze_shovel.get(), ModItems.tomb_bronze_sword.get()), 
                ModItems.tomb_bronze_nugget.get(), has(ModItems.tomb_bronze_axe.get()), 3.0F, 200);

        // dust recipes (for Silents & other tech mods)
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.cuprum_dust.get()), 
                ModItems.cuprum_ingot.get(), has(ModItems.cuprum_dust.get()), 1.0F, 200, "_from_dust");
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.stannum_dust.get()), 
                ModItems.stannum_ingot.get(), has(ModItems.stannum_dust.get()), 1.0F, 200, "_from_dust");
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.pyropus_bronze_dust.get()), 
                ModItems.pyropus_bronze_ingot.get(), has(ModItems.pyropus_bronze_dust.get()), 1.4F, 200, "_from_dust");
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.pulchrum_bronze_dust.get()), 
                ModItems.pulchrum_bronze_ingot.get(), has(ModItems.pulchrum_bronze_dust.get()), 2.0F, 200, "_from_dust");
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.tomb_bronze_dust.get()), 
                ModItems.tomb_bronze_ingot.get(), has(ModItems.tomb_bronze_dust.get()), 3.0F, 200, "_from_dust");
    } // end registerFurnaceRecipes()

    private void registerArmorRecipes(Consumer<FinishedRecipe> consumer)
    {
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.cuprum_ingot.get()), 
                "cuprum", has(ModItems.cuprum_ingot.get()), null);
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.stannum_ingot.get()), 
                "stannum", has(ModItems.stannum_ingot.get()), null);
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.pyropus_bronze_ingot.get()), 
                "pyropus_bronze", has(ModItems.pyropus_bronze_ingot.get()), null);
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.tomb_bronze_ingot.get()), 
                "tomb_bronze", has(ModItems.tomb_bronze_ingot.get()), null);
    } // end registerArmorRecipes()

    private void registerToolRecipes(Consumer<FinishedRecipe> consumer)
    {
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.cuprum_ingot.get()), "cuprum",
                has(ModItems.cuprum_ingot.get()), null, false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.stannum_ingot.get()), "stannum",
                has(ModItems.stannum_ingot.get()), null, false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.pulchrum_bronze_ingot.get()), "pulchrum_bronze",
                has(ModItems.pulchrum_bronze_ingot.get()), null, false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.pyropus_bronze_ingot.get()), "pyropus_bronze",
                has(ModItems.pyropus_bronze_ingot.get()), null, false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.tomb_bronze_ingot.get()), "tomb_bronze",
                has(ModItems.tomb_bronze_ingot.get()), null, false);
    } // end registerToolRecipes()

    /** 
     * pressure plates go here if we ever get any.
     * @param consumer
     */
    private void registerMiscRecipes(Consumer<FinishedRecipe> consumer)
    {
    } // end registerMiscRecipes()

    /**
     * build and register storage recipes; i.e., nugget => ingot => block conversions.
     * @param consumer
     */
    private void registerStorageRecipes(Consumer<FinishedRecipe> consumer)
    {
        // vanilla storage recipes
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.cuprum_ingot.get(), ModBlocks.cuprum_block.get(),
                ModItems.cuprum_nugget.get(), has(ModItems.cuprum_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.stannum_ingot.get(), ModBlocks.stannum_block.get(),
                ModItems.stannum_nugget.get(), has(ModItems.stannum_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.pyropus_bronze_ingot.get(), ModBlocks.pyropus_bronze_block.get(),
                ModItems.pyropus_bronze_nugget.get(), has(ModItems.pyropus_bronze_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.pulchrum_bronze_ingot.get(), ModBlocks.pulchrum_bronze_block.get(),
                ModItems.pulchrum_bronze_nugget.get(), has(ModItems.pulchrum_bronze_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.tomb_bronze_ingot.get(), ModBlocks.tomb_bronze_block.get(),
                ModItems.tomb_bronze_nugget.get(), has(ModItems.tomb_bronze_ingot.get()));
        
        // chunk conversion recipes
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.cuprum_nugget.get(),
                ModItems.medium_cuprum_chunk.get(), ModItems.large_cuprum_chunk.get(), 
                has(ModItems.cuprum_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.stannum_nugget.get(),
                ModItems.medium_stannum_chunk.get(), ModItems.large_stannum_chunk.get(), 
                has(ModItems.stannum_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.pyropus_bronze_nugget.get(),
                ModItems.medium_pyropus_bronze_chunk.get(), ModItems.large_pyropus_bronze_chunk.get(), 
                has(ModItems.pyropus_bronze_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.tomb_bronze_nugget.get(),
                ModItems.medium_tomb_bronze_chunk.get(), ModItems.large_tomb_bronze_chunk.get(), 
                has(ModItems.tomb_bronze_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.pulchrum_bronze_nugget.get(),
                null, ModItems.large_pulchrum_bronze_chunk.get(), 
                has(ModItems.pulchrum_bronze_nugget.get()));

    } // end registerStorageRecipes()


    @Override
    public ICondition flag(String name)
    {
        return impl_flag(ClassicalAlchemy.MODID, ClassicalAlchemyConfig.INSTANCE, name);
    }

} // end class
