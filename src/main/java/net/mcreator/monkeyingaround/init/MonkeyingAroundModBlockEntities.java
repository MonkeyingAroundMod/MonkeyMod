
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monkeyingaround.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.monkeyingaround.block.entity.BananaStemBlockEntity;
import net.mcreator.monkeyingaround.block.entity.BananaStem2BlockEntity;
import net.mcreator.monkeyingaround.block.entity.BananaStem1BlockEntity;
import net.mcreator.monkeyingaround.MonkeyingAroundMod;

public class MonkeyingAroundModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MonkeyingAroundMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BANANA_STEM = register("banana_stem", MonkeyingAroundModBlocks.BANANA_STEM, BananaStemBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BANANA_STEM_1 = register("banana_stem_1", MonkeyingAroundModBlocks.BANANA_STEM_1, BananaStem1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BANANA_STEM_2 = register("banana_stem_2", MonkeyingAroundModBlocks.BANANA_STEM_2, BananaStem2BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
