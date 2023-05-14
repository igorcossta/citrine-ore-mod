package io.igorcossta.item;

import io.igorcossta.ExampleMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CITRINE = registerItem("citrine", new Item(new FabricItemSettings()));
    public static final Item RAW_CITRINE = registerItem("raw_citrine", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ExampleMod.MOD_ID, name), item);
    }

    public static void addItemToItemGroup() {
        addItemToGroup(ItemGroups.INGREDIENTS, CITRINE);
        addItemToGroup(ItemGroups.INGREDIENTS, RAW_CITRINE);

        addItemToGroup(ModItemGroup.CITRINE, CITRINE);
        addItemToGroup(ModItemGroup.CITRINE, RAW_CITRINE);
    }

    private static void addItemToGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItem() {
        ExampleMod.LOGGER.info("Registering Mod Items for " + ExampleMod.MOD_ID);
        addItemToItemGroup();
    }
}
