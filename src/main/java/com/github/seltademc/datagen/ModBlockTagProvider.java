package com.github.seltademc.datagen;

import com.github.seltademc.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider<Block> {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BLOCK, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ConventionalBlockTags.BOOKSHELVES)
                .add(ModBlocks.ACACIA_BOOKSHELF)
                .add(Blocks.CHISELED_BOOKSHELF);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(ConventionalBlockTags.BOOKSHELVES);

        getOrCreateTagBuilder(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .addTag(ConventionalBlockTags.BOOKSHELVES);
    }
}
