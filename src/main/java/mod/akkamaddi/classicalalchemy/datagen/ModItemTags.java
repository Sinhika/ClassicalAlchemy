package mod.akkamaddi.classicalalchemy.datagen;

import mod.akkamaddi.arsenic.datagen.ModBlockTags;
import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTags extends ItemTagsProvider
{

    public ModItemTags(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper)
    {
        super(dataGenerator,  new ModBlockTags(dataGenerator, existingFileHelper), ClassicalAlchemy.MODID, existingFileHelper);
    }

} // end class
