package mod.akkamaddi.classicalalchemy;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.akkamaddi.classicalalchemy.config.ClassicalAlchemyConfig;
import mod.akkamaddi.classicalalchemy.config.ConfigHelper;
import mod.akkamaddi.classicalalchemy.config.ConfigHolder;
import mod.akkamaddi.classicalalchemy.init.ModBlocks;
import mod.alexndr.simplecorelib.api.config.FlagCondition;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = ClassicalAlchemy.MODID,  bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber
{
    private static final Logger LOGGER = LogManager.getLogger(ClassicalAlchemy.MODID + " Mod Event Subscriber");

    /**
     * For best inter-mod compatibility, run ore generation in a DeferredWorkQueue, per dieseiben07.
     * @param event
     */
    @SubscribeEvent
    public static void onCommonSetup(final FMLCommonSetupEvent event)
    {
//        event.enqueueWork(() -> {
//        });
        LOGGER.debug("Common setup done");
    } // end onCommonSetup

    /**
     * This method will be called by Forge when it is time for the mod to register its Items.
     * This method will always be called after the Block registry method.
     */
    @SubscribeEvent
    public static void onRegisterItems(final RegisterEvent event) 
    {
        if (event.getRegistryKey() == Registries.ITEM)
        {
	         // Automatically register BlockItems for all our Blocks
	        ModBlocks.BLOCKS.getEntries().stream()
	                .map(RegistryObject::get)
	                // You can do extra filtering here if you don't want some blocks to have an BlockItem automatically registered for them
	                // .filter(block -> needsItemBlock(block))
	                // Register the BlockItem for the block
	                .forEach(block -> {
	                    // Create the new BlockItem with the block and it's properties
	                    final BlockItem blockItem = new BlockItem(block, new Item.Properties());
	                    // Register the BlockItem
	                    event.register(Registries.ITEM,  helper -> {
	                        helper.register(ForgeRegistries.BLOCKS.getKey(block), blockItem);
	                    });
	                });
	        LOGGER.debug("Registered BlockItems");
        }
    }

    @SubscribeEvent
    public static void onModConfigEvent(final ModConfigEvent event)
    {
        final ModConfig config = event.getConfig();

        // Rebake the configs when they change
        if (config.getSpec() == ConfigHolder.CLIENT_SPEC)
        {
            ConfigHelper.bakeClient(config);
        }
        else if (config.getSpec() == ConfigHolder.SERVER_SPEC)
        {
            ConfigHelper.bakeServer(config);
        }
    } // onModConfigEvent

    @SubscribeEvent
    public static void onRegisterRecipeSerializers(@Nonnull RegisterEvent event)
    {
        if (event.getRegistryKey() == Registries.RECIPE_SERIALIZER)
        {
            CraftingHelper.register(new FlagCondition.Serializer(ClassicalAlchemyConfig.INSTANCE, 
                new ResourceLocation(ClassicalAlchemy.MODID, "flag")));
        }
    } // end registerRecipeSerializers
    
} // end class
