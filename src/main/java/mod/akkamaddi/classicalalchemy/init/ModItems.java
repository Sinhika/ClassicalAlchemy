package mod.akkamaddi.classicalalchemy.init;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import net.minecraft.item.Item;
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
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> stannum_nugget = ITEMS.register("stannum_nugget", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> stannum_dust = ITEMS.register("stannum_dust", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_stannum_chunk = ITEMS.register("medium_stannum_chunk", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_stannum_chunk = ITEMS.register("large_stannum_chunk", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    
    // cuprum
    public static final RegistryObject<Item> cuprum_ingot = ITEMS.register("cuprum_ingot", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> cuprum_nugget = ITEMS.register("cuprum_nugget", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> cuprum_dust = ITEMS.register("cuprum_dust", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_cuprum_chunk = ITEMS.register("medium_cuprum_chunk", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_cuprum_chunk = ITEMS.register("large_cuprum_chunk", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
     
    // pyropus bronze
    public static final RegistryObject<Item> pyropus_bronze_ingot = ITEMS.register("pyropus_bronze_ingot", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> pyropus_bronze_nugget = ITEMS.register("pyropus_bronze_nugget", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> pyropus_bronze_dust = ITEMS.register("pyropus_bronze_dust", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_pyropus_bronze_chunk = ITEMS.register("medium_pyropus_bronze_chunk", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_pyropus_bronze_chunk = ITEMS.register("large_pyropus_bronze_chunk", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));

    // pulchrum bronze
    public static final RegistryObject<Item> pulchrum_bronze_ingot = ITEMS.register("pulchrum_bronze_ingot", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> pulchrum_bronze_nugget = ITEMS.register("pulchrum_bronze_nugget", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> pulchrum_bronze_dust = ITEMS.register("pulchrum_bronze_dust", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_pulchrum_bronze_chunk = ITEMS.register("large_pulchrum_bronze_chunk", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));

    // tomb bronze
    public static final RegistryObject<Item> tomb_bronze_ingot = ITEMS.register("tomb_bronze_ingot", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> tomb_bronze_nugget = ITEMS.register("tomb_bronze_nugget", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> tomb_bronze_dust = ITEMS.register("tomb_bronze_dust", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> medium_tomb_bronze_chunk = ITEMS.register("medium_tomb_bronze_chunk", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_tomb_bronze_chunk = ITEMS.register("large_tomb_bronze_chunk", 
            ()-> new Item(new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));

    // TOOLS
    // axes
    // hoes
    // pickaxes
    // shovels
    // swords

    // ARMORS

} // end class
