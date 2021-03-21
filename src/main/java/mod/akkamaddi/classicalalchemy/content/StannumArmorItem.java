package mod.akkamaddi.classicalalchemy.content;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class StannumArmorItem extends ArmorItem
{

    public StannumArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn)
    {
        super(materialIn, slot, builderIn);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        tooltip.add(new TranslationTextComponent("classicalalchemy.stannum_armor.info"));
    }

} // end class
