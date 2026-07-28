package net.jammby.flora.datagen;

import net.jammby.flora.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.jammby.flora.Flora;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output,
                               CompletableFuture<HolderLookup.Provider> lookupProvider,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Flora.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.FLOWERS)
                .add(ModBlocks.GILDED_TULIP.get());

        tag(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.GILDED_TULIP.get());

        tag(BlockTags.FLOWERS)
                .add(ModBlocks.MOON_BLOSSOM.get());

        tag(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.MOON_BLOSSOM.get());

        tag(BlockTags.FLOWERS)
                .add(ModBlocks.TULIP_BUSHEL.get());

        tag(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.TULIP_BUSHEL.get());

        tag(BlockTags.FLOWERS)
                .add(ModBlocks.ALOE_VERA.get());

//make so aloe vera can be placed on sand
        tag(BlockTags.FLOWERS)
                .add(ModBlocks.VILE_BLOOM.get());

        tag(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.VILE_BLOOM.get());

        tag(BlockTags.FLOWERS)
                .add(ModBlocks.SMALL_CACTUS.get());

        tag(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.SMALL_CACTUS.get());

        tag(BlockTags.FLOWERS)
                .add(ModBlocks.GLOOM_BELL.get());

        tag(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.GLOOM_BELL.get());

        tag(BlockTags.FLOWERS)
                .add(ModBlocks.LAVENDER.get());

        tag(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.LAVENDER.get());
    }

}