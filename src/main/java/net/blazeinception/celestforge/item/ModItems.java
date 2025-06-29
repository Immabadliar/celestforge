package net.blazeinception.celestforge.item;

import net.blazeinception.celestforge.Celestforge;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Celestforge.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Celestforge.LOGGER.info("Registering Mod Items for " + Celestforge.MOD_ID);
    }
}
