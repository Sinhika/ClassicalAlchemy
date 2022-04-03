package mod.akkamaddi.classicalalchemy.init;

import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.world.item.Item;
import net.minecraft.tags.Tag;

public class ModTags
{
    public static class Items
    {
        public static final Tag.Named<Item> INGOTS_COPPER = TagUtils.forgeTag("ingots/copper");
        public static final Tag.Named<Item> INGOTS_TIN = TagUtils.forgeTag("ingots/tin");
        public static final Tag.Named<Item> INGOTS_ARSENIDE_BRONZE = TagUtils.forgeTag("ingots/arsenide_bronze");
        public static final Tag.Named<Item> REAGENT_OLD_LACE = TagUtils.forgeTag("reagents/old_lace");
        
    } // end class Items

} // end class
