package net.jammby.flora.worldgen;

import net.minecraft.world.level.biome.Biomes;
import net.jammby.flora.Flora;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> ADD_GILDED_TULIP =
            registerKey("add_gilded_tulip");

    public static final ResourceKey<BiomeModifier> ADD_MOON_BLOSSOM =
            registerKey("add_moon_blossom");

    public static final ResourceKey<BiomeModifier> ADD_TULIP_BUSHEL =
            registerKey("add_tulip_bushel");

    public static final ResourceKey<BiomeModifier> ADD_ALOE_VERA =
            registerKey("add_aloe_vera");

    public static final ResourceKey<BiomeModifier> ADD_VILE_BLOOM =
            registerKey("add_vile_bloom");

    public static final ResourceKey<BiomeModifier> ADD_SMALL_CACTUS =
            registerKey("add_small_cactus");

    public static final ResourceKey<BiomeModifier> ADD_GLOOM_BELL =
            registerKey("add_gloom_bell");

    public static final ResourceKey<BiomeModifier> ADD_LAVENDER =
            registerKey("add_lavender");


    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_GILDED_TULIP,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.FOREST),
                                biomes.getOrThrow(Biomes.PLAINS),
                                biomes.getOrThrow(Biomes.FLOWER_FOREST)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(ModPlacedFeatures.GILDED_TULIP_PLACED_KEY)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                ));

        context.register(ADD_MOON_BLOSSOM,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.FOREST),
                                biomes.getOrThrow(Biomes.PLAINS),
                                biomes.getOrThrow(Biomes.FLOWER_FOREST)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(ModPlacedFeatures.MOON_BLOSSOM_PLACED_KEY)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                ));

        context.register(ADD_TULIP_BUSHEL,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.FLOWER_FOREST),
                                biomes.getOrThrow(Biomes.PLAINS)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(ModPlacedFeatures.TULIP_BUSHEL_PLACED_KEY)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                ));

        context.register(ADD_ALOE_VERA,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.SAVANNA),
                                biomes.getOrThrow(Biomes.DESERT),
                                biomes.getOrThrow(Biomes.WOODED_BADLANDS)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(ModPlacedFeatures.ALOE_VERA_PLACED_KEY)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                ));

        context.register(ADD_VILE_BLOOM,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.DARK_FOREST),
                                biomes.getOrThrow(Biomes.MANGROVE_SWAMP),
                                biomes.getOrThrow(Biomes.SWAMP)
                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(ModPlacedFeatures.VILE_BLOOM_PLACED_KEY)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                ));

        context.register(ADD_SMALL_CACTUS,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.DESERT),
                                biomes.getOrThrow(Biomes.WOODED_BADLANDS)

                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(ModPlacedFeatures.SMALL_CACTUS_PLACED_KEY)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                ));

        context.register(ADD_GLOOM_BELL,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.MANGROVE_SWAMP),
                                biomes.getOrThrow(Biomes.SWAMP)

                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(ModPlacedFeatures.GLOOM_BELL_PLACED_KEY)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                ));

        context.register(ADD_LAVENDER,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        HolderSet.direct(
                                biomes.getOrThrow(Biomes.DARK_FOREST),
                                biomes.getOrThrow(Biomes.SAVANNA),
                                biomes.getOrThrow(Biomes.FOREST),
                                biomes.getOrThrow(Biomes.FLOWER_FOREST)

                        ),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(ModPlacedFeatures.LAVENDER_PLACED_KEY)
                        ),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                ));


    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(
                NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                ResourceLocation.fromNamespaceAndPath(Flora.MOD_ID, name)
        );
    }
}
