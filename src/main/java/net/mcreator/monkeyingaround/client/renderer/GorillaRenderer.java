
package net.mcreator.monkeyingaround.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monkeyingaround.entity.GorillaEntity;
import net.mcreator.monkeyingaround.client.model.ModelGorilla;

public class GorillaRenderer extends MobRenderer<GorillaEntity, ModelGorilla<GorillaEntity>> {
	public GorillaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGorilla(context.bakeLayer(ModelGorilla.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(GorillaEntity entity) {
		return new ResourceLocation("monkeying_around:textures/entities/gorilla.png");
	}
}
