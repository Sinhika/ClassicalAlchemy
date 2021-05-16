package mod.akkamaddi.classicalalchemy.config;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import net.minecraftforge.common.ForgeConfigSpec;

public final class ServerConfig
{
    // general
    final ForgeConfigSpec.BooleanValue serverAddChestLoot;
    
    final ForgeConfigSpec.BooleanValue serverEnableRecycling; // recipe flag
    final ForgeConfigSpec.BooleanValue serverEnableStannumMaking; // recipe flag
    final ForgeConfigSpec.BooleanValue serverEnableCuprumMaking; // recipe flag
    final ForgeConfigSpec.BooleanValue serverEnablePyropusBronzeMaking; // recipe flag
    final ForgeConfigSpec.BooleanValue serverEnablePulchrumBronzeMaking; // recipe flag
    final ForgeConfigSpec.BooleanValue serverEnableTombBronzeMaking; // recipe flag
    

    ServerConfig(final ForgeConfigSpec.Builder builder)
    {
        builder.push("General");
        serverAddChestLoot = builder.comment("Allow Fusion loot to be added to chests?")
                .translation(ClassicalAlchemy.MODID + ".config.addChestLoot")
                .define("AddChestLoot", true);
        serverEnableRecycling = 
                builder.comment("Enable fusion furnace recycling of mod items")
                .translation(ClassicalAlchemy.MODID + "config.EnableRecycling")
                .define("EnableRecycling", true);
        builder.pop();
        builder.push("Stannum");
        serverEnableStannumMaking =
                builder.comment("Enable fusion furnace creation of stannum items")
                .translation(ClassicalAlchemy.MODID + "config.EnableStannumMaking")
                .define("EnableStannumMaking", true);
        builder.pop();
        builder.push("Cuprum");
        serverEnableCuprumMaking = 
            builder.comment("Enable fusion furnace creation of cuprum items")
            .translation(ClassicalAlchemy.MODID + "config.EnableCuprumMaking")
            .define("EnableCuprumMaking", true);
        builder.pop();
        builder.push("Pyropus Bronze");
        serverEnablePyropusBronzeMaking = 
                builder.comment("Enable fusion furnace creation of pyropus bronze items")
                .translation(ClassicalAlchemy.MODID + "config.EnablePyropusBronzeMaking")
                .define("EnablePyropusBronzeMaking", true);
        builder.pop();
        builder.push("Pulchrum Bronze");
        serverEnablePulchrumBronzeMaking = 
                builder.comment("Enable fusion furnace creation of pulchrum bronze items")
                .translation(ClassicalAlchemy.MODID + "config.EnablePulchrumBronzeMaking")
                .define("EnablePulchrumBronzeMaking", true);
        builder.pop();
        builder.push("Tomb Bronze");
        serverEnableTombBronzeMaking = 
                builder.comment("Enable fusion furnace creation of tomb bronze items (if Arsenic & Lace mod loaded)")
                .translation(ClassicalAlchemy.MODID + "config.EnableTombBronzeMaking")
                .define("EnableTombBronzeMaking", true);
        builder.pop();
    } // end ctor()
    
} // end class
