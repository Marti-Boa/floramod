package net.jammby.flora.datagen;

import net.jammby.flora.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.jammby.flora.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    protected ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        this.builder(NeoForgeDataMaps.COMPOSTABLES)
                .add(ModBlocks.GILDED_TULIP.getId(), new Compostable(0.3f), false)
                .add(ModBlocks.MOON_BLOSSOM.getId(), new Compostable(0.3f), false)
                .add(ModBlocks.ALOE_VERA.getId(), new Compostable(0.3f), false)
                .add(ModBlocks.TULIP_BUSHEL.getId(), new Compostable(0.3f), false)
                .add(ModBlocks.VILE_BLOOM.getId(), new Compostable(0.3f), false)
                .add(ModBlocks.LAVENDER.getId(), new Compostable(0.3f), false)
                .add(ModBlocks.SMALL_CACTUS.getId(), new Compostable(0.3f), false)
                .add(ModBlocks.GLOOM_BELL.getId(), new Compostable(0.3f), false);

    }
}