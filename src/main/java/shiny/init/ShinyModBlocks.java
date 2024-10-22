
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shiny.init;

import shiny.block.ScorchingSoilBlock;
import shiny.block.RubyOreBlock;
import shiny.block.OpalOreBlock;
import shiny.block.MoldingStationBlock;
import shiny.block.HotSoilBlock;
import shiny.block.DeepslateRubyOreBlock;

import shiny.ShinyMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class ShinyModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ShinyMod.MODID);
	public static final DeferredBlock<Block> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = REGISTRY.register("deepslate_ruby_ore", DeepslateRubyOreBlock::new);
	public static final DeferredBlock<Block> SCORCHING_SOIL = REGISTRY.register("scorching_soil", ScorchingSoilBlock::new);
	public static final DeferredBlock<Block> HOT_SOIL = REGISTRY.register("hot_soil", HotSoilBlock::new);
	public static final DeferredBlock<Block> OPAL_ORE = REGISTRY.register("opal_ore", OpalOreBlock::new);
	public static final DeferredBlock<Block> MOLDING_STATION = REGISTRY.register("molding_station", MoldingStationBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
