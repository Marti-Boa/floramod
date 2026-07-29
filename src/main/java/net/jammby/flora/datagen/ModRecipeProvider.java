package net.jammby.flora.datagen;

import net.minecraft.world.item.Items;
import net.jammby.flora.Flora;
import net.jammby.flora.block.ModBlocks;
import net.jammby.flora.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.models.model.TextureMapping.pattern;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.CYAN_DYE)
                .requires(ModBlocks.GILDED_TULIP)
                .unlockedBy(getHasName(ModBlocks.GILDED_TULIP), has(ModBlocks.GILDED_TULIP))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .requires(ModBlocks.MOON_BLOSSOM)
                .unlockedBy(getHasName(ModBlocks.MOON_BLOSSOM), has(ModBlocks.MOON_BLOSSOM))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.ORANGE_DYE)
                .requires(ModBlocks.TULIP_BUSHEL)
                .unlockedBy(getHasName(ModBlocks.TULIP_BUSHEL), has(ModBlocks.TULIP_BUSHEL))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GREEN_DYE)
                .requires(ModBlocks.ALOE_VERA)
                .unlockedBy(getHasName(ModBlocks.ALOE_VERA), has(ModBlocks.ALOE_VERA))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PURPLE_DYE)
                .requires(ModBlocks.LAVENDER)
                .unlockedBy(getHasName(ModBlocks.LAVENDER), has(ModBlocks.LAVENDER))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLUE_DYE)
                .requires(ModBlocks.GLOOM_BELL)
                .unlockedBy(getHasName(ModBlocks.GLOOM_BELL), has(ModBlocks.GLOOM_BELL))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PURPLE_DYE)
                .requires(ModBlocks.VILE_BLOOM)
                .unlockedBy(getHasName(ModBlocks.VILE_BLOOM), has(ModBlocks.VILE_BLOOM))
                .save(recipeOutput,
                        ResourceLocation.fromNamespaceAndPath(
                                Flora.MOD_ID,
                                "purple_dye_from_vile_bloom"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LIME_DYE)
                .requires(ModBlocks.SMALL_CACTUS)
                .unlockedBy(getHasName(ModBlocks.SMALL_CACTUS), has(ModBlocks.SMALL_CACTUS))
                .save(recipeOutput);

    }



    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, Flora.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}