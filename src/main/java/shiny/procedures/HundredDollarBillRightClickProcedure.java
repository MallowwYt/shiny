package shiny.procedures;

import shiny.network.ShinyModVariables;

import shiny.init.ShinyModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

public class HundredDollarBillRightClickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			ShinyModVariables.PlayerVariables _vars = entity.getData(ShinyModVariables.PLAYER_VARIABLES);
			_vars.MoneyCount = entity.getData(ShinyModVariables.PLAYER_VARIABLES).MoneyCount + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() * 100;
			_vars.syncPlayerVariables(entity);
		}
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(ShinyModItems.TEN_DOLLAR_BILL.get()).copy();
			_setstack.setCount(0);
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
	}
}
