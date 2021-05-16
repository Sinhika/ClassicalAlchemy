package mod.akkamaddi.classicalalchemy.datagen;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.mojang.datafixers.util.Pair;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import mod.akkamaddi.classicalalchemy.init.ModItems;
import mod.alexndr.simplecorelib.datagen.LootTableInjectorProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.RandomValueRange;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.loot.functions.SetCount;
import net.minecraft.util.ResourceLocation;

public class ClassicalAlchemyLootInjectorProvider extends LootTableInjectorProvider
{

    public ClassicalAlchemyLootInjectorProvider(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> getTables()
    {
        tables.clear();

        // desert_pyramid - an old tomb.
        LootPool.Builder foo = createChestPool(1, 1, 0.50F)
                .add(ItemLootEntry.lootTableItem(ModItems.tomb_bronze_helmet.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tomb_bronze_chestplate.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tomb_bronze_leggings.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tomb_bronze_boots.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tomb_bronze_sword.get()).setWeight(1));
        addInjectionTable(ClassicalAlchemy.MODID, "desert_pyramid", foo);

        // jungle_temple - shiny bronzes for the jungle god!
        foo = createChestPool(1, 1, 0.50F)
                .add(ItemLootEntry.lootTableItem(ModItems.pulchrum_bronze_sword.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.pulchrum_bronze_axe.get()).setWeight(1));
        addInjectionTable(ClassicalAlchemy.MODID, "jungle_temple", foo);

        // shipwreck -- bronzes don't rust
        foo = createChestPool(1, 1, 0.50F)
                .add(ItemLootEntry.lootTableItem(ModItems.large_pyropus_bronze_chunk.get()).setWeight(2)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.large_stannum_chunk.get()).setWeight(6)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 1))))
                .add(ItemLootEntry.lootTableItem(ModItems.pyropus_bronze_ingot.get()).setWeight(1)
                        .apply(SetCount.setCount(RandomValueRange.between(2, 4))))
                .add(ItemLootEntry.lootTableItem(ModItems.stannum_ingot.get()).setWeight(4)
                        .apply(SetCount.setCount(RandomValueRange.between(2, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.pulchrum_bronze_ingot.get()).setWeight(1)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 3))));
        addInjectionTable(ClassicalAlchemy.MODID, "shipwreck", foo);

        // underwater_ruin -- old, bronzes don't rust.
        foo = createChestPool(1, 1, 0.50F)
                .add(ItemLootEntry.lootTableItem(ModItems.tomb_bronze_axe.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tomb_bronze_pickaxe.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tomb_bronze_shovel.get()).setWeight(1))
                .add(ItemLootEntry.lootTableItem(ModItems.tomb_bronze_sword.get()).setWeight(1));
        addInjectionTable(ClassicalAlchemy.MODID, "underwater_ruin", foo);
        
        // village_smith -- applies to armorer, toolsmith, weaponsmith
        foo = createChestPool(1, 1, 0.25F)
                .add(ItemLootEntry.lootTableItem(ModItems.stannum_ingot.get()).setWeight(2)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 3))))
                .add(ItemLootEntry.lootTableItem(ModItems.cuprum_ingot.get()).setWeight(2)
                        .apply(SetCount.setCount(RandomValueRange.between(1, 3))));
        addInjectionTable(ClassicalAlchemy.MODID, "village_smith", foo);
        
        return tables;
    } // end getTables()

} // end class
