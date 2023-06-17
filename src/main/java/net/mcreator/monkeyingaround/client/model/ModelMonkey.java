package net.mcreator.monkeyingaround.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelMonkey<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("monkeying_around", "model_monkey"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart Tail;
	public final ModelPart FrontLeftLeg;
	public final ModelPart FrontRightLeg;
	public final ModelPart BackLeftLeg;
	public final ModelPart BackRightLeg;

	public ModelMonkey(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Tail = root.getChild("Tail");
		this.FrontLeftLeg = root.getChild("FrontLeftLeg");
		this.FrontRightLeg = root.getChild("FrontRightLeg");
		this.BackLeftLeg = root.getChild("BackLeftLeg");
		this.BackRightLeg = root.getChild("BackRightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(10, 0).addBox(-1.5386F, -0.5F, -2.1754F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 7).addBox(-1.5386F, -1.5F, -1.1754F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0386F, 13.75F, -3.3246F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, -8.75F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5386F, 7.5F, -2.1754F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 3).addBox(2.0F, -8.75F, 3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5386F, 7.5F, -2.1754F, 0.0F, 0.3927F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 17.636F, 0.1213F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -7.0F, 5.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 6.364F, -2.1213F, 0.7854F, 0.0F, 0.0F));
		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 16.9858F, 5.9824F));
		PartDefinition cube_r4 = Tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(7, 18).addBox(1.0F, -6.75F, -2.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 2.7642F, -2.7324F, -1.1345F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 13).addBox(1.0F, -4.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 2.7642F, -2.7324F, -0.6981F, 0.0F, 0.0F));
		PartDefinition FrontLeftLeg = partdefinition.addOrReplaceChild("FrontLeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 16.796F, -1.5417F));
		PartDefinition cube_r6 = FrontLeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 13).addBox(1.0F, -4.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 7.204F, -2.4583F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r7 = FrontLeftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(3, 18).addBox(1.0F, -8.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 7.204F, -2.4583F, -0.3927F, 0.0F, 0.0F));
		PartDefinition FrontRightLeg = partdefinition.addOrReplaceChild("FrontRightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 16.796F, -1.5417F));
		PartDefinition cube_r8 = FrontRightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 14).addBox(1.0F, -4.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 7.204F, -2.4583F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r9 = FrontRightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 3).addBox(1.0F, -8.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 7.204F, -2.4583F, -0.3927F, 0.0F, 0.0F));
		PartDefinition BackLeftLeg = partdefinition.addOrReplaceChild("BackLeftLeg", CubeListBuilder.create().texOffs(11, 18).addBox(-0.5F, -0.3554F, -0.6496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 18.6054F, 2.3996F));
		PartDefinition cube_r10 = BackLeftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 13).addBox(1.0F, -4.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 5.3946F, 1.6004F, 0.4363F, 0.0F, 0.0F));
		PartDefinition BackRightLeg = partdefinition.addOrReplaceChild("BackRightLeg", CubeListBuilder.create().texOffs(18, 0).addBox(-0.5F, -0.3554F, -0.6496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 18.6054F, 2.3996F));
		PartDefinition cube_r11 = BackRightLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(9, 13).addBox(1.0F, -4.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 5.3946F, 1.6004F, 0.4363F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.FrontRightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.BackLeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Tail.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.FrontLeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.BackRightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
