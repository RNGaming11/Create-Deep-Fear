package deepfear.createdeepfear.entity.client;

import deepfear.createdeepfear.CreateDeepFear;
import deepfear.createdeepfear.entity.custom.krabentity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class krabModel extends GeoModel<krabentity> {
    @Override
    public Identifier getModelResource(krabentity animatable) {
        return new Identifier(CreateDeepFear.MOD_ID, "geo/krab.geo.json");
    }

    @Override
    public Identifier getTextureResource(krabentity animatable) {
        return new Identifier(CreateDeepFear.MOD_ID, "textures/entity.krab.png");
    }

    @Override
    public Identifier getAnimationResource(krabentity animatable) {
        return new Identifier(CreateDeepFear.MOD_ID, "animations/krab.animations.json");
    }


    public void setCustomAnimations(krabentity animatable, long instanceId, AnimationState<krabentity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
