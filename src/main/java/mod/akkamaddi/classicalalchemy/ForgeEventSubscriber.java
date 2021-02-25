package mod.akkamaddi.classicalalchemy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.akkamaddi.classicalalchemy.content.ClassicalArmorMaterial;
import mod.alexndr.simplecorelib.helpers.ArmorUtils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ClassicalAlchemy.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ForgeEventSubscriber
{
    private static final Logger LOGGER = LogManager.getLogger(ClassicalAlchemy.MODID + " Forge Event Subscriber");
    
    @SubscribeEvent(receiveCanceled = true, priority= EventPriority.HIGHEST)
    public static void onLivingAttackEvent(LivingAttackEvent event)
    {
        // first, is it a player?
        if (event.getEntityLiving() instanceof PlayerEntity)
        {
            PlayerEntity player = (PlayerEntity) event.getEntityLiving();
            LOGGER.debug("caught LivingAttackEvent");

            // anvil damage and are they wearing full stannum armor?
            if ((event.getSource() == DamageSource.ANVIL) &&
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
