package mod.akkamaddi.classicalalchemy.content;

import java.util.List;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class StannumArmorItem extends ArmorItem
{

    public StannumArmorItem(ArmorMaterial materialIn, EquipmentSlot slot, Properties builderIn)
    {
        super(materialIn, slot, builderIn);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
    {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        tooltip.add(Component.translatable("classicalalchemy.stannum_armor.info"));
    }

} // end class
