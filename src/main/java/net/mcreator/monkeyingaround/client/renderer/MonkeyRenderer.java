
package net.mcreator.monkeyingaround.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeyingaround.entity.MonkeyEntity;
import net.mcreator.monkeyingaround.client.model.ModelMonkey;

public class MonkeyRenderer extends MobRenderer<MonkeyEntity, ModelMonkey<MonkeyEntity>> {
	public MonkeyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMonkey(context.bakeLayer(ModelMonkey.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(MonkeyEntity entity) {
		return new ResourceLocation("monkeying_around:textures/entities/small_boi.png");
	}
}
