package mod.akkamaddi.classicalalchemy.loot;

import mod.alexndr.simplecorelib.api.helpers.InjectionTableLookup;

@SuppressWarnings("serial")
public class ClassicalAlchemyInjectionLookup extends InjectionTableLookup
{

    public ClassicalAlchemyInjectionLookup()
    {
        super();
        this.put("desert_pyramid", "desert_pyramid");
        this.put("jungle_temple", "jungle_temple");
        AddOceanAliases();
        this.put("village_armorer", "village_smith");
        this.put("village_toolsmith", "village_smith");
        this.put("village_weaponsmith", "village_smith");
    }

} // end class
