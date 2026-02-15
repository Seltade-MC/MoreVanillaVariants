package com.github.seltademc.datagen;

import com.github.seltademc.MoreVanillaVariants;
import com.github.seltademc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    public static final TagKey<Item> STICKS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreVanillaVariants.MOD_ID, "sticks"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(STICKS)
                .add(ModItems.ACACIA_STICK)
                .add(ModItems.BIRCH_STICK)
                .add(ModItems.CHERRY_STICK)
                .add(ModItems.CRIMSON_STICK)
                .add(ModItems.DARK_OAK_STICK)
                .add(ModItems.JUNGLE_STICK)
                .add(ModItems.MANGROVE_STICK)
                .add(ModItems.SPRUCE_STICK)
                .add(ModItems.WARPED_STICK);

        getOrCreateTagBuilder(ConventionalItemTags.WOODEN_RODS)
                .addTag(STICKS);
    }
}
