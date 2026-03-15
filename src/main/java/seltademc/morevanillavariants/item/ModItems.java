package seltademc.morevanillavariants.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import seltademc.morevanillavariants.MoreVanillaVariants;

import java.util.function.Function;

import static net.minecraft.resources.Identifier.fromNamespaceAndPath;

public class ModItems {
    public static void registerModItems() {
            MoreVanillaVariants.LOGGER.info("Registering Mod Items for " + MoreVanillaVariants.MOD_ID);
    }

    //Brushes
    public static final Item ACACIA_BRUSH = registerBrushItem("acacia");
    public static final Item BAMBOO_BRUSH = registerBrushItem("bamboo");
    public static final Item BIRCH_BRUSH = registerBrushItem("birch");
    public static final Item CHERRY_BRUSH = registerBrushItem("cherry");
    public static final Item CRIMSON_BRUSH = registerBrushItem("crimson");
    public static final Item DARK_OAK_BRUSH = registerBrushItem("dark_oak");
    public static final Item JUNGLE_BRUSH = registerBrushItem("jungle");
    public static final Item MANGROVE_BRUSH = registerBrushItem("mangrove");
    public static final Item PALE_OAK_BRUSH = registerBrushItem("pale_oak");
    public static final Item SPRUCE_BRUSH = registerBrushItem("spruce");
    public static final Item WARPED_BRUSH = registerBrushItem("warped");

    public static Item registerBrushItem(String woodType) {
        BrushItem.Properties properties = new BrushItem.Properties().durability(64);
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, fromNamespaceAndPath(MoreVanillaVariants.MOD_ID, woodType + "_brush"));
        if (woodType.matches("crimson|warped")) {properties = properties.fireResistant();}
        BrushItem brush = new BrushItem(properties.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, brush);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register((itemGroup) -> itemGroup.addBefore(Items.BRUSH, brush));
        return brush;
    }

    //Arrows


    public static final Item ACACIA_ARROW = registerItem("acacia", ArrowItem::new);
    public static final Item BAMBOO_ARROW = registerItem("bamboo", ArrowItem::new);
    public static final Item BIRCH_ARROW = registerItem("birch", ArrowItem::new);
    public static final Item CHERRY_ARROW = registerItem("cherry", ArrowItem::new);
    public static final Item CRIMSON_ARROW = registerItem("crimson", ArrowItem::new);
    public static final Item DARK_OAK_ARROW = registerItem("dark_oak", ArrowItem::new);
    public static final Item JUNGLE_ARROW = registerItem("jungle", ArrowItem::new);
    public static final Item MANGROVE_ARROW = registerItem("mangrove", ArrowItem::new);
    public static final Item PALE_OAK_ARROW = registerItem("pale_oak", ArrowItem::new);
    public static final Item SPRUCE_ARROW = registerItem("spruce", ArrowItem::new);
    public static final Item WARPED_ARROW = registerItem("warped", ArrowItem::new);

    public static ArrowItem registerItem(String woodType, Function<Item.Properties, Item> function) {
        Item.Properties properties = new Item.Properties();
        ResourceKey<Item> resourceKey = ResourceKey.create(Registries.ITEM, fromNamespaceAndPath(MoreVanillaVariants.MOD_ID, woodType + "_arrow"));
        ArrowItem arrow = (ArrowItem) function.apply(properties.setId(resourceKey));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register((itemGroup) -> itemGroup.addBefore(Items.ARROW, arrow));
        return Registry.register(BuiltInRegistries.ITEM, resourceKey, arrow);
    }

    //Sticks
    public static final Item ACACIA_STICK = registerWoodenItem("acacia", "stick");
    public static final Item BAMBOO_STICK = registerWoodenItem("bamboo", "stick");
    public static final Item BIRCH_STICK = registerWoodenItem("birch", "stick");
    public static final Item CHERRY_STICK = registerWoodenItem("cherry", "stick");
    public static final Item CRIMSON_STICK = registerWoodenItem("crimson", "stick");
    public static final Item DARK_OAK_STICK = registerWoodenItem("dark_oak", "stick");
    public static final Item JUNGLE_STICK = registerWoodenItem("jungle", "stick");
    public static final Item MANGROVE_STICK = registerWoodenItem("mangrove", "stick");
    public static final Item PALE_OAK_STICK = registerWoodenItem("pale_oak", "stick");
    public static final Item SPRUCE_STICK = registerWoodenItem("spruce", "stick");
    public static final Item WARPED_STICK = registerWoodenItem("warped", "stick");

    public static Item registerWoodenItem(String woodType, String itemType) {
        Item.Properties properties = new Item.Properties();
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, fromNamespaceAndPath(MoreVanillaVariants.MOD_ID, woodType + "_" + itemType));
        if (woodType.matches("crimson|warped")) {properties = properties.fireResistant();}
        Item item = new Item(properties.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register((itemGroup) -> itemGroup.accept(item));
        return item;
    }
}

