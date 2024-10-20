
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shiny.init;

import shiny.client.renderer.HammerheadtestRenderer;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ShinyModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ShinyModEntities.HAMMERHEADTEST.get(), HammerheadtestRenderer::new);
	}
}
