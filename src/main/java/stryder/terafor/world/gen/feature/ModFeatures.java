package stryder.terafor.world.gen.feature;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import stryder.terafor.block.ModBlocks;

public class ModFeatures {
	public static final ConfiguredFeature<?, ?> ORE_COPPER = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, States.COPPER_ORE, 13)).range(64).square().func_242731_b(20);
	public static final ConfiguredFeature<?, ?> ORE_SILVER = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, States.SILVER_ORE, 9)).range(38).square().func_242731_b(20);

	public static final class States {
		protected static final BlockState COPPER_ORE = ModBlocks.COPPER_ORE.get().getDefaultState();
		protected static final BlockState SILVER_ORE = ModBlocks.SILVER_ORE.get().getDefaultState();
	}
}
