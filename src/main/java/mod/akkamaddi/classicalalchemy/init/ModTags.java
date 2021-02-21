package mod.akkamaddi.classicalalchemy.init;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;

public class ModTags
{
    public static class Items
    {
        public static final ITag.INamedTag<Item> INGOTS_COPPER = forgeTag("ingots/copper");
        
        private static ITag.INamedTag<Item> forgeTag(String name) {
            return ItemTags.makeWrapperTag("forge:" + name);
        }
    } // end class Items

} // end class
