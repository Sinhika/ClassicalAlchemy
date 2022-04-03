package mod.akkamaddi.classicalalchemy.content;

import java.util.function.Supplier;

import mod.akkamaddi.classicalalchemy.init.ModItems;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadedValue;

public enum ClassicalItemTier implements Tier 
{
    STANNUM(2, 380, 8.5f, 2.0f, 10, ()-> { return Ingredient.of(ModItems.stannum_ingot.get());} ),
    CUPRUM(2, 345, 9.0F, 2.0F, 10, ()-> { return Ingredient.of(ModItems.cuprum_ingot.get());} ),
    PYROPUS_BRONZE(2, 840, 11.0F, 3.0F, 18, ()-> { return Ingredient.of(ModItems.pyropus_bronze_ingot.get());} ),
    PULCHRUM_BRONZE(3, 336, 12.0F, 3.0F, 22, ()-> { return Ingredient.of(ModItems.pulchrum_bronze_ingot.get());} ),
    TOMB_BRONZE(3, 920, 14.05F, 3.0F, 28, ()-> { return Ingredient.of(ModItems.tomb_bronze_ingot.get());});

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyLoadedValue<Ingredient> repairMaterial;
    
    private ClassicalItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
            Supplier<Ingredient> repairMaterial)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyLoadedValue<>(repairMaterial);
    }

    @Override
    public int getUses() {
       return this.maxUses;
    }

    @Override
    public float getSpeed() {
       return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
       return this.attackDamage;
    }

    @Override
    public int getLevel() {
       return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
       return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
       return this.repairMaterial.get();
    }
} // end enum
