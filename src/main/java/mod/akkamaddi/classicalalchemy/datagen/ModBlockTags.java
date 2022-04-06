package mod.akkamaddi.classicalalchemy.datagen;

import java.util.List;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import mod.akkamaddi.classicalalchemy.init.ModBlocks;
import mod.alexndr.simplecorelib.datagen.MiningBlockTags;
import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockTags extends MiningBlockTags
{

    public ModBlockTags(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, ClassicalAlchemy.MODID, existingFileHelper);
    }
    
    @Override
    protected void addTags()
    {
        super.addTags();
        registerStorageBlockTags();
        registerBeaconBlockTags();
    } // end registerTags()
    
    
    @Override
    protected void registerMiningTags()
    {
        // all the registered blocks are mineable.
        List<Block> mineables = ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).toList();

        // (mineable, stone, iron, diamond, netherite)
        this.registerMineableTags(mineables, List.of(), mineables, List.of(), List.of());
    }

    /**
     * Create standard forge tags for storage blocks.
     */
    private void registerStorageBlockTags()
    {
        this.tag(TagUtils.forgeBlockTag("storage_blocks"))
            .addTag(TagUtils.forgeBlockTag("storage_blocks/stannum"))
            .addTag(TagUtils.forgeBlockTag("storage_blocks/cuprum"))
            .addTag(TagUtils.forgeBlockTag("storage_blocks/pyropus_bronze"))
            .addTag(TagUtils.forgeBlockTag("storage_blocks/pulchrum_bronze"))
            .addTag(TagUtils.forgeBlockTag("storage_blocks/tomb_bronze"));
        
        this.tag(TagUtils.forgeBlockTag("storage_blocks/stannum"))
            .add(ModBlocks.stannum_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_blocks/cuprum"))
            .add(ModBlocks.cuprum_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_blocks/pyropus_bronze"))
            .add(ModBlocks.pyropus_bronze_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_blocks/pulchrum_bronze"))
            .add(ModBlocks.pulchrum_bronze_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_blocks/tomb_bronze"))
            .add(ModBlocks.tomb_bronze_block.get());
    } // end registerStorageBlockTags
    
    /**
     * Identify metal blocks as beacon block bases.
     */
    private void registerBeaconBlockTags()
    {
        this.tag(BlockTags.BEACON_BASE_BLOCKS)
            .add(ModBlocks.stannum_block.get())
            .add(ModBlocks.cuprum_block.get())
            .add(ModBlocks.pyropus_bronze_block.get())
            .add(ModBlocks.pulchrum_bronze_block.get())
            .add(ModBlocks.tomb_bronze_block.get());
    } // end registerBeaconBlockTags
    
} // end class
