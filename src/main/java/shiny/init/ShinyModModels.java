
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shiny.init;

import shiny.client.model.ModelHammerHeadShark;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ShinyModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelHammerHeadShark.LAYER_LOCATION, ModelHammerHeadShark::createBodyLayer);
	}
}
