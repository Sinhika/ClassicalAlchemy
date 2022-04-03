package mod.akkamaddi.classicalalchemy.init;

import java.util.function.Supplier;

import javax.annotation.Nonnull;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public final class ModTabGroups
{
    public static final CreativeModeTab MOD_ITEM_GROUP = 
            new ModTabGroup(ClassicalAlchemy.MODID, () -> new ItemStack(ModBlocks.pyropus_bronze_block.get().asItem()));

    public static final class ModTabGroup extends CreativeModeTab
    {

        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        /**
         * @param name  String: mod id
         * @param iconSupplier
         */
        public ModTabGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier)
        {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack makeIcon() {
            return iconSupplier.get();
        }

    } // end ModTabGroup()

} // end class
