package net.mcreator.monkeyingaround.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.monkeyingaround.init.MonkeyingAroundModBlocks;

public class BananaStemBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == MonkeyingAroundModBlocks.RAINFORESTLOG.get()) {
			return true;
		} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == MonkeyingAroundModBlocks.RAINFORESTLOG.get()) {
			return true;
		} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == MonkeyingAroundModBlocks.RAINFORESTLOG.get()) {
			return true;
		} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == MonkeyingAroundModBlocks.RAINFORESTLOG.get()) {
			return true;
		}
		return false;
	}
}
