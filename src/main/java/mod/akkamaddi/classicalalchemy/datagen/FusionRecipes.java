package mod.akkamaddi.classicalalchemy.datagen;

import java.util.function.Consumer;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import mod.akkamaddi.classicalalchemy.config.ClassicalAlchemyConfig;
import mod.alexndr.fusion.api.datagen.FusionRecipeSetBuilder;
import mod.alexndr.fusion.api.recipe.AbstractFusionRecipeProvider;
import mod.alexndr.simplecorelib.datagen.ISimpleConditionBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
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
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {
    }


    @Override
    public ICondition flag(String name)
    {
        return impl_flag(ClassicalAlchemy.MODID, ClassicalAlchemyConfig.INSTANCE, name);
    }

}