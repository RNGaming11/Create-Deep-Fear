package deepfear.createdeepfear.blocks;

import deepfear.createdeepfear.CreateDeepFear;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DeepFearBlocks {
    public static final Block DARK_STONE = registerBlock("dark_stone",
            new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CreateDeepFear.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(CreateDeepFear.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerblocks() {

    }
}
