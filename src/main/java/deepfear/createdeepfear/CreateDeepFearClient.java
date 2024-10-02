package deepfear.createdeepfear;

import deepfear.createdeepfear.entity.Entityclass;
import deepfear.createdeepfear.entity.client.krabRender;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class CreateDeepFearClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Entityclass.KRAB, krabRender::new);
    }

}
