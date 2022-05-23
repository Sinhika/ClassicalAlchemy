package mod.akkamaddi.classicalalchemy.init;

import mod.alexndr.simplecorelib.api.helpers.TagUtils;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags
{
    public static class Items
    {
        public static final TagKey<Item> INGOTS_COPPER = TagUtils.forgeTag("ingots/copper");
        public static final TagKey<Item> INGOTS_TIN = TagUtils.forgeTag("ingots/tin");
        public static final TagKey<Item> INGOTS_ARSENIDE_BRONZE = TagUtils.forgeTag("ingots/arsenide_bronze");
        public static final TagKey<Item> REAGENT_OLD_LACE = TagUtils.forgeTag("reagents/old_lace");
        
    } // end class Items

} // end class
