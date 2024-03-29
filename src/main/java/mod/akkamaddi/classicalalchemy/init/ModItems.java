package mod.akkamaddi.classicalalchemy.init;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import mod.akkamaddi.classicalalchemy.content.ClassicalArmorMaterial;
import mod.akkamaddi.classicalalchemy.content.ClassicalItemTiers;
import mod.akkamaddi.classicalalchemy.content.StannumArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> stannum_nugget = ITEMS.register("stannum_nugget", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> stannum_dust = ITEMS.register("stannum_dust", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> medium_stannum_chunk = ITEMS.register("medium_stannum_chunk", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> large_stannum_chunk = ITEMS.register("large_stannum_chunk", 
            ()-> new Item(new Item.Properties()));
    
    // cuprum
    public static final RegistryObject<Item> cuprum_ingot = ITEMS.register("cuprum_ingot", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> cuprum_nugget = ITEMS.register("cuprum_nugget", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> cuprum_dust = ITEMS.register("cuprum_dust", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> medium_cuprum_chunk = ITEMS.register("medium_cuprum_chunk", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> large_cuprum_chunk = ITEMS.register("large_cuprum_chunk", 
            ()-> new Item(new Item.Properties()));
     
    // pyropus bronze
    public static final RegistryObject<Item> pyropus_bronze_ingot = ITEMS.register("pyropus_bronze_ingot", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> pyropus_bronze_nugget = ITEMS.register("pyropus_bronze_nugget", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> pyropus_bronze_dust = ITEMS.register("pyropus_bronze_dust", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> medium_pyropus_bronze_chunk = ITEMS.register("medium_pyropus_bronze_chunk", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> large_pyropus_bronze_chunk = ITEMS.register("large_pyropus_bronze_chunk", 
            ()-> new Item(new Item.Properties()));

    // pulchrum bronze
    public static final RegistryObject<Item> pulchrum_bronze_ingot = ITEMS.register("pulchrum_bronze_ingot", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> pulchrum_bronze_nugget = ITEMS.register("pulchrum_bronze_nugget", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> pulchrum_bronze_dust = ITEMS.register("pulchrum_bronze_dust", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> large_pulchrum_bronze_chunk = ITEMS.register("large_pulchrum_bronze_chunk", 
            ()-> new Item(new Item.Properties()));

    // tomb bronze
    public static final RegistryObject<Item> tomb_bronze_ingot = ITEMS.register("tomb_bronze_ingot", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> tomb_bronze_nugget = ITEMS.register("tomb_bronze_nugget", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> tomb_bronze_dust = ITEMS.register("tomb_bronze_dust", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> medium_tomb_bronze_chunk = ITEMS.register("medium_tomb_bronze_chunk", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> large_tomb_bronze_chunk = ITEMS.register("large_tomb_bronze_chunk", 
            ()-> new Item(new Item.Properties()));

    // TOOLS
    // axes
    public static final RegistryObject<AxeItem> stannum_axe = ITEMS.register("stannum_axe",
            () -> new AxeItem(ClassicalItemTiers.STANNUM, 7.0F, -3.1F,
            new Item.Properties()));
    public static final RegistryObject<AxeItem> cuprum_axe = ITEMS.register("cuprum_axe",
            () -> new AxeItem(ClassicalItemTiers.CUPRUM, 7.0F, -3.1F,
            new Item.Properties()));
    public static final RegistryObject<AxeItem> pulchrum_bronze_axe = ITEMS.register("pulchrum_bronze_axe",
            () -> new AxeItem(ClassicalItemTiers.PULCHRUM_BRONZE, 7.0F, -3.1F,
            new Item.Properties()));
    public static final RegistryObject<AxeItem> pyropus_bronze_axe = ITEMS.register("pyropus_bronze_axe",
            () -> new AxeItem(ClassicalItemTiers.PYROPUS_BRONZE, 7.0F, -3.1F,
            new Item.Properties()));
    public static final RegistryObject<AxeItem> tomb_bronze_axe = ITEMS.register("tomb_bronze_axe",
            () -> new AxeItem(ClassicalItemTiers.TOMB_BRONZE, 7.0F, -3.1F,
            new Item.Properties()));
    
    // hoes
    public static final RegistryObject<HoeItem> stannum_hoe = ITEMS.register("stannum_hoe",
            () -> new HoeItem(ClassicalItemTiers.STANNUM, -1, 2.0F,
            new Item.Properties()));
    public static final RegistryObject<HoeItem> cuprum_hoe = ITEMS.register("cuprum_hoe",
            () -> new HoeItem(ClassicalItemTiers.CUPRUM, -1, 2.0F,
            new Item.Properties()));
    public static final RegistryObject<HoeItem> pyropus_bronze_hoe = ITEMS.register("pyropus_bronze_hoe",
            () -> new HoeItem(ClassicalItemTiers.PYROPUS_BRONZE, -1, 2.0F,
            new Item.Properties()));
    
    // pickaxes
    public static final RegistryObject<PickaxeItem> stannum_pickaxe = ITEMS.register("stannum_pickaxe",
            () -> new PickaxeItem(ClassicalItemTiers.STANNUM, 1, -2.8F,
            new Item.Properties()));
    public static final RegistryObject<PickaxeItem> cuprum_pickaxe = ITEMS.register("cuprum_pickaxe",
            () -> new PickaxeItem(ClassicalItemTiers.CUPRUM, 1, -2.8F,
            new Item.Properties()));
    public static final RegistryObject<PickaxeItem> pulchrum_bronze_pickaxe = ITEMS.register("pulchrum_bronze_pickaxe",
            () -> new PickaxeItem(ClassicalItemTiers.PULCHRUM_BRONZE, 1, -2.8F,
            new Item.Properties()));
    public static final RegistryObject<PickaxeItem> pyropus_bronze_pickaxe = ITEMS.register("pyropus_bronze_pickaxe",
            () -> new PickaxeItem(ClassicalItemTiers.PYROPUS_BRONZE, 1, -2.8F,
            new Item.Properties()));
    public static final RegistryObject<PickaxeItem> tomb_bronze_pickaxe = ITEMS.register("tomb_bronze_pickaxe",
            () -> new PickaxeItem(ClassicalItemTiers.TOMB_BRONZE, 1, -2.8F,
            new Item.Properties()));
    
    // shovels
    public static final RegistryObject<ShovelItem> stannum_shovel = ITEMS.register("stannum_shovel",
            () -> new ShovelItem(ClassicalItemTiers.STANNUM, 1.5F, -3.0F,
            new Item.Properties()));
    public static final RegistryObject<ShovelItem> cuprum_shovel = ITEMS.register("cuprum_shovel",
            () -> new ShovelItem(ClassicalItemTiers.CUPRUM, 1.5F, -3.0F,
            new Item.Properties()));
    public static final RegistryObject<ShovelItem> pulchrum_bronze_shovel = ITEMS.register("pulchrum_bronze_shovel",
            () -> new ShovelItem(ClassicalItemTiers.PULCHRUM_BRONZE, 1.5F, -3.0F,
            new Item.Properties()));
    public static final RegistryObject<ShovelItem> pyropus_bronze_shovel = ITEMS.register("pyropus_bronze_shovel",
            () -> new ShovelItem(ClassicalItemTiers.PYROPUS_BRONZE, 1.5F, -3.0F,
            new Item.Properties()));
    public static final RegistryObject<ShovelItem> tomb_bronze_shovel = ITEMS.register("tomb_bronze_shovel",
            () -> new ShovelItem(ClassicalItemTiers.TOMB_BRONZE, 1.5F, -3.0F,
            new Item.Properties()));
    
    // swords
    public static final RegistryObject<SwordItem> stannum_sword = ITEMS.register("stannum_sword",
            () -> new SwordItem(ClassicalItemTiers.STANNUM, 3, -2.4F,
            new Item.Properties()));
    public static final RegistryObject<SwordItem> cuprum_sword = ITEMS.register("cuprum_sword",
            () -> new SwordItem(ClassicalItemTiers.CUPRUM, 3, -2.4F,
            new Item.Properties()));
    public static final RegistryObject<SwordItem> pulchrum_bronze_sword = ITEMS.register("pulchrum_bronze_sword",
            () -> new SwordItem(ClassicalItemTiers.PULCHRUM_BRONZE, 3, -2.4F,
            new Item.Properties()));
    public static final RegistryObject<SwordItem> pyropus_bronze_sword = ITEMS.register("pyropus_bronze_sword",
            () -> new SwordItem(ClassicalItemTiers.PYROPUS_BRONZE, 3, -2.4F,
            new Item.Properties()));
    public static final RegistryObject<SwordItem> tomb_bronze_sword = ITEMS.register("tomb_bronze_sword",
            () -> new SwordItem(ClassicalItemTiers.TOMB_BRONZE, 3, -2.4F,
            new Item.Properties()));

    // ARMORS
    // stannum
    public static final RegistryObject<StannumArmorItem> stannum_helmet = ITEMS.register("stannum_helmet",
            () -> new StannumArmorItem(ClassicalArmorMaterial.STANNUM, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<StannumArmorItem> stannum_leggings = ITEMS.register("stannum_leggings",
            () -> new StannumArmorItem(ClassicalArmorMaterial.STANNUM, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<StannumArmorItem> stannum_chestplate = ITEMS.register("stannum_chestplate",
            () -> new StannumArmorItem(ClassicalArmorMaterial.STANNUM, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<StannumArmorItem> stannum_boots = ITEMS.register("stannum_boots",
            () -> new StannumArmorItem(ClassicalArmorMaterial.STANNUM, ArmorItem.Type.BOOTS,
                    new Item.Properties()));
    
    // cuprum
    public static final RegistryObject<ArmorItem> cuprum_helmet = ITEMS.register("cuprum_helmet",
            () -> new ArmorItem(ClassicalArmorMaterial.CUPRUM, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> cuprum_leggings = ITEMS.register("cuprum_leggings",
            () -> new ArmorItem(ClassicalArmorMaterial.CUPRUM, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> cuprum_chestplate = ITEMS.register("cuprum_chestplate",
            () -> new ArmorItem(ClassicalArmorMaterial.CUPRUM, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> cuprum_boots = ITEMS.register("cuprum_boots",
            () -> new ArmorItem(ClassicalArmorMaterial.CUPRUM, ArmorItem.Type.BOOTS,
                    new Item.Properties()));
    
    // pyropus_bronze
    public static final RegistryObject<ArmorItem> pyropus_bronze_helmet = ITEMS.register("pyropus_bronze_helmet",
            () -> new ArmorItem(ClassicalArmorMaterial.PYROPUS_BRONZE, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> pyropus_bronze_leggings = ITEMS.register("pyropus_bronze_leggings",
            () -> new ArmorItem(ClassicalArmorMaterial.PYROPUS_BRONZE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> pyropus_bronze_chestplate = ITEMS.register("pyropus_bronze_chestplate",
            () -> new ArmorItem(ClassicalArmorMaterial.PYROPUS_BRONZE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> pyropus_bronze_boots = ITEMS.register("pyropus_bronze_boots",
            () -> new ArmorItem(ClassicalArmorMaterial.PYROPUS_BRONZE, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    // tomb_bronze
    public static final RegistryObject<ArmorItem> tomb_bronze_helmet = ITEMS.register("tomb_bronze_helmet",
            () -> new ArmorItem(ClassicalArmorMaterial.TOMB_BRONZE, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> tomb_bronze_leggings = ITEMS.register("tomb_bronze_leggings",
            () -> new ArmorItem(ClassicalArmorMaterial.TOMB_BRONZE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> tomb_bronze_chestplate = ITEMS.register("tomb_bronze_chestplate",
            () -> new ArmorItem(ClassicalArmorMaterial.TOMB_BRONZE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> tomb_bronze_boots = ITEMS.register("tomb_bronze_boots",
            () -> new ArmorItem(ClassicalArmorMaterial.TOMB_BRONZE, ArmorItem.Type.BOOTS,
                    new Item.Properties()));
    
    } // end class
