package mod.akkamaddi.classicalalchemy.init;

import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;

public class ModTags
{
    public static class Items
    {
        public static final ITag.INamedTag<Item> INGOTS_COPPER = TagUtils.forgeTag("ingots/copper");
        public static final ITag.INamedTag<Item> INGOTS_TIN = TagUtils.forgeTag("ingots/tin");
        public static final ITag.INamedTag<Item> INGOTS_ARSENIDE_BRONZE = TagUtils.forgeTag("ingots/arsenide_bronze");
        public static final ITag.INamedTag<Item> REAGENT_OLD_LACE = TagUtils.forgeTag("reagents/old_lace");
        
    } // end class Items

} // end class
