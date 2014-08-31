package akkamaddi.ClassicalAlchemy.code;

import akkamaddi.akkamaddiCore.api.SimpleArmorWithEffect;
import akkamaddi.akkamaddiCore.api.SimpleArmorWithEffect.ARMOR_TYPE;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

public class HandlerArmor 
{
	// effects
	@SubscribeEvent
	public void onFallDamage(LivingAttackEvent event) 
	{
		if (event.entity instanceof EntityPlayer) 
		{
			EntityPlayer player = (EntityPlayer) event.entity;
			ItemStack [] armorbits = new ItemStack[4];
			SimpleArmorWithEffect.getArmorPieces(player, armorbits);

			if (armorbits[0] != null && armorbits[1] != null && armorbits[2] != null
					&& armorbits[3] != null) 
			{
				if (armorbits[ARMOR_TYPE.HELM.ordinal()].getItem() == ClassicalAlchemyCore.stannumHelm
						&& armorbits[ARMOR_TYPE.CHEST.ordinal()].getItem() == ClassicalAlchemyCore.stannumChest
						&& armorbits[ARMOR_TYPE.LEGS.ordinal()].getItem() == ClassicalAlchemyCore.stannumLegs
						&& armorbits[ARMOR_TYPE.BOOTS.ordinal()].getItem() == ClassicalAlchemyCore.stannumBoots) {
					if (event.source.equals(DamageSource.anvil)) {
						event.setCanceled(true);
						// return;
					}
				} // end if all armor stannum
			} // end-if wearing armor
		}  // end-if player
	} // end onFallDamage()
} // end class HandlerArmor
