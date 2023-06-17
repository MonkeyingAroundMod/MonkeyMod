
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monkeyingaround.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.monkeyingaround.block.RainforestplanksBlock;
import net.mcreator.monkeyingaround.block.RainforestlogBlock;
import net.mcreator.monkeyingaround.block.RainforestStairsBlock;
import net.mcreator.monkeyingaround.block.RainforestSlabBlock;
import net.mcreator.monkeyingaround.block.RainforestPressurePlateBlock;
import net.mcreator.monkeyingaround.block.RainforestLeavesBlock;
import net.mcreator.monkeyingaround.block.RainforestFenceGateBlock;
import net.mcreator.monkeyingaround.block.RainforestFenceBlock;
import net.mcreator.monkeyingaround.block.RainforestButtonBlock;
import net.mcreator.monkeyingaround.block.ErodedStoneBricksBlock;
import net.mcreator.monkeyingaround.block.ErodedStoneBricks8Block;
import net.mcreator.monkeyingaround.block.ErodedStoneBricks7Block;
import net.mcreator.monkeyingaround.block.ErodedStoneBricks6Block;
import net.mcreator.monkeyingaround.block.ErodedStoneBricks5Block;
import net.mcreator.monkeyingaround.block.ErodedStoneBricks4Block;
import net.mcreator.monkeyingaround.block.ErodedStoneBricks3Block;
import net.mcreator.monkeyingaround.block.ErodedStoneBricks2Block;
import net.mcreator.monkeyingaround.block.ErodedStoneBricks1Block;
import net.mcreator.monkeyingaround.block.ErodedStoneBricks0Block;
import net.mcreator.monkeyingaround.block.ErodedMossyStoneBricksBlock;
import net.mcreator.monkeyingaround.block.ErodedCrackedStoneBricksBlock;
import net.mcreator.monkeyingaround.block.BananaStemBlock;
import net.mcreator.monkeyingaround.block.BananaStem2Block;
import net.mcreator.monkeyingaround.block.BananaStem1Block;
import net.mcreator.monkeyingaround.MonkeyingAroundMod;

public class MonkeyingAroundModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MonkeyingAroundMod.MODID);
	public static final RegistryObject<Block> RAINFORESTPLANKS = REGISTRY.register("rainforestplanks", () -> new RainforestplanksBlock());
	public static final RegistryObject<Block> RAINFORESTLOG = REGISTRY.register("rainforestlog", () -> new RainforestlogBlock());
	public static final RegistryObject<Block> RAINFOREST_LEAVES = REGISTRY.register("rainforest_leaves", () -> new RainforestLeavesBlock());
	public static final RegistryObject<Block> BANANA_STEM = REGISTRY.register("banana_stem", () -> new BananaStemBlock());
	public static final RegistryObject<Block> BANANA_STEM_1 = REGISTRY.register("banana_stem_1", () -> new BananaStem1Block());
	public static final RegistryObject<Block> BANANA_STEM_2 = REGISTRY.register("banana_stem_2", () -> new BananaStem2Block());
	public static final RegistryObject<Block> ERODED_CRACKED_STONE_BRICKS = REGISTRY.register("eroded_cracked_stone_bricks", () -> new ErodedCrackedStoneBricksBlock());
	public static final RegistryObject<Block> ERODED_MOSSY_STONE_BRICKS = REGISTRY.register("eroded_mossy_stone_bricks", () -> new ErodedMossyStoneBricksBlock());
	public static final RegistryObject<Block> ERODED_STONE_BRICKS = REGISTRY.register("eroded_stone_bricks", () -> new ErodedStoneBricksBlock());
	public static final RegistryObject<Block> ERODED_STONE_BRICKS_0 = REGISTRY.register("eroded_stone_bricks_0", () -> new ErodedStoneBricks0Block());
	public static final RegistryObject<Block> ERODED_STONE_BRICKS_1 = REGISTRY.register("eroded_stone_bricks_1", () -> new ErodedStoneBricks1Block());
	public static final RegistryObject<Block> ERODED_STONE_BRICKS_2 = REGISTRY.register("eroded_stone_bricks_2", () -> new ErodedStoneBricks2Block());
	public static final RegistryObject<Block> ERODED_STONE_BRICKS_3 = REGISTRY.register("eroded_stone_bricks_3", () -> new ErodedStoneBricks3Block());
	public static final RegistryObject<Block> ERODED_STONE_BRICKS_4 = REGISTRY.register("eroded_stone_bricks_4", () -> new ErodedStoneBricks4Block());
	public static final RegistryObject<Block> ERODED_STONE_BRICKS_5 = REGISTRY.register("eroded_stone_bricks_5", () -> new ErodedStoneBricks5Block());
	public static final RegistryObject<Block> ERODED_STONE_BRICKS_6 = REGISTRY.register("eroded_stone_bricks_6", () -> new ErodedStoneBricks6Block());
	public static final RegistryObject<Block> ERODED_STONE_BRICKS_7 = REGISTRY.register("eroded_stone_bricks_7", () -> new ErodedStoneBricks7Block());
	public static final RegistryObject<Block> ERODED_STONE_BRICKS_8 = REGISTRY.register("eroded_stone_bricks_8", () -> new ErodedStoneBricks8Block());
	public static final RegistryObject<Block> RAINFOREST_STAIRS = REGISTRY.register("rainforest_stairs", () -> new RainforestStairsBlock());
	public static final RegistryObject<Block> RAINFOREST_SLAB = REGISTRY.register("rainforest_slab", () -> new RainforestSlabBlock());
	public static final RegistryObject<Block> RAINFOREST_FENCE = REGISTRY.register("rainforest_fence", () -> new RainforestFenceBlock());
	public static final RegistryObject<Block> RAINFOREST_FENCE_GATE = REGISTRY.register("rainforest_fence_gate", () -> new RainforestFenceGateBlock());
	public static final RegistryObject<Block> RAINFOREST_PRESSURE_PLATE = REGISTRY.register("rainforest_pressure_plate", () -> new RainforestPressurePlateBlock());
	public static final RegistryObject<Block> RAINFOREST_BUTTON = REGISTRY.register("rainforest_button", () -> new RainforestButtonBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			RainforestLeavesBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			RainforestLeavesBlock.itemColorLoad(event);
		}
	}
}
