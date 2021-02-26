package mod.akkamaddi.classicalalchemy.datagen;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import mod.akkamaddi.classicalalchemy.init.ModItems;
import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTags extends ItemTagsProvider
{

    public ModItemTags(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper)
    {
        super(dataGenerator,  new ModBlockTags(dataGenerator, existingFileHelper), ClassicalAlchemy.MODID, existingFileHelper);
    }

    @Override
    protected void registerTags()
    {
        registerDustTags();
        registerNuggetTags();
        registerIngotTags();
    }

    private void registerNuggetTags()
    {
        this.getOrCreateBuilder(TagUtils.forgeTag("nuggets"))
            .addTag(TagUtils.forgeTag("nuggets/stannum"))
            .addTag(TagUtils.forgeTag("nuggets/cuprum"))
            .addTag(TagUtils.forgeTag("nuggets/pyropus_bronze"))
            .addTag(TagUtils.forgeTag("nuggets/pulchrum_bronze"))
            .addTag(TagUtils.forgeTag("nuggets/tomb_bronze"));
    
        this.getOrCreateBuilder(TagUtils.forgeTag("nuggets/stannum")).add(ModItems.stannum_nugget.get());
        this.getOrCreateBuilder(TagUtils.forgeTag("nuggets/cuprum")).add(ModItems.cuprum_nugget.get());
        this.getOrCreateBuilder(TagUtils.forgeTag("nuggets/pyropus_bronze")).add(ModItems.pyropus_bronze_nugget.get());
        this.getOrCreateBuilder(TagUtils.forgeTag("nuggets/pulchrum_bronze")).add(ModItems.pulchrum_bronze_nugget.get());
        this.getOrCreateBuilder(TagUtils.forgeTag("nuggets/tomb_bronze")).add(ModItems.tomb_bronze_nugget.get());
    } // end registerNuggetTags()
    
    private void registerIngotTags()
    {
        this.getOrCreateBuilder(TagUtils.forgeTag("ingots"))
            .addTag(TagUtils.forgeTag("ingots/stannum"))
            .addTag(TagUtils.forgeTag("ingots/cuprum"))
            .addTag(TagUtils.forgeTag("ingots/pyropus_bronze"))
            .addTag(TagUtils.forgeTag("ingots/pulchrum_bronze"))
            .addTag(TagUtils.forgeTag("ingots/tomb_bronze"));
        
        this.getOrCreateBuilder(TagUtils.forgeTag("ingots/stannum")).add(ModItems.stannum_ingot.get());
        this.getOrCreateBuilder(TagUtils.forgeTag("ingots/cuprum")).add(ModItems.cuprum_ingot.get());
        this.getOrCreateBuilder(TagUtils.forgeTag("ingots/pyropus_bronze")).add(ModItems.pyropus_bronze_ingot.get());
        this.getOrCreateBuilder(TagUtils.forgeTag("ingots/pulchrum_bronze")).add(ModItems.pulchrum_bronze_ingot.get());
        this.getOrCreateBuilder(TagUtils.forgeTag("ingots/tomb_bronze")).add(ModItems.tomb_bronze_ingot.get());
    } // end registerIngotTags()

    private void registerDustTags()
    {
        this.getOrCreateBuilder(TagUtils.forgeTag("dusts"))
            .addTag(TagUtils.forgeTag("dusts/stannum"))
            .addTag(TagUtils.forgeTag("dusts/cuprum"))
            .addTag(TagUtils.forgeTag("dusts/pyropus_bronze"))
            .addTag(TagUtils.forgeTag("dusts/pulchrum_bronze"))
            .addTag(TagUtils.forgeTag("dusts/tomb_bronze"));
        
        this.getOrCreateBuilder(TagUtils.forgeTag("dusts/stannum")).add(ModItems.stannum_dust.get());
        this.getOrCreateBuilder(TagUtils.forgeTag("dusts/cuprum")).add(ModItems.cuprum_dust.get());
        this.getOrCreateBuilder(TagUtils.forgeTag("dusts/pyropus_bronze")).add(ModItems.pyropus_bronze_dust.get());
        this.getOrCreateBuilder(TagUtils.forgeTag("dusts/pulchrum_bronze")).add(ModItems.pulchrum_bronze_dust.get());
        this.getOrCreateBuilder(TagUtils.forgeTag("dusts/tomb_bronze")).add(ModItems.tomb_bronze_dust.get());
    } // end registerDustTags()
   
} // end class
