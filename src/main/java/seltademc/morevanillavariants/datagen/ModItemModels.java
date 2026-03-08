package seltademc.morevanillavariants.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.item.properties.numeric.UseCycle;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.client.data.models.model.ItemModelUtils;
import seltademc.morevanillavariants.item.ModItems;
import java.util.Optional;


public class ModItemModels extends FabricModelProvider {
    public ModItemModels(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerators) {
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators)
    {
        generateBrush(itemModelGenerators, ModItems.ACACIA_BRUSH);
        generateBrush(itemModelGenerators, ModItems.BAMBOO_BRUSH);
        generateBrush(itemModelGenerators, ModItems.BIRCH_BRUSH);
        generateBrush(itemModelGenerators, ModItems.CHERRY_BRUSH);
        generateBrush(itemModelGenerators, ModItems.CRIMSON_BRUSH);
        generateBrush(itemModelGenerators, ModItems.DARK_OAK_BRUSH);
        generateBrush(itemModelGenerators, ModItems.JUNGLE_BRUSH);
        generateBrush(itemModelGenerators, ModItems.MANGROVE_BRUSH);
        generateBrush(itemModelGenerators, ModItems.PALE_OAK_BRUSH);
        generateBrush(itemModelGenerators, ModItems.SPRUCE_BRUSH);
        generateBrush(itemModelGenerators, ModItems.WARPED_BRUSH);
        //Sticks
        itemModelGenerators.generateFlatItem(ModItems.ACACIA_STICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BAMBOO_STICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BIRCH_STICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHERRY_STICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CRIMSON_STICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DARK_OAK_STICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.JUNGLE_STICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MANGROVE_STICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PALE_OAK_STICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SPRUCE_STICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.WARPED_STICK, ModelTemplates.FLAT_HANDHELD_ITEM);
    }

    private static ModelTemplate createTemplate(String path) {
        return new ModelTemplate(Optional.of(Identifier.withDefaultNamespace("item/" + path)), Optional.empty(), TextureSlot.LAYER0);
    }

    public static final ModelTemplate BRUSH_BASE = createTemplate("brush");
    public static final ModelTemplate BRUSH_BRUSHING_0 = createTemplate("brush_brushing_0");
    public static final ModelTemplate BRUSH_BRUSHING_1 = createTemplate("brush_brushing_1");
    public static final ModelTemplate BRUSH_BRUSHING_2 = createTemplate("brush_brushing_2");

    public void generateBrush(ItemModelGenerators itemModelGenerators, Item item) {
        net.minecraft.client.renderer.item.ItemModel.Unbaked unbaked = ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(item, BRUSH_BASE));
        net.minecraft.client.renderer.item.ItemModel.Unbaked unbaked2 = ItemModelUtils.plainModel(BRUSH_BRUSHING_0.create(ModelLocationUtils.getModelLocation(item, "_brushing_0"), TextureMapping.layer0(item), itemModelGenerators.modelOutput));
        net.minecraft.client.renderer.item.ItemModel.Unbaked unbaked3 = ItemModelUtils.plainModel(BRUSH_BRUSHING_1.create(ModelLocationUtils.getModelLocation(item, "_brushing_1"), TextureMapping.layer0(item), itemModelGenerators.modelOutput));
        net.minecraft.client.renderer.item.ItemModel.Unbaked unbaked4 = ItemModelUtils.plainModel(BRUSH_BRUSHING_2.create(ModelLocationUtils.getModelLocation(item, "_brushing_2"), TextureMapping.layer0(item), itemModelGenerators.modelOutput));

        itemModelGenerators.itemModelOutput.accept(item, ItemModelUtils.rangeSelect(new UseCycle(10.0F), 0.1F, unbaked,
                ItemModelUtils.override(unbaked2, 0.25F),
                ItemModelUtils.override(unbaked3, 0.5F),
                ItemModelUtils.override(unbaked4, 0.75F)));
    }
}
