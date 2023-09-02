package mod.akkamaddi.classicalalchemy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.akkamaddi.classicalalchemy.config.ClassicalAlchemyConfig;
import mod.akkamaddi.classicalalchemy.content.ClassicalArmorMaterial;
import mod.akkamaddi.classicalalchemy.loot.ClassicalAlchemyInjectionLookup;
import mod.alexndr.simplecorelib.api.helpers.ArmorUtils;
import mod.alexndr.simplecorelib.api.helpers.LootUtils;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ClassicalAlchemy.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ForgeEventSubscriber
{
    private static final Logger LOGGER = LogManager.getLogger(ClassicalAlchemy.MODID + " Forge Event Subscriber");
    private static final ClassicalAlchemyInjectionLookup lootLookupMap = new ClassicalAlchemyInjectionLookup();
   
    /**
     * add mod loot to loot tables. Code heavily based on Botania's LootHandler, which
     * neatly solves the problem when I couldn't figure it out.
     */
    @SubscribeEvent
    public static void LootLoad(final LootTableLoadEvent event)
    {
        if (ClassicalAlchemyConfig.addChestLoot)
        {
            LootUtils.LootLoadHandler(ClassicalAlchemy.MODID, event, lootLookupMap);
        } // end-if config allows
    } // end LootLoad()

    
    @SubscribeEvent(receiveCanceled = true, priority= EventPriority.HIGHEST)
    public static void onLivingAttackEvent(LivingAttackEvent event)
    {
        // first, is it a player?
        if (event.getEntity() instanceof Player)
        {
            Player player = (Player) event.getEntity();
            LOGGER.debug("caught LivingAttackEvent");

            // anvil damage and are they wearing full stannum armor?
            if ((event.getSource().is(DamageTypes.FALLING_ANVIL)) &&
                    ArmorUtils.isPlayerWearingFullSet(player,
                                               ClassicalArmorMaterial.STANNUM))
            {
                // pro-forma cancelable check.
                if (event.isCancelable()) event.setCanceled(true);
                LOGGER.debug("Canceled anvil damage because of stannum");
            } // end-if full set of Illumenite and fall damage
        } // end-if player
    } // end onLivingHurtEvent

} // end class
