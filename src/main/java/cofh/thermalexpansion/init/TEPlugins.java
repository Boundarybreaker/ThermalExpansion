package cofh.thermalexpansion.init;

import cofh.core.util.core.IInitializer;
import cofh.thermalexpansion.plugins.*;
import cofh.thermalexpansion.plugins.forestry.*;
import cofh.thermalexpansion.plugins.top.PluginTOP;

import java.util.ArrayList;

public class TEPlugins {

	private TEPlugins() {

	}

	public static void preInit() {

		pluginTOP = new PluginTOP();

		pluginForestry = new PluginForestry();
		pluginExtraBees = new PluginExtraBees();
		pluginExtraTrees = new PluginExtraTrees();
		pluginGendustry = new PluginGendustry();
		pluginMagicBees = new PluginMagicBees();

		pluginActuallyAdditions = new PluginActuallyAdditions();
		pluginAppliedEnergistics2 = new PluginAppliedEnergistics2();
		pluginBiomesOPlenty = new PluginBiomesOPlenty();
		pluginEvilCraft = new PluginEvilCraft();
		pluginExtraAlchemy = new PluginExtraAlchemy();
		pluginExU2 = new PluginExU2();
		pluginHarvestCraft = new PluginHarvestCraft();
		pluginIC2 = new PluginIC2();
		pluginIntegratedDynamics = new PluginIntegratedDynamics();
		pluginMysticalAgriculture = new PluginMysticalAgriculture();
		pluginNatura = new PluginNatura();
		pluginPlants = new PluginPlants();
		pluginQuark = new PluginQuark();
		pluginRustic = new PluginRustic();
		pluginTConstruct = new PluginTConstruct();
		pluginTerraqueous = new PluginTerraqueous();
		pluginTraverse = new PluginTraverse();
		pluginTechReborn = new PluginTechReborn();
		pluginTwilightForest = new PluginTwilightForest();

		initList.add(pluginTOP);

		initList.add(pluginForestry);
		initList.add(pluginExtraBees);
		initList.add(pluginExtraTrees);
		initList.add(pluginGendustry);
		initList.add(pluginMagicBees);

		initList.add(pluginActuallyAdditions);
		initList.add(pluginAppliedEnergistics2);
		initList.add(pluginBiomesOPlenty);
		initList.add(pluginEvilCraft);
		initList.add(pluginExtraAlchemy);
		initList.add(pluginExU2);
		initList.add(pluginHarvestCraft);
		initList.add(pluginIC2);
		initList.add(pluginIntegratedDynamics);
		initList.add(pluginMysticalAgriculture);
		initList.add(pluginNatura);
		initList.add(pluginPlants);
		initList.add(pluginQuark);
		initList.add(pluginRustic);
		initList.add(pluginTConstruct);
		initList.add(pluginTerraqueous);
		initList.add(pluginTraverse);
		initList.add(pluginTechReborn);
		initList.add(pluginTwilightForest);

		for (IInitializer init : initList) {
			init.initialize();
		}
	}

	public static void postInit() {

		for (IInitializer init : initList) {
			init.register();
		}
	}

	private static ArrayList<IInitializer> initList = new ArrayList<>();

	/* REFERENCES */
	public static PluginTOP pluginTOP;

	public static PluginForestry pluginForestry;
	public static PluginExtraBees pluginExtraBees;
	public static PluginExtraTrees pluginExtraTrees;
	public static PluginGendustry pluginGendustry;
	public static PluginMagicBees pluginMagicBees;

	public static PluginActuallyAdditions pluginActuallyAdditions;
	public static PluginAppliedEnergistics2 pluginAppliedEnergistics2;
	public static PluginBiomesOPlenty pluginBiomesOPlenty;
	public static PluginEvilCraft pluginEvilCraft;
	public static PluginExtraAlchemy pluginExtraAlchemy;
	public static PluginExU2 pluginExU2;
	public static PluginHarvestCraft pluginHarvestCraft;
	public static PluginIC2 pluginIC2;
	public static PluginIntegratedDynamics pluginIntegratedDynamics;
	public static PluginMysticalAgriculture pluginMysticalAgriculture;
	public static PluginNatura pluginNatura;
	public static PluginPlants pluginPlants;
	public static PluginQuark pluginQuark;
	public static PluginRustic pluginRustic;
	public static PluginTConstruct pluginTConstruct;
	public static PluginTerraqueous pluginTerraqueous;
	public static PluginTraverse pluginTraverse;
	public static PluginTechReborn pluginTechReborn;
	public static PluginTwilightForest pluginTwilightForest;

}
