package shiny.procedures;

import shiny.init.ShinyModBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RubyHoeRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIRT || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(BlockPos.containing(x, y, z), ShinyModBlocks.HOT_SOIL.get().defaultBlockState(), 3);
		}
	}
}
