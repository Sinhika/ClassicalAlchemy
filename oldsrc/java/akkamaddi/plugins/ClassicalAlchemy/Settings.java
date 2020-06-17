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
	public static void armorStatDefaults() 
	{
		stannumArmorDurability = 14;
		stannumArmorDamageReduction = new int[] { 2, 4, 3, 2 };
		stannumArmorEnchantability = 10;
		cuprumArmorDurability = 13;
		cuprumArmorDamageReduction = new int[] { 2, 4, 3, 2 };
		cuprumArmorEnchantability = 9;
		pyropusBronzeArmorDurability = 20;
		pyropusBronzeArmorDamageReduction = new int[] { 4, 5, 4, 2 };
		pyropusBronzeArmorEnchantability = 18;
		tombBronzeArmorDurability = 24;
		tombBronzeArmorDamageReduction = new int[] { 4, 6, 5, 4 };
		tombBronzeArmorEnchantability = 28;
		
	} // end armorStatDefaults()
	
	/**
	 * sets customized armor stats.
	 */
	public static void customizeArmorStats() 
	{
		stannumArmorDurability = config.getInt("Stannum Armor Durability",
				"Armor Stat Modification", stannumArmorDurability, 0, 255,
				"Controls the durability of Stannum Armor.");
		stannumArmorDamageReduction = config.get("Armor Stat Modification",
				"Stannum Armor Damage Reduction Array",
				stannumArmorDamageReduction).getIntList();
		stannumArmorEnchantability = config.getInt(
				"Stannum Armor Enchantability", "Armor Stat Modification", 
				stannumArmorEnchantability,
				0, 255, "Controls the enchantability of Stannum Armor.");

		cuprumArmorDurability = config.getInt(
				"Cuprum Armor Durability", "Armor Stat Modification",
				cuprumArmorDurability, 0, 255,
				"Controls the durability of Cuprum Armor.");
		cuprumArmorDamageReduction = config.get(
				"Armor Stat Modification",
				"Cuprum Armor Damage Reduction Array",
				cuprumArmorDamageReduction).getIntList();
		cuprumArmorEnchantability = config.getInt(
				"Cuprum Armor Enchantability",
				"Armor Stat Modification", cuprumArmorEnchantability, 0, 255,
				"Controls the enchantability of Cuprum Armor.");

		pyropusBronzeArmorDurability = config.getInt("Pyropus Bronze Armor Durability",
				"Armor Stat Modification", pyropusBronzeArmorDurability, 0, 255,
				"Controls the durability of Pyropus Bronze Armor.");
		pyropusBronzeArmorDamageReduction = config.get("Armor Stat Modification",
				"Pyropus Bronze Armor Damage Reduction Array",
				pyropusBronzeArmorDamageReduction).getIntList();
		pyropusBronzeArmorEnchantability = config.getInt(
				"Pyropus Bronze Armor Enchantability", "Armor Stat Modification", 
				pyropusBronzeArmorEnchantability,
				0, 255, "Controls the enchantability of Pyropus Bronze Armor.");

		tombBronzeArmorDurability = config.getInt(
				"Tomb Bronze Armor Durability", "Armor Stat Modification",
				tombBronzeArmorDurability, 
				0, 255, "Controls the durability of Tomb Bronze Armor.");
		tombBronzeArmorDamageReduction = config.get(
				"Armor Stat Modification",
				"Tomb Bronze Armor Damage Reduction Array",
				tombBronzeArmorDamageReduction).getIntList();
		tombBronzeArmorEnchantability = config.getInt(
				"Tomb Bronze Armor Enchantability",
				"Armor Stat Modification", tombBronzeArmorEnchantability, 0, 255,
				"Controls the enchantability of Tomb Bronze Armor.");
		
	} // end customizeArmorStats()
	
	/**
	 * Sets the default block stats.
	 */
	public static void blockStatDefaults() 
	{
		stannumHardness = 4.0F;
		stannumResistance = 8.0F;
		stannumHarvestLevel = 0;
		cuprumHardness = 8.0F;
		cuprumResistance = 16.0F;
		cuprumHarvestLevel = 0;
		pyropusBronzeHardness = 10.0F;
		pyropusBronzeResistance = 18.0F ;
		pyropusBronzeHarvestLevel = 0;
		pulchrumBronzeHardness = 8.0F;
		pulchrumBronzeResistance = 20.0F;
		pulchrumBronzeHarvestLevel = 0;
		tombBronzeHardness =12.0F ;
		tombBronzeResistance = 24.0F;
		tombBronzeHarvestLevel = 0;
		
	} // end blockStatDefaults()

	/**
	 * sets customized block stats.
	 */
	public static void customizeBlockStats() 
	{
		stannumHardness = config.getFloat("Stannum Hardness",
				"Block Stat Modification", stannumHardness, 0.0F, 32000.0F,
				"How many hits to break a block");
		stannumResistance = config.getFloat("Stannum Resistance",
				"Block Stat Modification", stannumResistance, 0.0F, 32000.0F,
				"Explosion Resistance");
		stannumHarvestLevel = config.getInt("Stannum Harvest Level",
				"Block Stat Modification", stannumHarvestLevel, 0, 255,
				"Tool level required to harvest this block");

		cuprumHardness = config.getFloat("Cuprum Hardness",
				"Block Stat Modification", cuprumHardness, 0.0F, 32000.0F,
				"How many hits to break a block");
		cuprumResistance = config.getFloat("Cuprum Resistance",
				"Block Stat Modification", cuprumResistance, 0.0F, 32000.0F,
				"Explosion Resistance");
		cuprumHarvestLevel = config.getInt("Cuprum Harvest Level",
				"Block Stat Modification", cuprumHarvestLevel, 0, 255,
				"Tool level required to harvest this block");

		pyropusBronzeHardness = config.getFloat("Pyropus Bronze Hardness",
				"Block Stat Modification", pyropusBronzeHardness, 0.0F, 32000.0F,
				"How many hits to break a block");
		pyropusBronzeResistance = config.getFloat("Pyropus Bronze Resistance",
				"Block Stat Modification", pyropusBronzeResistance, 0.0F, 32000.0F,
				"Explosion Resistance");
		pyropusBronzeHarvestLevel = config.getInt("Pyropus Bronze Harvest Level",
				"Block Stat Modification", pyropusBronzeHarvestLevel, 0, 255,
				"Tool level required to harvest this block");

		pulchrumBronzeHardness = config.getFloat("Pulchrum Bronze Hardness",
				"Block Stat Modification", pulchrumBronzeHardness, 0.0F, 32000.0F,
				"How many hits to break a block");
		pulchrumBronzeResistance = config.getFloat("Pulchrum Bronze Resistance",
				"Block Stat Modification", pulchrumBronzeResistance, 0.0F, 32000.0F,
				"Explosion Resistance");
		pulchrumBronzeHarvestLevel = config.getInt("Pulchrum Bronze Harvest Level",
				"Block Stat Modification", pulchrumBronzeHarvestLevel, 0, 255,
				"Tool level required to harvest this block");

		tombBronzeHardness = config.getFloat("Tomb Bronze Hardness",
				"Block Stat Modification", tombBronzeHardness, 0.0F, 32000.0F,
				"How many hits to break a block");
		tombBronzeResistance = config.getFloat("Tomb Bronze Resistance",
				"Block Stat Modification", tombBronzeResistance, 0.0F, 32000.0F,
				"Explosion Resistance");
		tombBronzeHarvestLevel = config.getInt("Tomb Bronze Harvest Level",
				"Block Stat Modification", tombBronzeHarvestLevel, 0, 255,
				"Tool level required to harvest this block");
		
	} // end customizeBlockStats()
	
	/**
	 * Sets the default tool stats.
	 */
	public static void toolStatDefaults() 
	{
		stannumMiningLevel = 2;
		stannumUsesNum = 380;
		stannumMiningSpeed = 8.5F;
		stannumDamageVsEntity = 2;
		stannumEnchantability = 10;
		cuprumMiningLevel = 2;
		cuprumUsesNum = 345;
		cuprumMiningSpeed = 9.0F;
		cuprumDamageVsEntity = 2;
		cuprumEnchantability = 10;
		pyropusBronzeMiningLevel = 2;
		pyropusBronzeUsesNum = 840;
		pyropusBronzeMiningSpeed = 11.0F;
		pyropusBronzeDamageVsEntity = 3; 
		pyropusBronzeEnchantability = 18;
		pulchrumBronzeMiningLevel = 3;
		pulchrumBronzeUsesNum = 336;
		pulchrumBronzeMiningSpeed = 12.0F;
		pulchrumBronzeDamageVsEntity = 3;
		pulchrumBronzeEnchantability = 22;
		tombBronzeMiningLevel = 3;
		tombBronzeUsesNum = 920;
		tombBronzeMiningSpeed = 14.05F;
		tombBronzeDamageVsEntity = 3;
		tombBronzeEnchantability = 28;
	} // end toolStatdefaults()

	/**
	 * set customized tool stats.
	 */
	public static void customizeToolStats() 
	{
		stannumMiningLevel = config
				.getInt("Stannum Mining Level",
						"Tool Stat Modification",
						stannumMiningLevel,
						0,
						255,
						"Controls the mining level of Stannum Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		stannumUsesNum = config.getInt("Stannum Tools Durability",
				"Tool Stat Modification", stannumUsesNum, 0, 32000,
				"Controls the number of uses Stannum Tools have.");
		stannumMiningSpeed = config
				.getFloat("Stannum Mining Speed", "Tool Stat Modification",
						stannumMiningSpeed, 0, 32000,
						"Controls the speed at which Stannum Tools harvest their appropriate blocks.");
		stannumDamageVsEntity = config
				.getFloat("Stannum Damage Vs. Entities",
						"Tool Stat Modification", stannumDamageVsEntity, 0,
						32000,
						"Controls the amount of damage that Stannum Tools will do to entities.");
		stannumEnchantability = config.getInt("Stannum Tools Enchantability",
				"Tool Stat Modification", stannumEnchantability, 0, 32000,
				"Controls the enchantability of Stannum Tools.");

		cuprumMiningLevel = config
				.getInt("Cuprum Mining Level",
						"Tool Stat Modification",
						cuprumMiningLevel,
						0,
						255,
						"Controls the mining level of Cuprum Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		cuprumUsesNum = config.getInt(
				"Cuprum Tools Durability", "Tool Stat Modification",
				cuprumUsesNum, 0, 32000,
				"Controls the number of uses Cuprum Tools have.");
		cuprumMiningSpeed = config
				.getFloat(
						"Cuprum Mining Speed",
						"Tool Stat Modification",
						cuprumMiningSpeed,
						0,
						32000,
						"Controls the speed at which Cuprum Tools harvest their appropriate blocks.");
		cuprumDamageVsEntity = config
				.getFloat(
						"Cuprum Damage Vs. Entities",
						"Tool Stat Modification",
						cuprumDamageVsEntity,
						0,
						32000,
						"Controls the amount of damage that Cuprum Tools will do to entities.");
		cuprumEnchantability = config.getInt(
				"Cuprum Tools Enchantability",
				"Tool Stat Modification", cuprumEnchantability, 0, 32000,
				"Controls the enchantability of Cuprum Tools.");

		pyropusBronzeMiningLevel = config
				.getInt("Pyropus Bronze Mining Level",
						"Tool Stat Modification",
						pyropusBronzeMiningLevel,
						0,
						255,
						"Controls the mining level of Pyropus Bronze Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		pyropusBronzeUsesNum = config.getInt("Pyropus Bronze Tools Durability",
				"Tool Stat Modification", pyropusBronzeUsesNum, 0, 32000,
				"Controls the number of uses Pyropus Bronze Tools have.");
		pyropusBronzeMiningSpeed = config
				.getFloat("Pyropus Bronze Mining Speed", "Tool Stat Modification",
						pyropusBronzeMiningSpeed, 0, 32000,
						"Controls the speed at which Pyropus Bronze Tools harvest their appropriate blocks.");
		pyropusBronzeDamageVsEntity = config
				.getFloat("Pyropus Bronze Damage Vs. Entities",
						"Tool Stat Modification", pyropusBronzeDamageVsEntity, 0, 32000,
						"Controls the amount of damage Pyropus Bronze Tools will do to entities.");
		pyropusBronzeEnchantability = config.getInt("Pyropus Bronze Tools Enchantability",
				"Tool Stat Modification", pyropusBronzeEnchantability, 0, 32000,
				"Controls the enchantability of Pyropus Bronze Tools.");

		pulchrumBronzeMiningLevel = config
				.getInt("Pulchrum Bronze Mining Level",
						"Tool Stat Modification",
						pulchrumBronzeMiningLevel,
						0,
						255,
						"Controls the mining level of Pulchrum Bronze Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		pulchrumBronzeUsesNum = config.getInt("Pulchrum Bronze Tools Durability",
				"Tool Stat Modification", pulchrumBronzeUsesNum, 0, 32000,
				"Controls the number of uses Pulchrum Bronze Tools have.");
		pulchrumBronzeMiningSpeed = config
				.getFloat(
						"Pulchrum Bronze Mining Speed",
						"Tool Stat Modification",
						pulchrumBronzeMiningSpeed,
						0,
						32000,
						"Controls the speed at which Pulchrum Bronze Tools harvest their appropriate blocks.");
		pulchrumBronzeDamageVsEntity = config
				.getFloat("Pulchrum Bronze Damage Vs. Entities",
						"Tool Stat Modification", pulchrumBronzeDamageVsEntity, 0, 32000,
						"Controls the amount of damage Pulchrum Bronze Tools will do to entities.");
		pulchrumBronzeEnchantability = config.getInt(
				"Pulchrum Bronze Tools Enchantability",
				"Tool Stat Modification",pulchrumBronzeEnchantability, 0, 32000,
				"Controls the enchantability of Pulchrum Bronze Tools.");

		tombBronzeMiningLevel = config
				.getInt("Tomb Bronze Mining Level",
						"Tool Stat Modification",
						tombBronzeMiningLevel,
						0,
						255,
						"Controls the mining level of Tomb Bronze Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
		tombBronzeUsesNum = config.getInt("Tomb Bronze Tools Durability",
				"Tool Stat Modification", tombBronzeUsesNum, 0, 32000,
				"Controls the number of uses Tomb Bronze Tools have.");
		tombBronzeMiningSpeed = config
				.getFloat("Tomb Bronze Mining Speed", "Tool Stat Modification",
						tombBronzeMiningSpeed, 0, 32000,
						"Controls the speed at which Tomb Bronze Tools harvest their appropriate blocks.");
		tombBronzeDamageVsEntity = config
				.getFloat("Tomb Bronze Damage Vs. Entity",
						"Tool Stat Modification",tombBronzeDamageVsEntity, 0, 32000,
						"Controls the amount of damage Tomb Bronze Tools will do to entities.");
		tombBronzeEnchantability = config.getInt("Tomb Bronze Tools Enchantability",
				"Tool Stat Modification", tombBronzeEnchantability, 0, 32000,
				"Controls the enchantability of Tomb Bronze Tools.");
	
	} // end customizeToolStats()

	// Tool Stats
	public static int stannumMiningLevel, cuprumMiningLevel,
			pyropusBronzeMiningLevel, pulchrumBronzeMiningLevel, tombBronzeMiningLevel;
	public static int stannumUsesNum, cuprumUsesNum, pyropusBronzeUsesNum,
			pulchrumBronzeUsesNum, tombBronzeUsesNum;
	public static float stannumMiningSpeed, cuprumMiningSpeed,
			pyropusBronzeMiningSpeed, pulchrumBronzeMiningSpeed, tombBronzeMiningSpeed;
	public static float stannumDamageVsEntity, cuprumDamageVsEntity,
			pyropusBronzeDamageVsEntity, pulchrumBronzeDamageVsEntity,
			tombBronzeDamageVsEntity;
	public static int stannumEnchantability, cuprumEnchantability,
			pyropusBronzeEnchantability, pulchrumBronzeEnchantability,
			tombBronzeEnchantability;

	// Armor Stats
	public static int stannumArmorDurability, cuprumArmorDurability,
			pyropusBronzeArmorDurability, tombBronzeArmorDurability;
	public static int[] stannumArmorDamageReduction,
			cuprumArmorDamageReduction, pyropusBronzeArmorDamageReduction,
			tombBronzeArmorDamageReduction;
	public static int stannumArmorEnchantability,
			cuprumArmorEnchantability, pyropusBronzeArmorEnchantability,
			tombBronzeArmorEnchantability;

	// Block stats
	public static float stannumHardness, cuprumHardness,
			pulchrumBronzeHardness, pyropusBronzeHardness, tombBronzeHardness;
	public static float stannumResistance, cuprumResistance,
			pulchrumBronzeResistance, pyropusBronzeResistance,
			tombBronzeResistance;
	public static int stannumHarvestLevel, cuprumHarvestLevel,
			pulchrumBronzeHarvestLevel, pyropusBronzeHarvestLevel,
			tombBronzeHarvestLevel;
	
} // end class Settings
