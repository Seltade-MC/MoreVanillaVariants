package com.github.seltademc.block;

import com.github.seltademc.MoreVanillaVariants;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf", new Block(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreVanillaVariants.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
    Registry.register(Registries.ITEM, Identifier.of(MoreVanillaVariants.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MoreVanillaVariants.LOGGER.info("Registering Mod Blocks for " + MoreVanillaVariants.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.ACACIA_BOOKSHELF);
        });
    }
}
