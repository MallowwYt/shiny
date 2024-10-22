package shiny.procedures;

import net.minecraft.world.entity.Entity;

public class RubySwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.igniteForSeconds(15);
	}
}
