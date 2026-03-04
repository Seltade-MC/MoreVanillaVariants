package seltademc.morevanillavariants;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import seltademc.morevanillavariants.item.ModItems;

public class MoreVanillaVariants implements ModInitializer {
    public static final String MOD_ID = "morevanillavariants";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}