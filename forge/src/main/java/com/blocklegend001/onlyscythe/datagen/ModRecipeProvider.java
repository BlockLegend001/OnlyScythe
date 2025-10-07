package com.blocklegend001.onlyscythe.datagen;

import com.blocklegend001.onlyscythe.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(HolderLookup.Provider lookup, RecipeOutput recipeOutput) {
        super(lookup, recipeOutput);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
            super(output, providerCompletableFuture);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        baseScytheRecipe(this.output, ItemTags.PLANKS, ModItems.WOODEN_SCYTHE);
        baseScytheRecipe(this.output, ItemTags.STONE_TOOL_MATERIALS, ModItems.STONE_SCYTHE);
        baseScytheRecipe(this.output, Items.IRON_INGOT, ModItems.IRON_SCYTHE);
        baseScytheRecipe(this.output, Items.GOLD_INGOT, ModItems.GOLDEN_SCYTHE);
        baseScytheRecipe(this.output, Items.DIAMOND, ModItems.DIAMOND_SCYTHE);
        baseSmithingRecipe(this.output, Items.NETHERITE_INGOT, ModItems.DIAMOND_SCYTHE, ModItems.NETHERITE_SCYTHE);
    }

    public void baseScytheRecipe(RecipeOutput output, ItemLike ingredient, Item result) {
        shaped(RecipeCategory.TOOLS, result)
                .define('#', ingredient)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("  S")
                .pattern("  S")
                .unlockedBy("has_" + ingredient.asItem().builtInRegistryHolder().key().location().getPath(), has(ingredient))
                .save(output);
    }

    public void baseScytheRecipe(RecipeOutput output, TagKey<Item> tag, Item result) {
        shaped(RecipeCategory.TOOLS, result)
                .define('#', tag)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("  S")
                .pattern("  S")
                .unlockedBy("has_" + tag.location().getPath(), has(tag))
                .save(output);
    }

    public void baseSmithingRecipe(RecipeOutput output, Item base, Item addition, Item result) {
        SmithingTransformRecipeBuilder
                .smithing(
                        Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(base),
                        Ingredient.of(addition),
                        RecipeCategory.MISC,
                        result
                )
                .unlocks("has_addition", has(addition))
                .save(output, String.valueOf(ResourceLocation.fromNamespaceAndPath("onlyscythe", result.getDescriptionId().replace("item.onlyscythe.", "") + "_smithing")));
    }

}