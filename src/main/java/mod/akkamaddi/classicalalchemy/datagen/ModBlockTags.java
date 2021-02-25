package mod.akkamaddi.classicalalchemy.datagen;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTags extends BlockTagsProvider
{

    public ModBlockTags(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, ClassicalAlchemy.MODID, existingFileHelper);
    }

} // end class
