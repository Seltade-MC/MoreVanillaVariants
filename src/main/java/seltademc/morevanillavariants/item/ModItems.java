package seltademc.morevanillavariants.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import seltademc.morevanillavariants.MoreVanillaVariants;
import java.util.function.Function;

public class ModItems {
public static void registerModItems() {
        MoreVanillaVariants.LOGGER.info("Registering Mod Items for " + MoreVanillaVariants.MOD_ID);
    }

    private static ResourceKey<Item> modItemId(String nameItem) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MoreVanillaVariants.MOD_ID, nameItem));
    }

    private static Item registerItem(String nameItem, Function<Item.Properties, Item> function, Item.Properties properties) {
        Item item = (Item) function.apply(properties.setId(modItemId(nameItem)));
        if (item instanceof BlockItem blockItem) {
            blockItem.registerBlocks(Item.BY_BLOCK, item);
        }
        return (Item)Registry.register(BuiltInRegistries.ITEM, modItemId(nameItem), item);
    }

    //Brushes
    public static final Item ACACIA_BRUSH = registerBrushItem("acacia", Items.BRUSH, new Item.Properties());
    public static final Item BAMBOO_BRUSH = registerBrushItem("bamboo", ACACIA_BRUSH, new Item.Properties());
    public static final Item BIRCH_BRUSH = registerBrushItem("birch", BAMBOO_BRUSH, new Item.Properties());
    public static final Item CHERRY_BRUSH = registerBrushItem("cherry", BIRCH_BRUSH, new Item.Properties());
    public static final Item CRIMSON_BRUSH = registerBrushItem("crimson", CHERRY_BRUSH, new Item.Properties().fireResistant());
    public static final Item DARK_OAK_BRUSH = registerBrushItem("dark_oak", CRIMSON_BRUSH, new Item.Properties());
    public static final Item JUNGLE_BRUSH = registerBrushItem("jungle", DARK_OAK_BRUSH, new Item.Properties());
    public static final Item MANGROVE_BRUSH = registerBrushItem("mangrove", JUNGLE_BRUSH, new Item.Properties());
    public static final Item PALE_OAK_BRUSH = registerBrushItem("pale_oak", MANGROVE_BRUSH, new Item.Properties());
    public static final Item SPRUCE_BRUSH = registerBrushItem("spruce", PALE_OAK_BRUSH, new Item.Properties());
    public static final Item WARPED_BRUSH = registerBrushItem("warped", SPRUCE_BRUSH, new Item.Properties().fireResistant());

    private static Item registerBrushItem(String woodType, Item itemAfter, Item.Properties properties) {
        Item brushItem = registerItem(woodType + "_brush", BrushItem::new, properties.durability(64));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> entries.addAfter(itemAfter, brushItem));
        return brushItem;
    }

    //Sticks
    public static final Item ACACIA_STICK = registerStickItem("acacia", Items.STICK, new Item.Properties());
    public static final Item BIRCH_STICK = registerStickItem("birch", ACACIA_STICK, new Item.Properties());
    public static final Item CHERRY_STICK = registerStickItem("cherry", BIRCH_STICK, new Item.Properties());
    public static final Item CRIMSON_STICK = registerStickItem("crimson", CHERRY_STICK, new Item.Properties().fireResistant());
    public static final Item DARK_OAK_STICK = registerStickItem("dark_oak", CRIMSON_STICK, new Item.Properties());
    public static final Item JUNGLE_STICK = registerStickItem("jungle", DARK_OAK_STICK, new Item.Properties());
    public static final Item MANGROVE_STICK = registerStickItem("mangrove", JUNGLE_STICK, new Item.Properties());
    public static final Item PALE_OAK_STICK = registerStickItem("pale_oak", MANGROVE_STICK, new Item.Properties());
    public static final Item SPRUCE_STICK = registerStickItem("spruce", PALE_OAK_STICK, new Item.Properties());
    public static final Item WARPED_STICK = registerStickItem("warped", SPRUCE_STICK, new Item.Properties().fireResistant());

    private static Item registerStickItem(String woodType, Item itemAfter, Item.Properties properties) {
        Item stickItem = registerItem(woodType + "_stick", Item::new, properties);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> entries.addAfter(itemAfter, stickItem));
        return stickItem;
    }
}
