
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monkeyingaround.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.monkeyingaround.world.features.RainforestTree5Feature;
import net.mcreator.monkeyingaround.world.features.RainforestTree4Feature;
import net.mcreator.monkeyingaround.world.features.RainforestTree3Feature;
import net.mcreator.monkeyingaround.world.features.RainforestTree2Feature;
import net.mcreator.monkeyingaround.world.features.RainforestTree1Feature;
import net.mcreator.monkeyingaround.MonkeyingAroundMod;

@Mod.EventBusSubscriber
public class MonkeyingAroundModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MonkeyingAroundMod.MODID);
	public static final RegistryObject<Feature<?>> RAINFOREST_TREE_2 = REGISTRY.register("rainforest_tree_2", RainforestTree2Feature::feature);
	public static final RegistryObject<Feature<?>> RAINFOREST_TREE_1 = REGISTRY.register("rainforest_tree_1", RainforestTree1Feature::feature);
	public static final RegistryObject<Feature<?>> RAINFOREST_TREE_3 = REGISTRY.register("rainforest_tree_3", RainforestTree3Feature::feature);
	public static final RegistryObject<Feature<?>> RAINFOREST_TREE_4 = REGISTRY.register("rainforest_tree_4", RainforestTree4Feature::feature);
	public static final RegistryObject<Feature<?>> RAINFOREST_TREE_5 = REGISTRY.register("rainforest_tree_5", RainforestTree5Feature::feature);
}
