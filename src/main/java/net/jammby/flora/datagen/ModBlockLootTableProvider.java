package net.jammby.flora.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import net.jammby.flora.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        dropSelf(ModBlocks.GILDED_TULIP.get());
        dropSelf(ModBlocks.MOON_BLOSSOM.get());
        dropSelf(ModBlocks.TULIP_BUSHEL.get());
        dropSelf(ModBlocks.ALOE_VERA.get());
        dropSelf(ModBlocks.VILE_BLOOM.get());
        dropSelf(ModBlocks.SMALL_CACTUS.get());
        dropSelf(ModBlocks.GLOOM_BELL.get());
        dropSelf(ModBlocks.LAVENDER.get());


        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}