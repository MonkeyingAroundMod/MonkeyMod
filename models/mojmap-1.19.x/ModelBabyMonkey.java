// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBabyMonkey<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "babymonkey"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Tail;
	private final ModelPart FrontLeftLeg;
	private final ModelPart FrontRightLeg;
	private final ModelPart BackLeftLeg;
	private final ModelPart BackRightLeg;

	public ModelBabyMonkey(ModelPart root) {
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
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(-0.7693F, -0.25F, -1.0877F, 1.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(10, 4)
						.addBox(-0.7693F, -0.75F, -0.5877F, 1.5F, 1.5F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0193F, 18.875F, -1.6623F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(1, 8).addBox(0.0F, -4.375F, 1.0F, 0.5F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7693F, 3.75F, -1.0877F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(6, 4).addBox(1.0F, -4.375F, 1.5F, 0.5F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7693F, 3.75F, -1.0877F, 0.0F, 0.3927F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 20.818F, 0.0607F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.5F, 2.5F, 1.5F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 3.182F, -1.0607F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 20.4929F, 2.9912F));

		PartDefinition cube_r4 = Tail.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(9, 11).addBox(0.5F, -3.375F, -1.125F, 0.5F, 1.5F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 1.3821F, -1.3662F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Tail.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(4, 11).addBox(0.5F, -2.125F, -0.25F, 0.5F, 2.0F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 1.3821F, -1.3662F, -0.6981F, 0.0F, 0.0F));

		PartDefinition FrontLeftLeg = partdefinition.addOrReplaceChild("FrontLeftLeg", CubeListBuilder.create(),
				PartPose.offset(1.0F, 20.398F, -0.7709F));

		PartDefinition cube_r6 = FrontLeftLeg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(10, 8).addBox(0.5F, -2.125F, -0.25F, 0.5F, 2.0F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 3.602F, -1.2291F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r7 = FrontLeftLeg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(7, 11).addBox(0.5F, -4.0F, -0.5F, 0.5F, 2.0F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 3.602F, -1.2291F, -0.3927F, 0.0F, 0.0F));

		PartDefinition FrontRightLeg = partdefinition.addOrReplaceChild("FrontRightLeg", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 20.398F, -0.7709F));

		PartDefinition cube_r8 = FrontRightLeg.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(1, 11).addBox(0.5F, -2.125F, -0.25F, 0.5F, 2.0F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 3.602F, -1.2291F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r9 = FrontRightLeg.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(11, 1).addBox(0.5F, -4.0F, -0.5F, 0.5F, 2.0F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 3.602F, -1.2291F, -0.3927F, 0.0F, 0.0F));

		PartDefinition BackLeftLeg = partdefinition.addOrReplaceChild("BackLeftLeg", CubeListBuilder.create()
				.texOffs(11, 11).addBox(-0.25F, -0.1777F, -0.3248F, 0.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 21.3027F, 1.1998F));

		PartDefinition cube_r10 = BackLeftLeg.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(8, 8).addBox(0.5F, -2.125F, -0.25F, 0.5F, 2.0F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 2.6973F, 0.8002F, 0.4363F, 0.0F, 0.0F));

		PartDefinition BackRightLeg = partdefinition.addOrReplaceChild("BackRightLeg", CubeListBuilder.create()
				.texOffs(13, 0).addBox(-0.25F, -0.1777F, -0.3248F, 0.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 21.3027F, 1.1998F));

		PartDefinition cube_r11 = BackRightLeg.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(6, 8).addBox(0.5F, -2.125F, -0.25F, 0.5F, 2.0F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 2.6973F, 0.8002F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.FrontRightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.BackLeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Tail.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.FrontLeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.BackRightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}