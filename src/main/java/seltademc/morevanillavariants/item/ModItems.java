package seltademc.morevanillavariants.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import seltademc.morevanillavariants.MoreVanillaVariants;
import net.minecraft.world.item.Item;
import static net.minecraft.world.item.Items.registerItem;

public class ModItems {

    public static final Item ACACIA_STICK = registerItem(ResourceLocation.fromNamespaceAndPath(MoreVanillaVariants.MOD_ID, "acacia_stick"), new Item(new Item.Properties()));
    public static final Item BIRCH_STICK = registerItem(ResourceLocation.fromNamespaceAndPath(MoreVanillaVariants.MOD_ID,"birch_stick"), new Item(new Item.Properties()));
    public static final Item CHERRY_STICK = registerItem(ResourceLocation.fromNamespaceAndPath(MoreVanillaVariants.MOD_ID, "cherry_stick"), new Item(new Item.Properties()));
    public static final Item CRIMSON_STICK = registerItem(ResourceLocation.fromNamespaceAndPath(MoreVanillaVariants.MOD_ID, "crimson_stick"), new Item(new Item.Properties()));
    public static final Item DARK_OAK_STICK = registerItem(ResourceLocation.fromNamespaceAndPath(MoreVanillaVariants.MOD_ID, "dark_oak_stick"), new Item(new Item.Properties()));
    public static final Item JUNGLE_STICK = registerItem(ResourceLocation.fromNamespaceAndPath(MoreVanillaVariants.MOD_ID, "jungle_stick"), new Item(new Item.Properties()));
    public static final Item MANGROVE_STICK = registerItem(ResourceLocation.fromNamespaceAndPath(MoreVanillaVariants.MOD_ID, "mangrove_stick"), new Item(new Item.Properties()));
    public static final Item PALE_OAK_STICK = registerItem(ResourceLocation.fromNamespaceAndPath(MoreVanillaVariants.MOD_ID, "pale_oak_stick"), new Item(new Item.Properties()));
    public static final Item SPRUCE_STICK = registerItem(ResourceLocation.fromNamespaceAndPath(MoreVanillaVariants.MOD_ID, "spruce_stick"), new Item(new Item.Properties()));
    public static final Item WARPED_STICK = registerItem(ResourceLocation.fromNamespaceAndPath(MoreVanillaVariants.MOD_ID, "warped_stick"), new Item(new Item.Properties()));


    public static void registerModItems() {
        MoreVanillaVariants.LOGGER.info("Registering Mod Items for " + MoreVanillaVariants.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {
            entries.accept(ModItems.ACACIA_STICK);
            entries.accept(ModItems.BIRCH_STICK);
            entries.accept(ModItems.CHERRY_STICK);
            entries.accept(ModItems.CRIMSON_STICK);
            entries.accept(ModItems.DARK_OAK_STICK);
            entries.accept(ModItems.JUNGLE_STICK);
            entries.accept(ModItems.MANGROVE_STICK);
            entries.accept(ModItems.PALE_OAK_STICK);
            entries.accept(ModItems.SPRUCE_STICK);
            entries.accept(ModItems.WARPED_STICK);
        });
    }
}
