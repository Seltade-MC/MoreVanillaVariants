package seltademc.morevanillavariants.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import seltademc.morevanillavariants.item.ModItems;
import java.util.concurrent.CompletableFuture;

public class ModLangEN extends FabricLanguageProvider {
    public ModLangEN(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider holderLookup, TranslationBuilder translationBuilder) {

        //Arrows
        translationBuilder.add(ModTags.MORE_ARROWS, "Arrows");
        translationBuilder.add(ModItems.ACACIA_ARROW, "Acacia Arrow");
        translationBuilder.add(ModItems.BAMBOO_ARROW, "Bamboo Arrow");
        translationBuilder.add(ModItems.BIRCH_ARROW, "Birch Arrow");
        translationBuilder.add(ModItems.CHERRY_ARROW, "Cherry Arrow");
        translationBuilder.add(ModItems.CRIMSON_ARROW, "Crimson Arrow");
        translationBuilder.add(ModItems.DARK_OAK_ARROW, "Dark Oak Arrow");
        translationBuilder.add(ModItems.JUNGLE_ARROW, "Jungle Arrow");
        translationBuilder.add(ModItems.MANGROVE_ARROW, "Mangrove Arrow");
        translationBuilder.add(ModItems.PALE_OAK_ARROW, "Pale Oak Arrow");
        translationBuilder.add(ModItems.SPRUCE_ARROW, "Spruce Arrow");
        translationBuilder.add(ModItems.WARPED_ARROW, "Warped Arrow");

        //Brushes
        translationBuilder.add(ModTags.MORE_BRUSHES, "Brushes");
        translationBuilder.add(ModItems.ACACIA_BRUSH, "Acacia Brush");
        translationBuilder.add(ModItems.BAMBOO_BRUSH, "Bamboo Brush");
        translationBuilder.add(ModItems.BIRCH_BRUSH, "Birch Brush");
        translationBuilder.add(ModItems.CHERRY_BRUSH, "Cherry Brush");
        translationBuilder.add(ModItems.CRIMSON_BRUSH, "Crimson Brush");
        translationBuilder.add(ModItems.DARK_OAK_BRUSH, "Dark Oak Brush");
        translationBuilder.add(ModItems.JUNGLE_BRUSH, "Jungle Brush");
        translationBuilder.add(ModItems.MANGROVE_BRUSH, "Mangrove Brush");
        translationBuilder.add(ModItems.PALE_OAK_BRUSH, "Pale Oak Brush");
        translationBuilder.add(ModItems.SPRUCE_BRUSH, "Spruce Brush");
        translationBuilder.add(ModItems.WARPED_BRUSH, "Warped Brush");

        //Sticks
        translationBuilder.add(ModTags.MORE_STICKS, "Sticks");
        translationBuilder.add(ModItems.ACACIA_STICK, "Acacia Stick");
        translationBuilder.add(ModItems.BAMBOO_STICK, "Bamboo Stick");
        translationBuilder.add(ModItems.BIRCH_STICK, "Birch Stick");
        translationBuilder.add(ModItems.CHERRY_STICK, "Cherry Stick");
        translationBuilder.add(ModItems.CRIMSON_STICK, "Crimson Stick");
        translationBuilder.add(ModItems.DARK_OAK_STICK, "Dark Oak Stick");
        translationBuilder.add(ModItems.JUNGLE_STICK, "Jungle Stick");
        translationBuilder.add(ModItems.MANGROVE_STICK, "Mangrove Stick");
        translationBuilder.add(ModItems.PALE_OAK_STICK, "Pale Oak Stick");
        translationBuilder.add(ModItems.SPRUCE_STICK, "Spruce Stick");
        translationBuilder.add(ModItems.WARPED_STICK, "Warped Stick");
    }
}