package akkamaddi.plugins.ClassicalAlchemy;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import akkamaddi.api.core.ASettings;
import alexndr.api.core.LogHelper;

public class Settings extends ASettings 
{
	
	public static void createOrLoadSettings(FMLPreInitializationEvent event) 
	{
		config = GetConfig(event, "akkamaddi", "classicalalchemy.cfg");

		try {
			LogHelper.verboseInfo(ModInfo.ID, "Loading Settings...");
			config.load();
			genericSettings(ModInfo.ID, ModInfo.NAME);

			// Armor Stat Modification
			armorStatDefaults();
			if (enableArmorStatModification) {
				LogHelper.verboseInfo(ModInfo.ID,
						"Armor Stat Modification enabled!");
				customizeArmorStats();
			} // end-if enableArmorStatModification

			// Block Stat Modification
			blockStatDefaults();
			if (enableBlockStatModification) {
				LogHelper.verboseInfo(ModInfo.ID,
						"Block Stat Modification enabled!");
				customizeBlockStats();
			}

			toolStatDefaults();
			if (enableToolStatModification) {
				LogHelper.verboseInfo(ModInfo.ID,
						"Tool Stat Modification enabled!");
				customizeToolStats();
			}
		} // end-try
		catch (Exception e) {
			LogHelper
					.severe(ModInfo.ID,
							"Settings failed to load correctly. The plugin may not function correctly");
		}

		finally {
			config.save();
			LogHelper.verboseInfo(ModInfo.ID, "Settings loaded successfully");
		}
	} // end createOrLoadSettings()


	/**
	 * Sets the default armor stats.
	 */
	public static void armorStatDefaults() {}
	
	/**
	 * sets customized armor stats.
	 */
	public static void customizeArmorStats() {}
	
	/**
	 * Sets the default block stats.
	 */
	public static void blockStatDefaults() {}

	/**
	 * sets customized block stats.
	 */
	public static void customizeBlockStats() {}
	
	/**
	 * Sets the default tool stats.
	 */
	public static void toolStatDefaults() {}

	/**
	 * set customized tool stats.
	 */
	public static void customizeToolStats() {}

} // end class Settings
