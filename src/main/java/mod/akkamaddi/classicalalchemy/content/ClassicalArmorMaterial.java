package mod.akkamaddi.classicalalchemy.content;

import java.util.function.Supplier;

import mod.akkamaddi.classicalalchemy.init.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;

public enum ClassicalArmorMaterial implements ArmorMaterial 
{
    STANNUM("classicalalchemy:stannum", 14, new int[] { 2, 3, 4, 2 }, 10, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 
            ()-> { return Ingredient.of(ModItems.stannum_ingot.get());}, 0.0F),
    CUPRUM("classicalalchemy:cuprum", 13, new int[] { 2, 3, 4, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 
            ()-> { return Ingredient.of(ModItems.cuprum_ingot.get());}, 0.0F),
    PYROPUS_BRONZE("classicalalchemy:pyropus_bronze", 20, new int[] { 2, 4, 5, 4 }, 18, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F,
            ()-> { return Ingredient.of(ModItems.pyropus_bronze_ingot.get());}, 0.0F),
    TOMB_BRONZE("classicalalchemy:tomb_bronze", 24, new int[] { 4, 5, 6, 4 }, 28, SoundEvents.ARMOR_EQUIP_IRON, 1.0F,
            ()-> { return Ingredient.of(ModItems.tomb_bronze_ingot.get());}, 0.0F);

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Lazy<Ingredient> repairMaterial;
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
        repairMaterial = Lazy.of(repairMatIn);
        knockbackResist = knockbackIn;
    }
    

    @Override
	public int getDurabilityForType(Type pType)
    {
        return MAX_DAMAGE_ARRAY[pType.getSlot().getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForType(Type pType)
    {
        return this.damageReductionAmountArray[pType.getSlot().getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairMaterial.get();
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
