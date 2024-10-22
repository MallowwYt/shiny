
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shiny.init;

import shiny.ShinyMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ShinyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShinyMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(ShinyModItems.RUBY_SWORD.get());
			tabData.accept(ShinyModItems.FIRE_BOOTS_BOOTS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(ShinyModItems.HAMMERHEADTEST_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(ShinyModItems.RUBY.get());
			tabData.accept(ShinyModItems.UNCUT_RUBY.get());
			tabData.accept(ShinyModItems.ENHANCED_RUBY.get());
			tabData.accept(ShinyModItems.ONE_DOLLAR_BILL.get());
			tabData.accept(ShinyModItems.UNCUT_OPAL.get());
			tabData.accept(ShinyModItems.OPAL.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(ShinyModBlocks.RUBY_ORE.get().asItem());
			tabData.accept(ShinyModBlocks.DEEPSLATE_RUBY_ORE.get().asItem());
			tabData.accept(ShinyModBlocks.OPAL_ORE.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(ShinyModItems.RUBY_SWORD.get());
			tabData.accept(ShinyModItems.RUBY_PICKAXE.get());
			tabData.accept(ShinyModItems.RUBY_HOE.get());

		}
	}
}
