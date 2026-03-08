package seltademc.morevanillavariants.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import seltademc.morevanillavariants.item.ModItems;
import java.util.concurrent.CompletableFuture;

public class ModRecipes extends FabricRecipeProvider {
    public ModRecipes(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {

            @Override
            public void buildRecipes() {

                //Brushes
                createBrushRecipe(ModItems.ACACIA_BRUSH, ModItems.ACACIA_STICK);
                createBrushRecipe(ModItems.BAMBOO_BRUSH, ModItems.BAMBOO_STICK);
                createBrushRecipe(ModItems.BIRCH_BRUSH, ModItems.BIRCH_STICK);
                createBrushRecipe(ModItems.CHERRY_BRUSH, ModItems.CHERRY_STICK);
                createBrushRecipe(ModItems.CRIMSON_BRUSH, ModItems.CRIMSON_STICK);
                createBrushRecipe(ModItems.DARK_OAK_BRUSH, ModItems.DARK_OAK_STICK);
                createBrushRecipe(ModItems.JUNGLE_BRUSH, ModItems.JUNGLE_STICK);
                createBrushRecipe(ModItems.MANGROVE_BRUSH, ModItems.MANGROVE_STICK);
                createBrushRecipe(ModItems.PALE_OAK_BRUSH, ModItems.PALE_OAK_STICK);
                createBrushRecipe(ModItems.SPRUCE_BRUSH, ModItems.SPRUCE_STICK);
                createBrushRecipe(ModItems.WARPED_BRUSH, ModItems.WARPED_STICK);

                //Sticks
                createStickRecipe(ModItems.ACACIA_STICK, Items.ACACIA_PLANKS, 4, "acacia_stick");
                createStickRecipe(ModItems.BAMBOO_STICK, Items.BAMBOO_PLANKS, 4, "bamboo_stick");
                createStickRecipe(ModItems.BAMBOO_STICK, Items.BAMBOO, 1, "bamboo_stick_from_bamboo");
                createStickRecipe(ModItems.BIRCH_STICK, Items.BIRCH_PLANKS, 4, "birch_stick");
                createStickRecipe(ModItems.CHERRY_STICK, Items.CHERRY_PLANKS, 4, "cherry_stick");
                createStickRecipe(ModItems.CRIMSON_STICK, Items.CRIMSON_PLANKS, 4, "crimson_stick");
                createStickRecipe(ModItems.DARK_OAK_STICK, Items.DARK_OAK_PLANKS, 4, "dark_oak_stick");
                createStickRecipe(ModItems.JUNGLE_STICK, Items.JUNGLE_PLANKS, 4, "jungle_stick");
                createStickRecipe(ModItems.MANGROVE_STICK, Items.MANGROVE_PLANKS, 4, "mangrove_stick");
                createStickRecipe(ModItems.PALE_OAK_STICK, Items.PALE_OAK_PLANKS, 4, "pale_oak_stick");
                createStickRecipe(ModItems.SPRUCE_STICK, Items.SPRUCE_PLANKS, 4, "spruce_stick");
                createStickRecipe(ModItems.WARPED_STICK, Items.WARPED_PLANKS, 4, "warped_stick");
            }

            private void createBrushRecipe(Item brush, Item stick)   {
                shaped(RecipeCategory.TOOLS, brush)
                        .pattern("F")
                        .pattern("C")
                        .pattern("S")
                        .define('F', ModTags.FEATHERS)
                        .define('C', ModTags.COPPER_INGOTS)
                        .define('S', stick)
                        .group("brushes")
                        .unlockedBy(getHasName(stick), has(stick))
                        .save(output);
            }

            private void createStickRecipe(Item stick, Item plank, int number, String path) {
                shaped(RecipeCategory.MISC, stick, number)
                        .pattern("P")
                        .pattern("P")
                        .define('P', plank)
                        .group("sticks")
                        .unlockedBy(getHasName(plank), has(plank))
                        .save(output, path);
            }
        };
    }
    @Override
    public String getName() {
        return "ExampleModRecipeProvider";
    }
}
