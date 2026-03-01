package seltademc.item;

import seltademc.MoreVanillaVariants;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ACACIA_STICK = registerItem( "acacia_stick", new Item(new Item.Settings()));
    public static final Item BIRCH_STICK = registerItem( "birch_stick", new Item(new Item.Settings()));
    public static final Item CHERRY_STICK = registerItem( "cherry_stick", new Item(new Item.Settings()));
    public static final Item CRIMSON_STICK = registerItem( "crimson_stick", new Item(new Item.Settings()));
    public static final Item DARK_OAK_STICK = registerItem( "dark_oak_stick", new Item(new Item.Settings()));
    public static final Item JUNGLE_STICK = registerItem( "jungle_stick", new Item(new Item.Settings()));
    public static final Item MANGROVE_STICK = registerItem( "mangrove_stick", new Item(new Item.Settings()));
    public static final Item PALE_OAK_STICK = registerItem( "pale_oak_stick", new Item(new Item.Settings()));
    public static final Item SPRUCE_STICK = registerItem( "spruce_stick", new Item(new Item.Settings()));
    public static final Item WARPED_STICK = registerItem( "warped_stick", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreVanillaVariants.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreVanillaVariants.LOGGER.info("Registering Mod Items for " + MoreVanillaVariants.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ACACIA_STICK);
            fabricItemGroupEntries.add(BIRCH_STICK);
            fabricItemGroupEntries.add(CHERRY_STICK);
            fabricItemGroupEntries.add(CRIMSON_STICK);
            fabricItemGroupEntries.add(DARK_OAK_STICK);
            fabricItemGroupEntries.add(JUNGLE_STICK);
            fabricItemGroupEntries.add(MANGROVE_STICK);
            fabricItemGroupEntries.add(PALE_OAK_STICK);
            fabricItemGroupEntries.add(SPRUCE_STICK);
            fabricItemGroupEntries.add(WARPED_STICK);
        });
    }
}
