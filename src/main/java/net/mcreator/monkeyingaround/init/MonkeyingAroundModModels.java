
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monkeyingaround.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.monkeyingaround.client.model.ModelMonkey;
import net.mcreator.monkeyingaround.client.model.ModelGorilla;
import net.mcreator.monkeyingaround.client.model.ModelBabyMonkey;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MonkeyingAroundModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelGorilla.LAYER_LOCATION, ModelGorilla::createBodyLayer);
		event.registerLayerDefinition(ModelMonkey.LAYER_LOCATION, ModelMonkey::createBodyLayer);
		event.registerLayerDefinition(ModelBabyMonkey.LAYER_LOCATION, ModelBabyMonkey::createBodyLayer);
	}
}
