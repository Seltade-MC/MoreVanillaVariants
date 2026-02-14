package com.github.seltademc;

import com.github.seltademc.item.ModItemGroups;
import com.github.seltademc.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreVanillaVariants implements ModInitializer {
    public static final String MOD_ID = "more-vanilla-variants";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
    }
}