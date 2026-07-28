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
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(
                NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                ResourceLocation.fromNamespaceAndPath(Flora.MOD_ID, name)
        );
    }
}
