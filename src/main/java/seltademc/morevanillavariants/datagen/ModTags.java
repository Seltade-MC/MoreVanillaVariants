package seltademc.morevanillavariants.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import seltademc.morevanillavariants.MoreVanillaVariants;
import seltademc.morevanillavariants.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModTags extends FabricTagProvider.ItemTagProvider {
    public ModTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    private static TagKey<Item> createTag(String namespace, String name) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(namespace, name));
    }

    public static final TagKey<Item> MORE_STICKS = createTag(MoreVanillaVariants.MOD_ID, "sticks");
    public static final TagKey<Item> MORE_ARROWS = createTag(MoreVanillaVariants.MOD_ID, "arrows");
    public static final TagKey<Item> MORE_BRUSHES = createTag(MoreVanillaVariants.MOD_ID, "brushes");
    public static final TagKey<Item> WOODEN_RODS = createTag("c", "rods/wooden");
    public static final TagKey<Item> BRUSH_TOOLS = createTag("c", "tools/brush");
    public static final TagKey<Item> ARROWS = createTag("c", "arrows");
    public static final TagKey<Item> FEATHERS = createTag("c", "feathers");
    public static final TagKey<Item> COPPER_INGOTS = createTag("c", "ingots/copper");

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {

        valueLookupBuilder(MORE_STICKS)
                .add(Items.STICK)
                .add(ModItems.ACACIA_STICK)
                .add(ModItems.BAMBOO_STICK)
                .add(ModItems.BIRCH_STICK)
                .add(ModItems.CHERRY_STICK)
                .add(ModItems.CRIMSON_STICK)
                .add(ModItems.DARK_OAK_STICK)
                .add(ModItems.JUNGLE_STICK)
                .add(ModItems.MANGROVE_STICK)
                .add(ModItems.PALE_OAK_STICK)
                .add(ModItems.SPRUCE_STICK)
                .add(ModItems.WARPED_STICK);

        valueLookupBuilder(MORE_BRUSHES)
                .add(Items.BRUSH)
                .add(ModItems.ACACIA_BRUSH)
                .add(ModItems.BAMBOO_BRUSH)
                .add(ModItems.BIRCH_BRUSH)
                .add(ModItems.CHERRY_BRUSH)
                .add(ModItems.CRIMSON_BRUSH)
                .add(ModItems.DARK_OAK_BRUSH)
                .add(ModItems.JUNGLE_BRUSH)
                .add(ModItems.MANGROVE_BRUSH)
                .add(ModItems.PALE_OAK_BRUSH)
                .add(ModItems.SPRUCE_BRUSH)
                .add(ModItems.WARPED_BRUSH);

        valueLookupBuilder(MORE_ARROWS)
                .add(Items.ARROW)
                .add(ModItems.ACACIA_ARROW)
                .add(ModItems.BAMBOO_ARROW)
                .add(ModItems.BIRCH_ARROW)
                .add(ModItems.CHERRY_ARROW)
                .add(ModItems.CRIMSON_ARROW)
                .add(ModItems.DARK_OAK_ARROW)
                .add(ModItems.JUNGLE_ARROW)
                .add(ModItems.MANGROVE_ARROW)
                .add(ModItems.PALE_OAK_ARROW)
                .add(ModItems.SPRUCE_ARROW)
                .add(ModItems.WARPED_ARROW);

        valueLookupBuilder(ARROWS)
                .addTag(MORE_ARROWS);

        valueLookupBuilder(WOODEN_RODS)
                .addTag(MORE_STICKS);

        valueLookupBuilder(BRUSH_TOOLS)
                .addTag(MORE_BRUSHES);
    }
}