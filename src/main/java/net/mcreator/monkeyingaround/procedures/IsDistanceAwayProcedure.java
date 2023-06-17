package net.mcreator.monkeyingaround.procedures;

import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.monkeyingaround.MonkeyingAroundMod;

public class IsDistanceAwayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		double MPosX = 0;
		double PPosX = 0;
		double MPosZ = 0;
		double PPosZ = 0;
		double Dist = 0;
		double DistZ = 0;
		MPosX = entity.getX();
		MPosZ = entity.getZ();
		PPosX = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX();
		PPosZ = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ();
		Dist = Math.abs(MPosX - PPosX);
		DistZ = Math.abs(MPosZ - PPosZ);
		if (Dist >= 5) {
			MonkeyingAroundMod.LOGGER.info(Dist);
			return true;
		} else if (DistZ >= 5) {
			MonkeyingAroundMod.LOGGER.info(DistZ);
			return true;
		}
		MonkeyingAroundMod.LOGGER.info("Player too close away");
		MonkeyingAroundMod.LOGGER.info(Dist);
		MonkeyingAroundMod.LOGGER.info(DistZ);
		return false;
	}
}
