// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGorilla<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gorilla"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart LeftBackLeg;
	private final ModelPart RightBackLeg;

	public ModelGorilla(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.LeftBackLeg = root.getChild("LeftBackLeg");
		this.RightBackLeg = root.getChild("RightBackLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(62, 0)
						.addBox(-4.0F, -7.9496F, -8.9933F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(109, 75)
						.addBox(-5.0F, -10.9496F, -6.9933F, 10.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(5.0F, -7.9496F, -2.9933F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -7.9496F, -2.9933F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.0504F, -11.0067F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(110, 107).addBox(0.0F, -19.0F, -5.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 6.0504F, -2.9933F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 7.5953F, -5.0304F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 103)
						.addBox(-8.0F, -36.0F, -7.0F, 18.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -38.0F, -5.0F, 22.0F, 19.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 20.2141F, 7.5735F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(106, 31)
						.addBox(-8.0F, -20.0F, -1.0F, 18.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-9.0F, -20.0F, 1.0F, 20.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 20.2141F, 7.5735F, 0.6109F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition
				.addOrReplaceChild(
						"RightArm", CubeListBuilder.create().texOffs(0, 68).addBox(-0.0833F, 16.0049F, -8.0574F, 15.0F,
								19.0F, 16.0F, new CubeDeformation(0.0F)),
						PartPose.offset(11.0833F, -12.0049F, -8.9426F));

		PartDefinition cube_r4 = RightArm.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(102, 47).addBox(13.0F, -3.0F, -15.0F, 13.0F, 2.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0833F, 37.0049F, 7.9426F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r5 = RightArm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(62, 84).addBox(12.0F, -37.0F, -16.0F, 14.0F, 17.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0833F, 37.0049F, 7.9426F, -0.0436F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition
				.addOrReplaceChild(
						"LeftArm", CubeListBuilder.create().texOffs(56, 49).addBox(-14.9167F, 16.0049F, -8.0574F, 15.0F,
								19.0F, 16.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-11.0833F, -12.0049F, -8.9426F));

		PartDefinition cube_r6 = LeftArm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(66, 31).addBox(13.0F, -3.0F, -15.0F, 13.0F, 2.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.9167F, 37.0049F, 7.9426F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r7 = LeftArm.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(80, 0).addBox(12.0F, -37.0F, -16.0F, 14.0F, 17.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.9167F, 37.0049F, 7.9426F, -0.0436F, 0.0F, 0.0F));

		PartDefinition LeftBackLeg = partdefinition.addOrReplaceChild("LeftBackLeg",
				CubeListBuilder.create().texOffs(40, 107)
						.addBox(-7.0F, 9.0F, -3.75F, 7.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 122)
						.addBox(-6.0F, 0.0F, -3.75F, 6.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, 6.0F, 9.75F));

		PartDefinition RightBackLeg = partdefinition.addOrReplaceChild("RightBackLeg",
				CubeListBuilder.create().texOffs(70, 115)
						.addBox(0.0F, 9.0F, -3.75F, 7.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(100, 123)
						.addBox(0.0F, 0.0F, -3.75F, 6.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 6.0F, 9.75F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBackLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBackLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftBackLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightBackLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}