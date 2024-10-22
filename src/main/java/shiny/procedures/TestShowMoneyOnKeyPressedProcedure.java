package shiny.procedures;

import shiny.network.ShinyModVariables;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class TestShowMoneyOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("you currently have " + (entity.getData(ShinyModVariables.PLAYER_VARIABLES).MoneyCount + " dollars"))), false);
	}
}
