package io.igorcossta.item;

import io.igorcossta.ExampleMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CITRINE;

    public static void registerItemGroup() {
        CITRINE = FabricItemGroup.builder(new Identifier(ExampleMod.MOD_ID, "citrine"))
                .displayName(Text.translatable("itemgroup.citrine"))
                .icon(() -> new ItemStack(ModItems.CITRINE))
                .build();

    }
}
