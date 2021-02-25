package mod.akkamaddi.classicalalchemy.content;

import java.util.function.Supplier;

import mod.akkamaddi.classicalalchemy.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum ClassicalArmorMaterial implements IArmorMaterial 
{
    STANNUM("classicalalchemy:stannum", 14, new int[] { 2, 3, 4, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 
            ()-> { return Ingredient.fromItems(ModItems.stannum_ingot.get());}, 0.0F),
    CUPRUM("classicalalchemy:cuprum", 13, new int[] { 2, 3, 4, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 
            ()-> { return Ingredient.fromItems(ModItems.cuprum_ingot.get());}, 0.0F),
    PYROPUS_BRONZE("classicalalchemy:pyropus_bronze", 20, new int[] { 2, 4, 5, 4 }, 18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F,
            ()-> { return Ingredient.fromItems(ModItems.pyropus_bronze_ingot.get());}, 0.0F),
    TOMB_BRONZE("classicalalchemy:tomb_bronze", 24, new int[] { 4, 5, 6, 4 }, 28, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F,
            ()-> { return Ingredient.fromItems(ModItems.tomb_bronze_ingot.get());}, 0.0F);

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyValue<Ingredient> repairMaterial;
    private final float knockbackResist;

    private ClassicalArmorMaterial(String nameIn, int maxDamageIn, int[] drAmtArray,
            int enchantabilityIn, SoundEvent soundIn,
            float toughnessIn,
            Supplier<Ingredient> repairMatIn, float knockbackIn)
    {
        name = nameIn;
        maxDamageFactor = maxDamageIn;
        damageReductionAmountArray = drAmtArray;
        enchantability = enchantabilityIn;
        soundEvent = soundIn;
        toughness = toughnessIn;
        repairMaterial = new LazyValue<>(repairMatIn);
        knockbackResist = knockbackIn;
    }
    
    @Override
    public int getDurability(EquipmentSlotType slotIn)
    {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn)
    {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent()
    {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return this.repairMaterial.getValue();
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return this.knockbackResist;
    }

} // end enum
