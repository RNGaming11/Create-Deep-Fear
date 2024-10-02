package deepfear.createdeepfear.item;

import deepfear.createdeepfear.CreateDeepFear;
import deepfear.createdeepfear.entity.Entityclass;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class items {
    public static final Item KRAB_SPAWN_EGG = registerItem("krab_spawn_egg",
            new SpawnEggItem(Entityclass.KRAB, 1616, 000000,
                    new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateDeepFear.MOD_ID, name), item);
    }
}
