package deepfear.createdeepfear.entity;

import deepfear.createdeepfear.CreateDeepFear;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import deepfear.createdeepfear.entity.custom.krabentity;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Entityclass {
    public static final EntityType<krabentity> KRAB = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(CreateDeepFear.MOD_ID, "krab"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, krabentity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 1.75f)).build());
}
