package de.capitalfault.emeraldium;

import de.capitalfault.emeraldium.block.ModBlocks;
import de.capitalfault.emeraldium.item.ModItemGroups;
import de.capitalfault.emeraldium.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Emeraldium implements ModInitializer {
	public static final String MOD_ID = "emeraldium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBocks();
	}
}