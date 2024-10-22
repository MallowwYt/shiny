package shiny.procedures;

import shiny.network.ShinyModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;

public class UncutOpalItemInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(ShinyModVariables.PLAYER_VARIABLES).DrowningTimer > 1) {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.DROWN)), 2);
			{
				ShinyModVariables.PlayerVariables _vars = entity.getData(ShinyModVariables.PLAYER_VARIABLES);
				_vars.DrowningTimer = entity.getData(ShinyModVariables.PLAYER_VARIABLES).DrowningTimer - 1;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity.getData(ShinyModVariables.PLAYER_VARIABLES).DrowningTimer < -1) {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.DROWN)), 2);
			{
				ShinyModVariables.PlayerVariables _vars = entity.getData(ShinyModVariables.PLAYER_VARIABLES);
				_vars.DrowningTimer = entity.getData(ShinyModVariables.PLAYER_VARIABLES).DrowningTimer + 1;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity.getData(ShinyModVariables.PLAYER_VARIABLES).DrowningTimer * entity.getData(ShinyModVariables.PLAYER_VARIABLES).DrowningTimer == 1) {
			{
				ShinyModVariables.PlayerVariables _vars = entity.getData(ShinyModVariables.PLAYER_VARIABLES);
				_vars.DrowningTimer = -50;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity.getData(ShinyModVariables.PLAYER_VARIABLES).DrowningTimer == 0) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("careful ! your lungs are filling with water !"), false);
			{
				ShinyModVariables.PlayerVariables _vars = entity.getData(ShinyModVariables.PLAYER_VARIABLES);
				_vars.DrowningTimer = 50;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
