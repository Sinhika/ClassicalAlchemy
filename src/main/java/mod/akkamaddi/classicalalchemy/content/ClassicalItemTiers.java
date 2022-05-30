package mod.akkamaddi.classicalalchemy.content;

import java.util.List;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import mod.akkamaddi.classicalalchemy.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

public class ClassicalItemTiers 
{
    public static final TagKey<Block> STANNUM_TAG = 
            BlockTags.create(new ResourceLocation(ClassicalAlchemy.MODID, "needs_stannum_tool"));
    public static final TagKey<Block> CUPRUM_TAG = 
            BlockTags.create(new ResourceLocation(ClassicalAlchemy.MODID, "needs_cuprum_tool"));
    public static final TagKey<Block> PYROPUS_BRONZE_TAG = 
            BlockTags.create(new ResourceLocation(ClassicalAlchemy.MODID, "needs_pyropus_bronze_tool"));
    public static final TagKey<Block> PULCHRUM_BRONZE_TAG = 
            BlockTags.create(new ResourceLocation(ClassicalAlchemy.MODID, "needs_pulchrum_bronze_tool"));
    public static final TagKey<Block> TOMB_BRONZE_TAG = 
            BlockTags.create(new ResourceLocation(ClassicalAlchemy.MODID, "needs_tomb_bronze_tool"));

    public static final Tier STANNUM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), 80, 8.5f, 2.0f, 10, STANNUM_TAG, 
                        ()->Ingredient.of( ModItems.stannum_ingot.get())),
            new ResourceLocation(ClassicalAlchemy.MODID, "stannum"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    
    public static final Tier CUPRUM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), 345, 9.0F, 2.0F, 10, CUPRUM_TAG, 
                        ()->Ingredient.of( ModItems.cuprum_ingot.get())),
            new ResourceLocation(ClassicalAlchemy.MODID, "cuprum"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    
    public static final Tier PYROPUS_BRONZE = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), 840, 11.0F, 3.0F, 18, PYROPUS_BRONZE_TAG, 
                        ()->Ingredient.of( ModItems.pyropus_bronze_ingot.get())),
            new ResourceLocation(ClassicalAlchemy.MODID, "pyropus_bronze"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    
    public static final Tier PULCHRUM_BRONZE = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), 336, 12.0F, 3.0F, 22, PULCHRUM_BRONZE_TAG, 
                        ()->Ingredient.of( ModItems.pulchrum_bronze_ingot.get())),
            new ResourceLocation(ClassicalAlchemy.MODID, "pulchrum_bronze"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    
    public static final Tier TOMB_BRONZE = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), 920, 14.05F, 3.0F, 28, TOMB_BRONZE_TAG, 
                        ()->Ingredient.of( ModItems.tomb_bronze_ingot.get())),
            new ResourceLocation(ClassicalAlchemy.MODID, "tomb_bronze"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    
} // end enum
