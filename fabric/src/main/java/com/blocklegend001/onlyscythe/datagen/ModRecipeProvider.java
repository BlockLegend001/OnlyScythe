package com.blocklegend001.onlyscythe.datagen;

import com.blocklegend001.onlyscythe.Constants;
import com.blocklegend001.onlyscythe.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.TOOLS, ModItems.WOODEN_SCYTHE)
                        .pattern("###")
                        .pattern("  S")
                        .pattern("  S")
                        .define('#', ItemTags.PLANKS)
                        .define('S', Items.STICK)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.STONE_SCYTHE)
                        .pattern("###")
                        .pattern("  S")
                        .pattern("  S")
                        .define('#', ItemTags.STONE_TOOL_MATERIALS)
                        .define('S', Items.STICK)
                        .unlockedBy("has_cobblestone", has(ItemTags.STONE_TOOL_MATERIALS))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.COPPER_SCYTHE)
                        .pattern("###")
                        .pattern("  S")
                        .pattern("  S")
                        .define('#', Items.COPPER_INGOT)
                        .define('S', Items.STICK)
                        .unlockedBy("has_cobblestone", has(Items.COPPER_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.IRON_SCYTHE)
                        .pattern("###")
                        .pattern("  S")
                        .pattern("  S")
                        .define('#', Items.IRON_INGOT)
                        .define('S', Items.STICK)
                        .unlockedBy("has_iron", has(Items.IRON_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.GOLDEN_SCYTHE)
                        .pattern("###")
                        .pattern("  S")
                        .pattern("  S")
                        .define('#', Items.GOLD_INGOT)
                        .define('S', Items.STICK)
                        .unlockedBy("has_gold", has(Items.GOLD_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.DIAMOND_SCYTHE)
                        .pattern("###")
                        .pattern("  S")
                        .pattern("  S")
                        .define('#', Items.DIAMOND)
                        .define('S', Items.STICK)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .save(output);

                SmithingTransformRecipeBuilder
                        .smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(ModItems.DIAMOND_SCYTHE),
                                Ingredient.of(Items.NETHERITE_INGOT),
                                RecipeCategory.TOOLS,
                                ModItems.NETHERITE_SCYTHE
                        )
                        .unlocks("has_netherite", has(Items.NETHERITE_INGOT))
                        .save(output, String.valueOf(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "netherite_scythe")));

            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}