package mod.akkamaddi.classicalalchemy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.akkamaddi.classicalalchemy.config.ConfigHolder;
import mod.akkamaddi.classicalalchemy.init.ModBlocks;
import mod.akkamaddi.classicalalchemy.init.ModCreativeTabs;
import mod.akkamaddi.classicalalchemy.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ClassicalAlchemy.MODID)
public class ClassicalAlchemy
{
    public static final String MODID = "classicalalchemy";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    
    public ClassicalAlchemy()
    {
        LOGGER.debug("Hello from akkamaddi's Classical Alchemy!");
        final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
        
        // Register Configs
        modLoadingContext.registerConfig(ModConfig.Type.COMMON, ConfigHolder.SERVER_SPEC);
        modLoadingContext.registerConfig(ModConfig.Type.CLIENT, ConfigHolder.CLIENT_SPEC);
    } // end ctor

} // end class
