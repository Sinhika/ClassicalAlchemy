package mod.akkamaddi.classicalalchemy.config;

import net.minecraftforge.fml.config.ModConfig;

public final class ConfigHelper
{
    public static void bakeClient(final ModConfig config) 
    {
    } // end bakeClient

    public static void bakeServer(final ModConfig config) 
    {
        // recipe flags.
        ClassicalAlchemyConfig.INSTANCE.putFlag("recycling_enabled", 
                ConfigHolder.SERVER.serverEnableRecycling.get());
        ClassicalAlchemyConfig.INSTANCE.putFlag("stannum_making", 
                ConfigHolder.SERVER.serverEnableStannumMaking.get());
        ClassicalAlchemyConfig.INSTANCE.putFlag("cuprum_making", 
                ConfigHolder.SERVER.serverEnableCuprumMaking.get());
        ClassicalAlchemyConfig.INSTANCE.putFlag("pyropus_bronze_making", 
                ConfigHolder.SERVER.serverEnablePyropusBronzeMaking.get());
        ClassicalAlchemyConfig.INSTANCE.putFlag("pulchrum_bronze_making", 
                ConfigHolder.SERVER.serverEnablePulchrumBronzeMaking.get());
        ClassicalAlchemyConfig.INSTANCE.putFlag("tomb_bronze_making", 
                ConfigHolder.SERVER.serverEnableTombBronzeMaking.get());
    } // end bakeServer()
} // end class
