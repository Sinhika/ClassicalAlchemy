package mod.akkamaddi.classicalalchemy.datagen;

import mod.akkamaddi.classicalalchemy.init.ModBlocks;
import mod.alexndr.simplecorelib.api.datagen.SimpleBlockLootSubProvider;

public class ClassicalLootTableSubprovider extends SimpleBlockLootSubProvider
{

    @Override
	protected void generate() 
    {
    	dropSelf(ModBlocks.stannum_block.get());
    	dropSelf(ModBlocks.cuprum_block.get());
    	dropSelf(ModBlocks.pyropus_bronze_block.get());
    	dropSelf(ModBlocks.pulchrum_bronze_block.get());
    	dropSelf(ModBlocks.tomb_bronze_block.get());
        
    } // end getTables()

} // end class
