package deepfear.createdeepfear;

import deepfear.createdeepfear.entity.Entityclass;
import deepfear.createdeepfear.entity.custom.krabentity;
import deepfear.createdeepfear.item.CreativeTab;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import deepfear.createdeepfear.blocks.DeepFearBlocks;

public class CreateDeepFear implements ModInitializer {
	public static final String MOD_ID = "create-deepfear";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DeepFearBlocks.registerblocks();
		CreativeTab.registerCreativeTab();

		FabricDefaultAttributeRegistry.register(Entityclass.KRAB, krabentity.setAttributes());

		LOGGER.info("Registring done");
	}
}