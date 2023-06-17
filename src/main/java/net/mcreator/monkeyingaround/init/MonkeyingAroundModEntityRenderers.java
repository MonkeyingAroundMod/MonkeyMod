
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monkeyingaround.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.monkeyingaround.client.renderer.MonkeyRenderer;
import net.mcreator.monkeyingaround.client.renderer.GorillaRenderer;
import net.mcreator.monkeyingaround.client.renderer.BabyMonkeyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MonkeyingAroundModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MonkeyingAroundModEntities.GORILLA.get(), GorillaRenderer::new);
		event.registerEntityRenderer(MonkeyingAroundModEntities.MONKEY.get(), MonkeyRenderer::new);
		event.registerEntityRenderer(MonkeyingAroundModEntities.BABY_MONKEY.get(), BabyMonkeyRenderer::new);
	}
}
