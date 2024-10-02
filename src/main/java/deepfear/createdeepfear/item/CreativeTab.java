package deepfear.createdeepfear.item;

import deepfear.createdeepfear.CreateDeepFear;
import deepfear.createdeepfear.blocks.DeepFearBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CreativeTab {
    public static final ItemGroup CREATE_DEEPFEAR = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CreateDeepFear.MOD_ID, "ceatedeepfear"),
            FabricItemGroup.builder().icon(() -> new ItemStack(DeepFearBlocks.DARK_STONE))
                    .displayName(Text.translatable("itemgroup.create-deepfear.createdeepfear"))
                    .entries((displayContext, entries) -> {
                        entries.add(DeepFearBlocks.DARK_STONE);
                    }).build());
    public static void registerCreativeTab() {

    }
}
