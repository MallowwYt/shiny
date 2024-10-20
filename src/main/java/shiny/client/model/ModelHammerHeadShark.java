package shiny.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelHammerHeadShark<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("shiny", "model_hammer_head_shark"), "main");
	public final ModelPart body_0;
	public final ModelPart head;
	public final ModelPart fins;
	public final ModelPart body_1;
	public final ModelPart body_2;
	public final ModelPart caudalFin;

	public ModelHammerHeadShark(ModelPart root) {
		this.body_0 = root.getChild("body_0");
		this.head = this.body_0.getChild("head");
		this.fins = this.body_0.getChild("fins");
		this.body_1 = this.body_0.getChild("body_1");
		this.body_2 = this.body_1.getChild("body_2");
		this.caudalFin = this.body_2.getChild("caudalFin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body_0 = partdefinition.addOrReplaceChild("body_0", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, 7.8F, -5.1F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.2F, 2.1F));
		PartDefinition head = body_0.addOrReplaceChild("head", CubeListBuilder.create().texOffs(28, 8).addBox(-3.5F, -3.1F, -4.0F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 24)
				.addBox(0.0F, -2.6F, -9.0F, 9.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 0).addBox(-9.0F, -2.6F, -9.0F, 9.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.9F, -5.1F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 17).addBox(-2.5F, -2.0F, -3.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5F, -4.8F, -0.48F, 0.0F, 0.0F));
		PartDefinition fins = body_0.addOrReplaceChild("fins", CubeListBuilder.create(), PartPose.offset(0.0F, 6.6F, 2.2F));
		PartDefinition cube_r2 = fins.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 37).addBox(3.0F, -1.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.2F, -7.3F, 0.0F, -0.576F, 0.0F));
		PartDefinition cube_r3 = fins.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 8).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7F, 5.2F, -4.1F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r4 = fins.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 43).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.8F, 5.2F, -3.1F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r5 = fins.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 36).addBox(-1.0F, -1.0F, -2.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2F, 5.2F, -3.6F, 0.0F, -1.0647F, 0.0F));
		PartDefinition cube_r6 = fins.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 34).addBox(-1.0F, -1.0F, 1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7F, 5.2F, -3.6F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r7 = fins.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 32).addBox(-1.0F, -1.001F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 5.2F, -5.3F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r8 = fins.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 37).addBox(-5.0F, -1.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.2F, -7.3F, 0.0F, 0.576F, 0.0F));
		PartDefinition cube_r9 = fins.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 35).addBox(-4.0F, -1.001F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 5.2F, -5.3F, 0.0F, 0.4363F, 0.0F));
		PartDefinition cube_r10 = fins.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 35).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7F, 5.2F, -4.1F, 0.0F, 0.4363F, 0.0F));
		PartDefinition cube_r11 = fins.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(38, 43).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.8F, 5.2F, -3.1F, 0.0F, 0.4363F, 0.0F));
		PartDefinition cube_r12 = fins.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 46).addBox(-4.0F, -1.0F, -2.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2F, 5.2F, -3.6F, 0.0F, 1.0647F, 0.0F));
		PartDefinition cube_r13 = fins.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(44, 32).addBox(-4.0F, -1.0F, 1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.7F, 5.2F, -3.6F, 0.0F, 0.4363F, 0.0F));
		PartDefinition cube_r14 = fins.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(18, 35).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r15 = fins.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(10, 47).addBox(-0.5F, -6.0F, 1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6F, -0.4F, -0.3665F, 0.0F, 0.0F));
		PartDefinition cube_r16 = fins.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -6.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.2F, -2.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r17 = fins.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(18, 43).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, -1.8F, -0.5585F, 0.0F, 0.0F));
		PartDefinition cube_r18 = fins.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 40).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.8F, -1.3F, -0.3665F, 0.0F, 0.0F));
		PartDefinition cube_r19 = fins.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(46, 48).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r20 = fins.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(38, 48).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.6F, 0.1F, -0.925F, 0.0F, 0.0F));
		PartDefinition body_1 = body_0.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(0, 12).addBox(-2.912F, -1.95F, -0.0009F, 6.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.5F, 1.9F));
		PartDefinition cube_r21 = body_1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(46, 46).addBox(-0.5F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.912F, 2.3F, 6.9991F, -0.6981F, 0.0F, 0.0F));
		PartDefinition body_2 = body_1.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(0, 24).addBox(-2.5F, -1.7F, 0.0F, 5.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.088F, 0.5F, 7.9991F));
		PartDefinition caudalFin = body_2.addOrReplaceChild("caudalFin", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.1F, 8.0F));
		PartDefinition cube_r22 = caudalFin.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(42, 48).addBox(-0.5F, -5.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.6F, 0.4F, -0.576F, 0.0F, 0.0F));
		PartDefinition cube_r23 = caudalFin.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(34, 48).addBox(-0.5F, -7.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.7F, 1.6F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r24 = caudalFin.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(26, 46).addBox(-0.5F, -9.0F, -1.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.7F, 2.7F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r25 = caudalFin.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(4, 48).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.7F, -0.5F, -0.4887F, 0.0F, 0.0F));
		PartDefinition cube_r26 = caudalFin.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -7.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.2F, 3.6F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r27 = caudalFin.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(14, 47).addBox(-0.5F, -7.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.8F, 4.7F, 0.6632F, 0.0F, 0.0F));
		PartDefinition cube_r28 = caudalFin.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(30, 46).addBox(-0.5F, -9.0F, -1.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.4F, 0.2F, -0.8901F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body_0.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
