
package shiny.client.renderer;

import shiny.entity.HammerheadtestEntity;

import shiny.client.model.ModelHammerHeadShark;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class HammerheadtestRenderer extends MobRenderer<HammerheadtestEntity, ModelHammerHeadShark<HammerheadtestEntity>> {
	public HammerheadtestRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHammerHeadShark(context.bakeLayer(ModelHammerHeadShark.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HammerheadtestEntity entity) {
		return ResourceLocation.parse("shiny:textures/entities/texture.png");
	}
}
