package shiny.procedures;

import shiny.init.ShinyModBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class HotSoilOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xpos = 0;
		double zpos = 0;
		if (Mth.nextInt(RandomSource.create(), 1, 150) == 25) {
			xpos = -4;
			zpos = -4;
			for (int index0 = 0; index0 < 9; index0++) {
				for (int index1 = 0; index1 < 9; index1++) {
					if ((world.getBlockState(BlockPos.containing(x + xpos, y, z + zpos))).getBlock() == Blocks.LAVA) {
						world.setBlock(BlockPos.containing(x, y, z), ShinyModBlocks.SCORCHING_SOIL.get().defaultBlockState(), 3);
						break;
					}
					xpos = xpos + 1;
				}
				if ((world.getBlockState(BlockPos.containing(x + xpos, y, z + zpos))).getBlock() == Blocks.LAVA) {
					break;
				}
				xpos = -4;
				zpos = zpos + 1;
			}
		}
	}
}
