package mod.akkamaddi.classicalalchemy.init;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import mod.akkamaddi.classicalalchemy.content.ClassicalArmorMaterial;
import mod.akkamaddi.classicalalchemy.content.ClassicalItemTier;
import mod.akkamaddi.classicalalchemy.content.StannumArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Holds a list of all our {@link Item}s.
 * Suppliers that create Items are added to the DeferredRegister.
 * The DeferredRegister is then added to our mod event bus in our constructor.
 * When the Item Registry Event is fired by Forge and it is time for the mod to
 * register its Items, our Items are created and registered by the DeferredRegister.
 * The Item Registry Event will always be called after the Block registry is filled.
 * Note: This supports registry overrides.
 *
 * @author Sinhika, notes by Cadiboo.
 */
public final class ModItems
{
    public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, ClassicalAlchemy.MODID);
    
    // INGOTS, CHUNKS, NUGGETS AND DUSTS
    // stannum
    public static final RegistryObject<Item> stannum_ingot = ITEMS.register("stannum_ingot", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> stannum_nugget = ITEMS.register("stannum_nugget", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> stannum_dust = ITEMS.register("stannum_dust", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_stannum_chunk = ITEMS.register("medium_stannum_chunk", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_stannum_chunk = ITEMS.register("large_stannum_chunk", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    // cuprum
    public static final RegistryObject<Item> cuprum_ingot = ITEMS.register("cuprum_ingot", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> cuprum_nugget = ITEMS.register("cuprum_nugget", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> cuprum_dust = ITEMS.register("cuprum_dust", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_cuprum_chunk = ITEMS.register("medium_cuprum_chunk", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_cuprum_chunk = ITEMS.register("large_cuprum_chunk", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
     
    // pyropus bronze
    public static final RegistryObject<Item> pyropus_bronze_ingot = ITEMS.register("pyropus_bronze_ingot", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> pyropus_bronze_nugget = ITEMS.register("pyropus_bronze_nugget", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> pyropus_bronze_dust = ITEMS.register("pyropus_bronze_dust", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_pyropus_bronze_chunk = ITEMS.register("medium_pyropus_bronze_chunk", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_pyropus_bronze_chunk = ITEMS.register("large_pyropus_bronze_chunk", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));

    // pulchrum bronze
    public static final RegistryObject<Item> pulchrum_bronze_ingot = ITEMS.register("pulchrum_bronze_ingot", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> pulchrum_bronze_nugget = ITEMS.register("pulchrum_bronze_nugget", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> pulchrum_bronze_dust = ITEMS.register("pulchrum_bronze_dust", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_pulchrum_bronze_chunk = ITEMS.register("large_pulchrum_bronze_chunk", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));

    // tomb bronze
    public static final RegistryObject<Item> tomb_bronze_ingot = ITEMS.register("tomb_bronze_ingot", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> tomb_bronze_nugget = ITEMS.register("tomb_bronze_nugget", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> tomb_bronze_dust = ITEMS.register("tomb_bronze_dust", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_tomb_bronze_chunk = ITEMS.register("medium_tomb_bronze_chunk", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_tomb_bronze_chunk = ITEMS.register("large_tomb_bronze_chunk", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));

    // TOOLS
    // axes
    public static final RegistryObject<AxeItem> stannum_axe = ITEMS.register("stannum_axe",
            () -> new AxeItem(ClassicalItemTier.STANNUM, 7.0F, -3.1F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> cuprum_axe = ITEMS.register("cuprum_axe",
            () -> new AxeItem(ClassicalItemTier.CUPRUM, 7.0F, -3.1F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> pulchrum_bronze_axe = ITEMS.register("pulchrum_bronze_axe",
            () -> new AxeItem(ClassicalItemTier.PULCHRUM_BRONZE, 7.0F, -3.1F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> pyropus_bronze_axe = ITEMS.register("pyropus_bronze_axe",
            () -> new AxeItem(ClassicalItemTier.PYROPUS_BRONZE, 7.0F, -3.1F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> tomb_bronze_axe = ITEMS.register("tomb_bronze_axe",
            () -> new AxeItem(ClassicalItemTier.TOMB_BRONZE, 7.0F, -3.1F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    // hoes
    public static final RegistryObject<HoeItem> stannum_hoe = ITEMS.register("stannum_hoe",
            () -> new HoeItem(ClassicalItemTier.STANNUM, -1, 2.0F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<HoeItem> cuprum_hoe = ITEMS.register("cuprum_hoe",
            () -> new HoeItem(ClassicalItemTier.CUPRUM, -1, 2.0F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<HoeItem> pyropus_bronze_hoe = ITEMS.register("pyropus_bronze_hoe",
            () -> new HoeItem(ClassicalItemTier.PYROPUS_BRONZE, -1, 2.0F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    // pickaxes
    public static final RegistryObject<PickaxeItem> stannum_pickaxe = ITEMS.register("stannum_pickaxe",
            () -> new PickaxeItem(ClassicalItemTier.STANNUM, 1, -2.8F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> cuprum_pickaxe = ITEMS.register("cuprum_pickaxe",
            () -> new PickaxeItem(ClassicalItemTier.CUPRUM, 1, -2.8F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> pulchrum_bronze_pickaxe = ITEMS.register("pulchrum_bronze_pickaxe",
            () -> new PickaxeItem(ClassicalItemTier.PULCHRUM_BRONZE, 1, -2.8F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> pyropus_bronze_pickaxe = ITEMS.register("pyropus_bronze_pickaxe",
            () -> new PickaxeItem(ClassicalItemTier.PYROPUS_BRONZE, 1, -2.8F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> tomb_bronze_pickaxe = ITEMS.register("tomb_bronze_pickaxe",
            () -> new PickaxeItem(ClassicalItemTier.TOMB_BRONZE, 1, -2.8F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    // shovels
    public static final RegistryObject<ShovelItem> stannum_shovel = ITEMS.register("stannum_shovel",
            () -> new ShovelItem(ClassicalItemTier.STANNUM, 1.5F, -3.0F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> cuprum_shovel = ITEMS.register("cuprum_shovel",
            () -> new ShovelItem(ClassicalItemTier.CUPRUM, 1.5F, -3.0F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> pulchrum_bronze_shovel = ITEMS.register("pulchrum_bronze_shovel",
            () -> new ShovelItem(ClassicalItemTier.PULCHRUM_BRONZE, 1.5F, -3.0F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> pyropus_bronze_shovel = ITEMS.register("pyropus_bronze_shovel",
            () -> new ShovelItem(ClassicalItemTier.PYROPUS_BRONZE, 1.5F, -3.0F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> tomb_bronze_shovel = ITEMS.register("tomb_bronze_shovel",
            () -> new ShovelItem(ClassicalItemTier.TOMB_BRONZE, 1.5F, -3.0F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    // swords
    public static final RegistryObject<SwordItem> stannum_sword = ITEMS.register("stannum_sword",
            () -> new SwordItem(ClassicalItemTier.STANNUM, 3, -2.4F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<SwordItem> cuprum_sword = ITEMS.register("cuprum_sword",
            () -> new SwordItem(ClassicalItemTier.CUPRUM, 3, -2.4F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<SwordItem> pulchrum_bronze_sword = ITEMS.register("pulchrum_bronze_sword",
            () -> new SwordItem(ClassicalItemTier.PULCHRUM_BRONZE, 3, -2.4F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<SwordItem> pyropus_bronze_sword = ITEMS.register("pyropus_bronze_sword",
            () -> new SwordItem(ClassicalItemTier.PYROPUS_BRONZE, 3, -2.4F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<SwordItem> tomb_bronze_sword = ITEMS.register("tomb_bronze_sword",
            () -> new SwordItem(ClassicalItemTier.TOMB_BRONZE, 3, -2.4F,
            new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));

    // ARMORS
    // stannum
    public static final RegistryObject<StannumArmorItem> stannum_helmet = ITEMS.register("stannum_helmet",
            () -> new StannumArmorItem(ClassicalArmorMaterial.STANNUM, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<StannumArmorItem> stannum_leggings = ITEMS.register("stannum_leggings",
            () -> new StannumArmorItem(ClassicalArmorMaterial.STANNUM, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<StannumArmorItem> stannum_chestplate = ITEMS.register("stannum_chestplate",
            () -> new StannumArmorItem(ClassicalArmorMaterial.STANNUM, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<StannumArmorItem> stannum_boots = ITEMS.register("stannum_boots",
            () -> new StannumArmorItem(ClassicalArmorMaterial.STANNUM, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    // cuprum
    public static final RegistryObject<ArmorItem> cuprum_helmet = ITEMS.register("cuprum_helmet",
            () -> new ArmorItem(ClassicalArmorMaterial.CUPRUM, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> cuprum_leggings = ITEMS.register("cuprum_leggings",
            () -> new ArmorItem(ClassicalArmorMaterial.CUPRUM, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> cuprum_chestplate = ITEMS.register("cuprum_chestplate",
            () -> new ArmorItem(ClassicalArmorMaterial.CUPRUM, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> cuprum_boots = ITEMS.register("cuprum_boots",
            () -> new ArmorItem(ClassicalArmorMaterial.CUPRUM, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    // pyropus_bronze
    public static final RegistryObject<ArmorItem> pyropus_bronze_helmet = ITEMS.register("pyropus_bronze_helmet",
            () -> new ArmorItem(ClassicalArmorMaterial.PYROPUS_BRONZE, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> pyropus_bronze_leggings = ITEMS.register("pyropus_bronze_leggings",
            () -> new ArmorItem(ClassicalArmorMaterial.PYROPUS_BRONZE, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> pyropus_bronze_chestplate = ITEMS.register("pyropus_bronze_chestplate",
            () -> new ArmorItem(ClassicalArmorMaterial.PYROPUS_BRONZE, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> pyropus_bronze_boots = ITEMS.register("pyropus_bronze_boots",
            () -> new ArmorItem(ClassicalArmorMaterial.PYROPUS_BRONZE, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));

    // tomb_bronze
    public static final RegistryObject<ArmorItem> tomb_bronze_helmet = ITEMS.register("tomb_bronze_helmet",
            () -> new ArmorItem(ClassicalArmorMaterial.TOMB_BRONZE, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> tomb_bronze_leggings = ITEMS.register("tomb_bronze_leggings",
            () -> new ArmorItem(ClassicalArmorMaterial.TOMB_BRONZE, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> tomb_bronze_chestplate = ITEMS.register("tomb_bronze_chestplate",
            () -> new ArmorItem(ClassicalArmorMaterial.TOMB_BRONZE, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> tomb_bronze_boots = ITEMS.register("tomb_bronze_boots",
            () -> new ArmorItem(ClassicalArmorMaterial.TOMB_BRONZE, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
    } // end class
