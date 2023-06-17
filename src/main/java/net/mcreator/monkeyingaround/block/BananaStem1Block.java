
package net.mcreator.monkeyingaround.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.MenuProvider;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.monkeyingaround.procedures.BananaStemUpdateTickProcedure;
import net.mcreator.monkeyingaround.procedures.BananaStemBlockValidPlacementConditionProcedure;
import net.mcreator.monkeyingaround.block.entity.BananaStem1BlockEntity;

public class BananaStem1Block extends Block implements EntityBlock {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public BananaStem1Block() {
		super(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(1f).noOcclusion().randomTicks().isRedstoneConductor((bs, br, bp) -> false).noLootTable());
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(7, 6, 0, 9, 14, 2), box(9, 10, 1, 10, 13, 2), box(7, 10, 2, 8, 13, 3), box(6, 8, 1, 7, 11, 2), box(6, 4, 1, 7, 7, 2), box(6, 6, 0, 7, 9, 1), box(6, 10, 0, 7, 13, 1), box(8, 8, 2, 9, 11, 3), box(8, 4, 2, 9, 7, 3),
					box(7, 6, 2, 8, 9, 3), box(9, 8, 0, 10, 11, 1), box(9, 4, 0, 10, 7, 1), box(9, 6, 1, 10, 9, 2));
			case NORTH -> Shapes.or(box(7, 6, 14, 9, 14, 16), box(6, 10, 14, 7, 13, 15), box(8, 10, 13, 9, 13, 14), box(9, 8, 14, 10, 11, 15), box(9, 4, 14, 10, 7, 15), box(9, 6, 15, 10, 9, 16), box(9, 10, 15, 10, 13, 16), box(7, 8, 13, 8, 11, 14),
					box(7, 4, 13, 8, 7, 14), box(8, 6, 13, 9, 9, 14), box(6, 8, 15, 7, 11, 16), box(6, 4, 15, 7, 7, 16), box(6, 6, 14, 7, 9, 15));
			case EAST -> Shapes.or(box(0, 6, 7, 2, 14, 9), box(1, 10, 6, 2, 13, 7), box(2, 10, 8, 3, 13, 9), box(1, 8, 9, 2, 11, 10), box(1, 4, 9, 2, 7, 10), box(0, 6, 9, 1, 9, 10), box(0, 10, 9, 1, 13, 10), box(2, 8, 7, 3, 11, 8),
					box(2, 4, 7, 3, 7, 8), box(2, 6, 8, 3, 9, 9), box(0, 8, 6, 1, 11, 7), box(0, 4, 6, 1, 7, 7), box(1, 6, 6, 2, 9, 7));
			case WEST -> Shapes.or(box(14, 6, 7, 16, 14, 9), box(14, 10, 9, 15, 13, 10), box(13, 10, 7, 14, 13, 8), box(14, 8, 6, 15, 11, 7), box(14, 4, 6, 15, 7, 7), box(15, 6, 6, 16, 9, 7), box(15, 10, 6, 16, 13, 7), box(13, 8, 8, 14, 11, 9),
					box(13, 4, 8, 14, 7, 9), box(13, 6, 7, 14, 9, 8), box(15, 8, 9, 16, 11, 10), box(15, 4, 9, 16, 7, 10), box(14, 6, 9, 15, 9, 10));
			case UP -> Shapes.or(box(7, 0, 6, 9, 2, 14), box(6, 1, 10, 7, 2, 13), box(8, 2, 10, 9, 3, 13), box(9, 1, 8, 10, 2, 11), box(9, 1, 4, 10, 2, 7), box(9, 0, 6, 10, 1, 9), box(9, 0, 10, 10, 1, 13), box(7, 2, 8, 8, 3, 11),
					box(7, 2, 4, 8, 3, 7), box(8, 2, 6, 9, 3, 9), box(6, 0, 8, 7, 1, 11), box(6, 0, 4, 7, 1, 7), box(6, 1, 6, 7, 2, 9));
			case DOWN -> Shapes.or(box(7, 14, 2, 9, 16, 10), box(6, 14, 3, 7, 15, 6), box(8, 13, 3, 9, 14, 6), box(9, 14, 5, 10, 15, 8), box(9, 14, 9, 10, 15, 12), box(9, 15, 7, 10, 16, 10), box(9, 15, 3, 10, 16, 6), box(7, 13, 5, 8, 14, 8),
					box(7, 13, 9, 8, 14, 12), box(8, 13, 7, 9, 14, 10), box(6, 15, 5, 7, 16, 8), box(6, 15, 9, 7, 16, 12), box(6, 14, 7, 7, 15, 10));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getClickedFace());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		if (worldIn instanceof LevelAccessor world) {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return BananaStemBlockValidPlacementConditionProcedure.execute(world, x, y, z);
		}
		return super.canSurvive(blockstate, worldIn, pos);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		return !state.canSurvive(world, currentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		BananaStemUpdateTickProcedure.execute(world, x, y, z);
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new BananaStem1BlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}
}
