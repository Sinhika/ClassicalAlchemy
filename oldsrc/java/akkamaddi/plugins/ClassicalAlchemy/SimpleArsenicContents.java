package akkamaddi.plugins.ClassicalAlchemy;

import akkamaddi.api.core.ModContents;
import net.minecraft.item.Item;

public class SimpleArsenicContents extends ModContents
{
    public Class<?> items;

    public Content<Item>
    arsenideBronzeIngot,
    oldLaceChest;

    public SimpleArsenicContents()
    {
        if (!isModLoaded())
        {
            return;
        }

        try
        {
            items = Class.forName("akkamaddi.plugins.arsenic.Content");
        }
        catch (ClassNotFoundException e)
        {
            throw new ModReflectionFailException(e);
        }

        arsenideBronzeIngot = of(items, "arsenideBronzeIngot");
        oldLaceChest = of(items, "oldLaceChest");
    }

    @Override public String getModId()
    {
        return "arsenic";
    }
} // end class SimpleArsenicContents
