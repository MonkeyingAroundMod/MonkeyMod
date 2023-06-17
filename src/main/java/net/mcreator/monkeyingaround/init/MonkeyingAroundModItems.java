
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monkeyingaround.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.monkeyingaround.item.MonkeyKeyItem;
import net.mcreator.monkeyingaround.item.BananaItem;
import net.mcreator.monkeyingaround.MonkeyingAroundMod;

public class MonkeyingAroundModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MonkeyingAroundMod.MODID);
	public static final RegistryObject<Item> RAINFORESTPLANKS = block(MonkeyingAroundModBlocks.RAINFORESTPLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAINFORESTLOG = block(MonkeyingAroundModBlocks.RAINFORESTLOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAINFOREST_LEAVES = block(MonkeyingAroundModBlocks.RAINFOREST_LEAVES, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BANANA = REGISTRY.register("banana", () -> new BananaItem());
	public static final RegistryObject<Item> MONKEY_KEY = REGISTRY.register("monkey_key", () -> new MonkeyKeyItem());
	public static final RegistryObject<Item> BANANA_STEM = block(MonkeyingAroundModBlocks.BANANA_STEM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BANANA_STEM_1 = block(MonkeyingAroundModBlocks.BANANA_STEM_1, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BANANA_STEM_2 = block(MonkeyingAroundModBlocks.BANANA_STEM_2, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ERODED_CRACKED_STONE_BRICKS = block(MonkeyingAroundModBlocks.ERODED_CRACKED_STONE_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ERODED_MOSSY_STONE_BRICKS = block(MonkeyingAroundModBlocks.ERODED_MOSSY_STONE_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ERODED_STONE_BRICKS = block(MonkeyingAroundModBlocks.ERODED_STONE_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GORILLA_SPAWN_EGG = REGISTRY.register("gorilla_spawn_egg", () -> new ForgeSpawnEggItem(MonkeyingAroundModEntities.GORILLA, -16777063, -6710887, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MONKEY_SPAWN_EGG = REGISTRY.register("monkey_spawn_egg", () -> new ForgeSpawnEggItem(MonkeyingAroundModEntities.MONKEY, -6724096, -13159, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ERODED_STONE_BRICKS_0 = block(MonkeyingAroundModBlocks.ERODED_STONE_BRICKS_0, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ERODED_STONE_BRICKS_1 = block(MonkeyingAroundModBlocks.ERODED_STONE_BRICKS_1, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ERODED_STONE_BRICKS_2 = block(MonkeyingAroundModBlocks.ERODED_STONE_BRICKS_2, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ERODED_STONE_BRICKS_3 = block(MonkeyingAroundModBlocks.ERODED_STONE_BRICKS_3, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ERODED_STONE_BRICKS_4 = block(MonkeyingAroundModBlocks.ERODED_STONE_BRICKS_4, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ERODED_STONE_BRICKS_5 = block(MonkeyingAroundModBlocks.ERODED_STONE_BRICKS_5, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ERODED_STONE_BRICKS_6 = block(MonkeyingAroundModBlocks.ERODED_STONE_BRICKS_6, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ERODED_STONE_BRICKS_7 = block(MonkeyingAroundModBlocks.ERODED_STONE_BRICKS_7, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ERODED_STONE_BRICKS_8 = block(MonkeyingAroundModBlocks.ERODED_STONE_BRICKS_8, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAINFOREST_STAIRS = block(MonkeyingAroundModBlocks.RAINFOREST_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAINFOREST_SLAB = block(MonkeyingAroundModBlocks.RAINFOREST_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAINFOREST_FENCE = block(MonkeyingAroundModBlocks.RAINFOREST_FENCE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAINFOREST_FENCE_GATE = block(MonkeyingAroundModBlocks.RAINFOREST_FENCE_GATE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAINFOREST_PRESSURE_PLATE = block(MonkeyingAroundModBlocks.RAINFOREST_PRESSURE_PLATE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAINFOREST_BUTTON = block(MonkeyingAroundModBlocks.RAINFOREST_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
