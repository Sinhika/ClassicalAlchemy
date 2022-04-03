package mod.akkamaddi.classicalalchemy.datagen;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.mojang.datafixers.util.Pair;

import mod.akkamaddi.classicalalchemy.init.ModBlocks;
import mod.alexndr.simplecorelib.datagen.BlockLootTableProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.resources.ResourceLocation;

public class ClassicalLootTableProvider extends BlockLootTableProvider
{

    public ClassicalLootTableProvider(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootContextParamSet>> getTables()
    {
        tables.clear();
        standardDropTable(ModBlocks.stannum_block.get());
        standardDropTable(ModBlocks.cuprum_block.get());
        standardDropTable(ModBlocks.pyropus_bronze_block.get());
        standardDropTable(ModBlocks.pulchrum_bronze_block.get());
        standardDropTable(ModBlocks.tomb_bronze_block.get());
        
        return tables;
    } // end getTables()

} // end class
