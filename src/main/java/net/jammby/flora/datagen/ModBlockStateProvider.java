package net.jammby.flora.datagen;

import net.jammby.flora.Flora;
import net.jammby.flora.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Flora.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlockWithItem(
                ModBlocks.GILDED_TULIP.get(),
                models().cross(
                        "gilded_tulip",
                        blockTexture(ModBlocks.GILDED_TULIP.get())
                ).renderType("cutout")
        );
    }



    public void makeBush(SweetBerryBushBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);
        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, SweetBerryBushBlock block, String modelName, String textureName) {
        int age = state.getValue(SweetBerryBushBlock.AGE);

        return new ConfiguredModel[]{
                new ConfiguredModel(
                        models().cross(
                                modelName + age,
                                ResourceLocation.fromNamespaceAndPath(
                                        Flora.MOD_ID,
                                        "block/" + textureName + age
                                )
                        ).renderType("cutout")
                )
        };
    }
}