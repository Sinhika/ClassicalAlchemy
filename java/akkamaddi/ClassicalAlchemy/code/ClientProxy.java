package akkamaddi.ClassicalAlchemy.code;

import akkamaddi.akkamaddiCore.api.CommonProxy;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderers()
    {
        // This is for rendering entities and so forth later on
        //Armor Renderers
        ClassicalAlchemyCore.rendererStannum = addArmor("stannum");
        ClassicalAlchemyCore.rendererCuprum = addArmor("cuprum");
        ClassicalAlchemyCore.rendererPyropusBronze = addArmor("pyropusBronze");
        ClassicalAlchemyCore.rendererTombBronze = addArmor("tombBronze");
    } // end registerRenderers

} // end class ClientProxy