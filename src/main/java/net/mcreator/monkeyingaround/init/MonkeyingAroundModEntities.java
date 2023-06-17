
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monkeyingaround.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.monkeyingaround.entity.MonkeyEntity;
import net.mcreator.monkeyingaround.entity.GorillaEntity;
import net.mcreator.monkeyingaround.entity.BabyMonkeyEntity;
import net.mcreator.monkeyingaround.MonkeyingAroundMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MonkeyingAroundModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MonkeyingAroundMod.MODID);
	public static final RegistryObject<EntityType<GorillaEntity>> GORILLA = register("gorilla",
			EntityType.Builder.<GorillaEntity>of(GorillaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GorillaEntity::new)

					.sized(3f, 3f));
	public static final RegistryObject<EntityType<MonkeyEntity>> MONKEY = register("monkey",
			EntityType.Builder.<MonkeyEntity>of(MonkeyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MonkeyEntity::new)

					.sized(0.8f, 1.1f));
	public static final RegistryObject<EntityType<BabyMonkeyEntity>> BABY_MONKEY = register("baby_monkey",
			EntityType.Builder.<BabyMonkeyEntity>of(BabyMonkeyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyMonkeyEntity::new)

					.sized(0.8f, 1.1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GorillaEntity.init();
			MonkeyEntity.init();
			BabyMonkeyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GORILLA.get(), GorillaEntity.createAttributes().build());
		event.put(MONKEY.get(), MonkeyEntity.createAttributes().build());
		event.put(BABY_MONKEY.get(), BabyMonkeyEntity.createAttributes().build());
	}
}
