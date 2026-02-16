package com.github.seltademc.data;

import com.github.seltademc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ACACIA_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.BIRCH_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHERRY_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CRIMSON_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.DARK_OAK_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.JUNGLE_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.MANGROVE_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.SPRUCE_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.WARPED_STICK, Models.HANDHELD_ROD);
    }
}
