package mod.akkamaddi.classicalalchemy.config;

import java.util.HashMap;
import java.util.Map;

import mod.alexndr.simplecorelib.config.ISimpleConfig;

public class ClassicalAlchemyConfig implements ISimpleConfig
{
    // recipe flags
    private static Map<String, Boolean> flags = new HashMap<>();
    public static ClassicalAlchemyConfig INSTANCE = new ClassicalAlchemyConfig();
    public static boolean addChestLoot;

    // other variables
    
    
    @Override
    public void clear()
    {
        flags.clear();
    }

    @Override
    public boolean getFlag(String n)
    {
        Boolean obj = flags.get(n);
        return obj != null && obj;
    }

    @Override
    public void putFlag(String n, boolean val)
    {
        flags.put(n, val);
    }
} // end class
