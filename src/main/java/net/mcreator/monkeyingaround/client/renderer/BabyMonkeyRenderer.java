
package net.mcreator.monkeyingaround.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeyingaround.entity.BabyMonkeyEntity;
import net.mcreator.monkeyingaround.client.model.ModelBabyMonkey;

public class BabyMonkeyRenderer extends MobRenderer<BabyMonkeyEntity, ModelBabyMonkey<BabyMonkeyEntity>> {
	public BabyMonkeyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBabyMonkey(context.bakeLayer(ModelBabyMonkey.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(BabyMonkeyEntity entity) {
		return new ResourceLocation("monkeying_around:textures/entities/baby_boi.png");
	}
}
