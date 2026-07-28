package net.jammby.flora.worldgen;

import net.jammby.flora.Flora;
import net.jammby.flora.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> GILDED_TULIP_KEY = registerKey("gilded_tulip");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MOON_BLOSSOM_KEY = registerKey("moon_blossom");

    public static final ResourceKey<ConfiguredFeature<?, ?>> TULIP_BUSHEL_KEY = registerKey("tulip_bushel");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ALOE_VERA_KEY = registerKey("aloe_vera");

    public static final ResourceKey<ConfiguredFeature<?, ?>> VILE_BLOOM_KEY = registerKey("vile_bloom");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_CACTUS_KEY = registerKey("small_cactus");

    public  static final ResourceKey<ConfiguredFeature<?, ?>> GLOOM_BELL_KEY = registerKey("gloom_bell");

    public  static final ResourceKey<ConfiguredFeature<?, ?>> LAVENDER_KEY = registerKey("lavender");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        register(context, GILDED_TULIP_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(
                                BlockStateProvider.simple(
                                        ModBlocks.GILDED_TULIP.get()
                                                .defaultBlockState()

                                )
                        ),
                        List.of(Blocks.GRASS_BLOCK)
                )
        );

        register(context, MOON_BLOSSOM_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(
                                BlockStateProvider.simple(
                                        ModBlocks.MOON_BLOSSOM.get()
                                                .defaultBlockState()

                                )
                        ),
                        List.of(Blocks.GRASS_BLOCK)
                ));

        register(context, TULIP_BUSHEL_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(
                                BlockStateProvider.simple(
                                        ModBlocks.TULIP_BUSHEL.get()
                                                .defaultBlockState()
                                )
                        ),
                        List.of(Blocks.GRASS_BLOCK)
                ));

        register(context, ALOE_VERA_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(
                                BlockStateProvider.simple(
                                        ModBlocks.ALOE_VERA.get()
                                                .defaultBlockState()
                                )
                        ),
                        List.of(Blocks.GRASS_BLOCK)
                ));

        register(context, VILE_BLOOM_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(
                                BlockStateProvider.simple(
                                        ModBlocks.VILE_BLOOM.get()
                                                .defaultBlockState()
                                )
                        ),
                        List.of(Blocks.GRASS_BLOCK)
                ));

        register(context, SMALL_CACTUS_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(
                                BlockStateProvider.simple(
                                        ModBlocks.SMALL_CACTUS.get()
                                                .defaultBlockState()

                                )
                        ),
                        List.of(Blocks.GRASS_BLOCK)
                )
        );

        register(context, GLOOM_BELL_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(
                                BlockStateProvider.simple(
                                        ModBlocks.GLOOM_BELL.get()
                                                .defaultBlockState()
                                )
                        ),
                        List.of(Blocks.GRASS_BLOCK)
                ));

        register(context, LAVENDER_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(
                                BlockStateProvider.simple(
                                        ModBlocks.LAVENDER.get()
                                                .defaultBlockState()
                                )
                        ),
                        List.of(Blocks.GRASS_BLOCK)
                ));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(
                Registries.CONFIGURED_FEATURE,
                ResourceLocation.fromNamespaceAndPath(Flora.MOD_ID, name)
        );
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(
            BootstrapContext<ConfiguredFeature<?, ?>> context,
            ResourceKey<ConfiguredFeature<?, ?>> key,
            F feature,
            FC configuration
    ) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));


    }


}