package io.igorcossta;

import io.igorcossta.block.ModBlock;
import io.igorcossta.item.ModItemGroup;
import io.igorcossta.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
    public static final String MOD_ID = "firstmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroup();
        ModBlock.registerModBlock();
        ModItems.registerModItem();
    }
}