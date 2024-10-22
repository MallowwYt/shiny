
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shiny.init;

import shiny.item.UncutRubyItem;
import shiny.item.UncutOpalItem;
import shiny.item.TenDollarBillItem;
import shiny.item.RubySwordItem;
import shiny.item.RubyPickaxeItem;
import shiny.item.RubyItem;
import shiny.item.RubyHoeItem;
import shiny.item.OpalItem;
import shiny.item.OneDollarBillItem;
import shiny.item.HundredDollarBillItem;
import shiny.item.FireBootsItem;
import shiny.item.EnhancedRubyItem;

import shiny.ShinyMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class ShinyModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ShinyMod.MODID);
	public static final DeferredItem<Item> HAMMERHEADTEST_SPAWN_EGG = REGISTRY.register("hammerheadtest_spawn_egg", () -> new DeferredSpawnEggItem(ShinyModEntities.HAMMERHEADTEST, -16711885, -65536, new Item.Properties()));
	public static final DeferredItem<Item> RUBY = REGISTRY.register("ruby", RubyItem::new);
	public static final DeferredItem<Item> RUBY_ORE = block(ShinyModBlocks.RUBY_ORE);
	public static final DeferredItem<Item> UNCUT_RUBY = REGISTRY.register("uncut_ruby", UncutRubyItem::new);
	public static final DeferredItem<Item> DEEPSLATE_RUBY_ORE = block(ShinyModBlocks.DEEPSLATE_RUBY_ORE);
	public static final DeferredItem<Item> RUBY_SWORD = REGISTRY.register("ruby_sword", RubySwordItem::new);
	public static final DeferredItem<Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", RubyPickaxeItem::new);
	public static final DeferredItem<Item> ENHANCED_RUBY = REGISTRY.register("enhanced_ruby", EnhancedRubyItem::new);
	public static final DeferredItem<Item> FIRE_BOOTS_BOOTS = REGISTRY.register("fire_boots_boots", FireBootsItem.Boots::new);
	public static final DeferredItem<Item> ONE_DOLLAR_BILL = REGISTRY.register("one_dollar_bill", OneDollarBillItem::new);
	public static final DeferredItem<Item> SCORCHING_SOIL = block(ShinyModBlocks.SCORCHING_SOIL);
	public static final DeferredItem<Item> HOT_SOIL = block(ShinyModBlocks.HOT_SOIL);
	public static final DeferredItem<Item> RUBY_HOE = REGISTRY.register("ruby_hoe", RubyHoeItem::new);
	public static final DeferredItem<Item> OPAL_ORE = block(ShinyModBlocks.OPAL_ORE);
	public static final DeferredItem<Item> UNCUT_OPAL = REGISTRY.register("uncut_opal", UncutOpalItem::new);
	public static final DeferredItem<Item> OPAL = REGISTRY.register("opal", OpalItem::new);
	public static final DeferredItem<Item> TEN_DOLLAR_BILL = REGISTRY.register("ten_dollar_bill", TenDollarBillItem::new);
	public static final DeferredItem<Item> HUNDRED_DOLLAR_BILL = REGISTRY.register("hundred_dollar_bill", HundredDollarBillItem::new);
	public static final DeferredItem<Item> MOLDING_STATION = block(ShinyModBlocks.MOLDING_STATION);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
