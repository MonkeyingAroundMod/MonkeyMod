
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
import net.mcreator.monkeyingaround.block.entity.BananaStem2BlockEntity;

public class BananaStem2Block extends Block implements EntityBlock {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public BananaStem2Block() {
		super(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0f, 1f).noOcclusion().randomTicks().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(7, 6, 0, 9, 14, 2), box(10, 9, 2, 11, 12, 3), box(9, 12, 1, 10, 13, 2), box(6, 9, 3, 7, 12, 4), box(7, 12, 2, 8, 13, 3), box(8, 7, 3, 9, 10, 4), box(8, 10, 2, 9, 11, 3), box(5, 7, 2, 6, 10, 3),
					box(6, 10, 1, 7, 11, 2), box(5, 5, 0, 6, 8, 1), box(6, 8, 0, 7, 9, 1), box(5, 9, 0, 6, 12, 1), box(6, 12, 0, 7, 13, 1), box(6, 3, 1, 7, 6, 2), box(6, 6, 1, 7, 7, 2), box(8, 3, 3, 9, 6, 4), box(8, 6, 2, 9, 7, 3),
					box(6, 5, 3, 7, 8, 4), box(7, 8, 2, 8, 9, 3), box(9, 5, 2, 10, 8, 3), box(9, 8, 1, 10, 9, 2), box(10, 7, 0, 11, 10, 1), box(9, 10, 0, 10, 11, 1), box(10, 3, 0, 11, 6, 1), box(9, 6, 0, 10, 7, 1));
			case NORTH -> Shapes.or(box(7, 6, 14, 9, 14, 16), box(5, 9, 13, 6, 12, 14), box(6, 12, 14, 7, 13, 15), box(9, 9, 12, 10, 12, 13), box(8, 12, 13, 9, 13, 14), box(7, 7, 12, 8, 10, 13), box(7, 10, 13, 8, 11, 14), box(10, 7, 13, 11, 10, 14),
					box(9, 10, 14, 10, 11, 15), box(10, 5, 15, 11, 8, 16), box(9, 8, 15, 10, 9, 16), box(10, 9, 15, 11, 12, 16), box(9, 12, 15, 10, 13, 16), box(9, 3, 14, 10, 6, 15), box(9, 6, 14, 10, 7, 15), box(7, 3, 12, 8, 6, 13),
					box(7, 6, 13, 8, 7, 14), box(9, 5, 12, 10, 8, 13), box(8, 8, 13, 9, 9, 14), box(6, 5, 13, 7, 8, 14), box(6, 8, 14, 7, 9, 15), box(5, 7, 15, 6, 10, 16), box(6, 10, 15, 7, 11, 16), box(5, 3, 15, 6, 6, 16), box(6, 6, 15, 7, 7, 16));
			case EAST -> Shapes.or(box(0, 6, 7, 2, 14, 9), box(2, 9, 5, 3, 12, 6), box(1, 12, 6, 2, 13, 7), box(3, 9, 9, 4, 12, 10), box(2, 12, 8, 3, 13, 9), box(3, 7, 7, 4, 10, 8), box(2, 10, 7, 3, 11, 8), box(2, 7, 10, 3, 10, 11),
					box(1, 10, 9, 2, 11, 10), box(0, 5, 10, 1, 8, 11), box(0, 8, 9, 1, 9, 10), box(0, 9, 10, 1, 12, 11), box(0, 12, 9, 1, 13, 10), box(1, 3, 9, 2, 6, 10), box(1, 6, 9, 2, 7, 10), box(3, 3, 7, 4, 6, 8), box(2, 6, 7, 3, 7, 8),
					box(3, 5, 9, 4, 8, 10), box(2, 8, 8, 3, 9, 9), box(2, 5, 6, 3, 8, 7), box(1, 8, 6, 2, 9, 7), box(0, 7, 5, 1, 10, 6), box(0, 10, 6, 1, 11, 7), box(0, 3, 5, 1, 6, 6), box(0, 6, 6, 1, 7, 7));
			case WEST -> Shapes.or(box(14, 6, 7, 16, 14, 9), box(13, 9, 10, 14, 12, 11), box(14, 12, 9, 15, 13, 10), box(12, 9, 6, 13, 12, 7), box(13, 12, 7, 14, 13, 8), box(12, 7, 8, 13, 10, 9), box(13, 10, 8, 14, 11, 9), box(13, 7, 5, 14, 10, 6),
					box(14, 10, 6, 15, 11, 7), box(15, 5, 5, 16, 8, 6), box(15, 8, 6, 16, 9, 7), box(15, 9, 5, 16, 12, 6), box(15, 12, 6, 16, 13, 7), box(14, 3, 6, 15, 6, 7), box(14, 6, 6, 15, 7, 7), box(12, 3, 8, 13, 6, 9), box(13, 6, 8, 14, 7, 9),
					box(12, 5, 6, 13, 8, 7), box(13, 8, 7, 14, 9, 8), box(13, 5, 9, 14, 8, 10), box(14, 8, 9, 15, 9, 10), box(15, 7, 10, 16, 10, 11), box(15, 10, 9, 16, 11, 10), box(15, 3, 10, 16, 6, 11), box(15, 6, 9, 16, 7, 10));
			case UP -> Shapes.or(box(7, 0, 6, 9, 2, 14), box(5, 2, 9, 6, 3, 12), box(6, 1, 12, 7, 2, 13), box(9, 3, 9, 10, 4, 12), box(8, 2, 12, 9, 3, 13), box(7, 3, 7, 8, 4, 10), box(7, 2, 10, 8, 3, 11), box(10, 2, 7, 11, 3, 10),
					box(9, 1, 10, 10, 2, 11), box(10, 0, 5, 11, 1, 8), box(9, 0, 8, 10, 1, 9), box(10, 0, 9, 11, 1, 12), box(9, 0, 12, 10, 1, 13), box(9, 1, 3, 10, 2, 6), box(9, 1, 6, 10, 2, 7), box(7, 3, 3, 8, 4, 6), box(7, 2, 6, 8, 3, 7),
					box(9, 3, 5, 10, 4, 8), box(8, 2, 8, 9, 3, 9), box(6, 2, 5, 7, 3, 8), box(6, 1, 8, 7, 2, 9), box(5, 0, 7, 6, 1, 10), box(6, 0, 10, 7, 1, 11), box(5, 0, 3, 6, 1, 6), box(6, 0, 6, 7, 1, 7));
			case DOWN -> Shapes.or(box(7, 14, 2, 9, 16, 10), box(5, 13, 4, 6, 14, 7), box(6, 14, 3, 7, 15, 4), box(9, 12, 4, 10, 13, 7), box(8, 13, 3, 9, 14, 4), box(7, 12, 6, 8, 13, 9), box(7, 13, 5, 8, 14, 6), box(10, 13, 6, 11, 14, 9),
					box(9, 14, 5, 10, 15, 6), box(10, 15, 8, 11, 16, 11), box(9, 15, 7, 10, 16, 8), box(10, 15, 4, 11, 16, 7), box(9, 15, 3, 10, 16, 4), box(9, 14, 10, 10, 15, 13), box(9, 14, 9, 10, 15, 10), box(7, 12, 10, 8, 13, 13),
					box(7, 13, 9, 8, 14, 10), box(9, 12, 8, 10, 13, 11), box(8, 13, 7, 9, 14, 8), box(6, 13, 8, 7, 14, 11), box(6, 14, 7, 7, 15, 8), box(5, 15, 6, 6, 16, 9), box(6, 15, 5, 7, 16, 6), box(5, 15, 10, 6, 16, 13),
					box(6, 15, 9, 7, 16, 10));
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
		return new BananaStem2BlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}
}
