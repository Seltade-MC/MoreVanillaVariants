package com.github.seltademc.item;

import com.github.seltademc.MoreVanillaVariants;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup STICK_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(MoreVanillaVariants.MOD_ID, "stick_items"), FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ACACIA_STICK)).displayName(Text.translatable("itemgroup.more-vanilla-variants.stick_items")).entries((displayContext, entries) -> {
        entries.add(ModItems.ACACIA_STICK);
        entries.add(ModItems.BIRCH_STICK);
        entries.add(ModItems.CHERRY_STICK);
        entries.add(ModItems.CRIMSON_STICK);
        entries.add(ModItems.DARK_OAK_STICK);
        entries.add(ModItems.JUNGLE_STICK);
        entries.add(ModItems.MANGROVE_STICK);
        entries.add(ModItems.SPRUCE_STICK);
        entries.add(ModItems.WARPED_STICK);
    }).build());

    public static void registerItemGroups() {
        MoreVanillaVariants.LOGGER.info("Registering Item Groups for " + MoreVanillaVariants.MOD_ID);
    }
}
