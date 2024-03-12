package net.fro2k.temumod;

import net.fabricmc.api.ModInitializer;

import net.fro2k.temumod.block.ModBlocks;
import net.fro2k.temumod.item.ModItemGroups;
import net.fro2k.temumod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemuMod implements ModInitializer {
	public static final String MOD_ID = "temumod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}