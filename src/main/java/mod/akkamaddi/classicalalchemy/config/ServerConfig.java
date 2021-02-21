package mod.akkamaddi.classicalalchemy.config;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import net.minecraftforge.common.ForgeConfigSpec;

public final class ServerConfig
{
    final ForgeConfigSpec.BooleanValue serverEnableRecycling; // recipe flag
    

    ServerConfig(final ForgeConfigSpec.Builder builder)
    {
        builder.push("General");
        serverEnableRecycling = 
                builder.comment("Enable fusion furnace recycling of bronze items")
                .translation(ClassicalAlchemy.MODID + "config.EnableRecycling")
                .define("EnableRecycling", true);
        builder.pop();
        

    } // end ctor()
    
} // end class
