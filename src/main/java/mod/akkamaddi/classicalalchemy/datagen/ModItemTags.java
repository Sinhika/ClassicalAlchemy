package mod.akkamaddi.classicalalchemy.datagen;

import java.util.concurrent.CompletableFuture;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import mod.akkamaddi.classicalalchemy.init.ModBlocks;
import mod.akkamaddi.classicalalchemy.init.ModItems;
import mod.alexndr.simplecorelib.api.datagen.MiningItemTags;
import mod.alexndr.simplecorelib.api.helpers.TagUtils;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTags extends MiningItemTags
{

    public ModItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
			CompletableFuture<TagLookup<Block>> blockTagProvider, ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, blockTagProvider, ClassicalAlchemy.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider)
    {
        super.addTags(lookupProvider);
        registerStorageTags();
        registerDustTags();
        registerNuggetTags();
        registerIngotTags();
        registerToolTags(ModItems.ITEMS);
        registerArmorTags(ModItems.ITEMS);
    }

    /**
     * Create standard forge tags for storage blocks.
     */
    private void registerStorageTags()
    {
        this.tag(TagUtils.forgeTag("storage_blocks"))
            .addTag(TagUtils.forgeTag("storage_blocks/stannum"))
            .addTag(TagUtils.forgeTag("storage_blocks/cuprum"))
            .addTag(TagUtils.forgeTag("storage_blocks/pyropus_bronze"))
            .addTag(TagUtils.forgeTag("storage_blocks/pulchrum_bronze"))
            .addTag(TagUtils.forgeTag("storage_blocks/tomb_bronze"));
        
        this.tag(TagUtils.forgeTag("storage_blocks/stannum"))
            .add(ModBlocks.stannum_block.get().asItem());
        this.tag(TagUtils.forgeTag("storage_blocks/cuprum"))
            .add(ModBlocks.cuprum_block.get().asItem());
        this.tag(TagUtils.forgeTag("storage_blocks/pyropus_bronze"))
            .add(ModBlocks.pyropus_bronze_block.get().asItem());
        this.tag(TagUtils.forgeTag("storage_blocks/pulchrum_bronze"))
            .add(ModBlocks.pulchrum_bronze_block.get().asItem());
        this.tag(TagUtils.forgeTag("storage_blocks/tomb_bronze"))
            .add(ModBlocks.tomb_bronze_block.get().asItem());
    } // end registerStorageTags
    

    private void registerNuggetTags()
    {
        this.tag(TagUtils.forgeTag("nuggets"))
            .addTag(TagUtils.forgeTag("nuggets/stannum"))
            .addTag(TagUtils.forgeTag("nuggets/cuprum"))
            .addTag(TagUtils.forgeTag("nuggets/pyropus_bronze"))
            .addTag(TagUtils.forgeTag("nuggets/pulchrum_bronze"))
            .addTag(TagUtils.forgeTag("nuggets/tomb_bronze"));
    
        this.tag(TagUtils.forgeTag("nuggets/stannum")).add(ModItems.stannum_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/cuprum")).add(ModItems.cuprum_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/pyropus_bronze")).add(ModItems.pyropus_bronze_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/pulchrum_bronze")).add(ModItems.pulchrum_bronze_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/tomb_bronze")).add(ModItems.tomb_bronze_nugget.get());
    } // end registerNuggetTags()
    
    private void registerIngotTags()
    {
        this.tag(TagUtils.forgeTag("ingots"))
            .addTag(TagUtils.forgeTag("ingots/stannum"))
            .addTag(TagUtils.forgeTag("ingots/cuprum"))
            .addTag(TagUtils.forgeTag("ingots/pyropus_bronze"))
            .addTag(TagUtils.forgeTag("ingots/pulchrum_bronze"))
            .addTag(TagUtils.forgeTag("ingots/tomb_bronze"));
        
        this.tag(TagUtils.forgeTag("ingots/stannum")).add(ModItems.stannum_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/cuprum")).add(ModItems.cuprum_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/pyropus_bronze")).add(ModItems.pyropus_bronze_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/pulchrum_bronze")).add(ModItems.pulchrum_bronze_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/tomb_bronze")).add(ModItems.tomb_bronze_ingot.get());
    } // end registerIngotTags()

    private void registerDustTags()
    {
        this.tag(TagUtils.forgeTag("dusts"))
            .addTag(TagUtils.forgeTag("dusts/stannum"))
            .addTag(TagUtils.forgeTag("dusts/cuprum"))
            .addTag(TagUtils.forgeTag("dusts/pyropus_bronze"))
            .addTag(TagUtils.forgeTag("dusts/pulchrum_bronze"))
            .addTag(TagUtils.forgeTag("dusts/tomb_bronze"));
        
        this.tag(TagUtils.forgeTag("dusts/stannum")).add(ModItems.stannum_dust.get());
        this.tag(TagUtils.forgeTag("dusts/cuprum")).add(ModItems.cuprum_dust.get());
        this.tag(TagUtils.forgeTag("dusts/pyropus_bronze")).add(ModItems.pyropus_bronze_dust.get());
        this.tag(TagUtils.forgeTag("dusts/pulchrum_bronze")).add(ModItems.pulchrum_bronze_dust.get());
        this.tag(TagUtils.forgeTag("dusts/tomb_bronze")).add(ModItems.tomb_bronze_dust.get());
    } // end registerDustTags()
   
} // end class
