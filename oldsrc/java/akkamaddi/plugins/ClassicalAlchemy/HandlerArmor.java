package akkamaddi.plugins.ClassicalAlchemy;

import akkamaddi.api.core.SimpleArmorWithEffect;
import akkamaddi.api.core.SimpleArmorWithEffect.ARMOR_TYPE;
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
				if (armorbits[ARMOR_TYPE.HELM.ordinal()].getItem() == Content.stannumHelm
						&& armorbits[ARMOR_TYPE.CHEST.ordinal()].getItem() == Content.stannumChest
						&& armorbits[ARMOR_TYPE.LEGS.ordinal()].getItem() == Content.stannumLegs
						&& armorbits[ARMOR_TYPE.BOOTS.ordinal()].getItem() == Content.stannumBoots) {
					if (event.source.equals(DamageSource.anvil)) 
					{
						event.setCanceled(true);
					}
				} // end if all armor stannum
			} // end-if wearing armor
		}  // end-if player
	} // end onFallDamage()
} // end class HandlerArmor
