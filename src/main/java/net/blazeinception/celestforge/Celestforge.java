package net.blazeinception.celestforge;

import net.blazeinception.celestforge.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Celestforge implements ModInitializer {
	public static final String MOD_ID = "celestforge";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}