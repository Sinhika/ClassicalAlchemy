package mod.akkamaddi.classicalalchemy.init;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;

public class ModTags
{
    public static class Items
    {
        public static final ITag.INamedTag<Item> INGOTS_COPPER = forgeTag("ingots/copper");
        public static final ITag.INamedTag<Item> INGOTS_TIN = forgeTag("ingots/tin");
        public static final ITag.INamedTag<Item> INGOTS_ARSENIDE_BRONZE = forgeTag("ingots/arsenide_bronze");
        public static final ITag.INamedTag<Item> REAGENT_OLD_LACE = forgeTag("reagents/old_lace");
        
        private static ITag.INamedTag<Item> forgeTag(String name) {
            return ItemTags.bind("forge:" + name);
        }
    } // end class Items

} // end class
