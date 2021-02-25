package mod.akkamaddi.classicalalchemy.content;

import java.util.function.Supplier;

import mod.akkamaddi.classicalalchemy.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ClassicalItemTier implements IItemTier 
{
    STANNUM(2, 380, 8.5f, 2.0f, 10, ()-> { return Ingredient.fromItems(ModItems.stannum_ingot.get());} ),
    CUPRUM(2, 345, 9.0F, 2.0F, 10, ()-> { return Ingredient.fromItems(ModItems.cuprum_ingot.get());} ),
    PYROPUS_BRONZE(2, 840, 11.0F, 3.0F, 18, ()-> { return Ingredient.fromItems(ModItems.pyropus_bronze_ingot.get());} ),
    PULCHRUM_BRONZE(3, 336, 12.0F, 3.0F, 22, ()-> { return Ingredient.fromItems(ModItems.pulchrum_bronze_ingot.get());} ),
    TOMB_BRONZE(3, 920, 14.05F, 3.0F, 28, ()-> { return Ingredient.fromItems(ModItems.tomb_bronze_ingot.get());});

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;
    
    private ClassicalItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
            Supplier<Ingredient> repairMaterial)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses() {
       return this.maxUses;
    }

    @Override
    public float getEfficiency() {
       return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
       return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
       return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
       return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
       return this.repairMaterial.getValue();
    }
} // end enum
