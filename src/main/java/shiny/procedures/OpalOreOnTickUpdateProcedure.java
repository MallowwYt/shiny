package shiny.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class OpalOreOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double zpos = 0;
		double xpos = 0;
		double ypos = 0;
		xpos = -1;
		ypos = -1;
		zpos = -1;
		for (int index0 = 0; index0 < 3; index0++) {
			for (int index1 = 0; index1 < 3; index1++) {
				for (int index2 = 0; index2 < 3; index2++) {
					if (world.isEmptyBlock(BlockPos.containing(x + xpos, y + ypos, z + zpos))) {
						world.setBlock(BlockPos.containing(x + xpos, y + ypos, z + zpos), Blocks.WATER.defaultBlockState(), 3);
					}
					xpos = xpos + 1;
				}
				ypos = ypos + 1;
				xpos = -1;
			}
			zpos = zpos + 1;
			ypos = -1;
		}
	}
}
