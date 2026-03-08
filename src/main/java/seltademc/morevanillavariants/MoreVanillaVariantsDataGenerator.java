package seltademc.morevanillavariants;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import seltademc.morevanillavariants.datagen.ModItemModels;
import seltademc.morevanillavariants.datagen.ModLangEN;
import seltademc.morevanillavariants.datagen.ModRecipes;
import seltademc.morevanillavariants.datagen.ModTags;

public class MoreVanillaVariantsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModItemModels::new);
		pack.addProvider(ModTags::new);
		pack.addProvider(ModLangEN::new);
		pack.addProvider(ModRecipes::new);
	}
}
