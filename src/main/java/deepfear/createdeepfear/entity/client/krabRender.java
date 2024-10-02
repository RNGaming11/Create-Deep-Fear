package deepfear.createdeepfear.entity.client;

import deepfear.createdeepfear.CreateDeepFear;
import deepfear.createdeepfear.entity.custom.krabentity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;

public class krabRender extends GeoEntityRenderer<krabentity> {
    public krabRender(EntityRendererFactory.Context renderManager) {
        super(renderManager, new krabModel());
    }

    @Override
    public Identifier getTextureLocation(krabentity animatable) {
        return new Identifier(CreateDeepFear.MOD_ID, "textures/entity.krab.png");
    }

    @Override
    public void render(krabentity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
