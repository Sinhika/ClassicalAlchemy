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
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.RandomValueBounds;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.resources.ResourceLocation;

public class ClassicalAlchemyLootInjectorProvider extends LootTableInjectorProvider
{

    public ClassicalAlchemyLootInjectorProvider(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootContextParamSet>> getTables()
    {
        tables.clear();

        // desert_pyramid - an old tomb.
        LootPool.Builder foo = createChestPool(1, 1, 0.50F)
                .add(LootItem.lootTableItem(ModItems.tomb_bronze_helmet.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tomb_bronze_chestplate.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tomb_bronze_leggings.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tomb_bronze_boots.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tomb_bronze_sword.get()).setWeight(1));
        addInjectionTable(ClassicalAlchemy.MODID, "desert_pyramid", foo);

        // jungle_temple - shiny bronzes for the jungle god!
        foo = createChestPool(1, 1, 0.50F)
                .add(LootItem.lootTableItem(ModItems.pulchrum_bronze_sword.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.pulchrum_bronze_axe.get()).setWeight(1));
        addInjectionTable(ClassicalAlchemy.MODID, "jungle_temple", foo);

        // shipwreck -- bronzes don't rust
        foo = createChestPool(1, 1, 0.50F)
                .add(LootItem.lootTableItem(ModItems.large_pyropus_bronze_chunk.get()).setWeight(2)
                        .apply(SetItemCountFunction.setCount(RandomValueBounds.between(1, 3))))
                .add(LootItem.lootTableItem(ModItems.large_stannum_chunk.get()).setWeight(6)
                        .apply(SetItemCountFunction.setCount(RandomValueBounds.between(1, 1))))
                .add(LootItem.lootTableItem(ModItems.pyropus_bronze_ingot.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(RandomValueBounds.between(2, 4))))
                .add(LootItem.lootTableItem(ModItems.stannum_ingot.get()).setWeight(4)
                        .apply(SetItemCountFunction.setCount(RandomValueBounds.between(2, 3))))
                .add(LootItem.lootTableItem(ModItems.pulchrum_bronze_ingot.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(RandomValueBounds.between(1, 3))));
        addInjectionTable(ClassicalAlchemy.MODID, "shipwreck", foo);

        // underwater_ruin -- old, bronzes don't rust.
        foo = createChestPool(1, 1, 0.50F)
                .add(LootItem.lootTableItem(ModItems.tomb_bronze_axe.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tomb_bronze_pickaxe.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tomb_bronze_shovel.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.tomb_bronze_sword.get()).setWeight(1));
        addInjectionTable(ClassicalAlchemy.MODID, "underwater_ruin", foo);
        
        // village_smith -- applies to armorer, toolsmith, weaponsmith
        foo = createChestPool(1, 1, 0.25F)
                .add(LootItem.lootTableItem(ModItems.stannum_ingot.get()).setWeight(2)
                        .apply(SetItemCountFunction.setCount(RandomValueBounds.between(1, 3))))
                .add(LootItem.lootTableItem(ModItems.cuprum_ingot.get()).setWeight(2)
                        .apply(SetItemCountFunction.setCount(RandomValueBounds.between(1, 3))));
        addInjectionTable(ClassicalAlchemy.MODID, "village_smith", foo);
        
        return tables;
    } // end getTables()

} // end class
