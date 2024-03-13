package net.fro2k.temumod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fro2k.temumod.TemuMod;
import net.fro2k.temumod.item.custom.CrateDetectorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEMUCOUPON = registerItem("temucoupon", new Item(new FabricItemSettings()));
    public static final Item SWATCH = registerItem("swatch", new Item(new FabricItemSettings()));
    public static final Item PHONE = registerItem("phone", new Item(new FabricItemSettings()));
    public static final Item AIRBUDS = registerItem("airbuds", new Item(new FabricItemSettings()));
    public static final Item DASHCAM = registerItem("dashcam", new Item(new FabricItemSettings()));
    public static final Item GUN = registerItem("gun", new Item(new FabricItemSettings()));
    public static final Item FLASHLIGHT = registerItem("flashlight", new Item(new FabricItemSettings()));
    public static final Item BLAUX = registerItem("blaux", new Item(new FabricItemSettings()));
    public static final Item AIART = registerItem("aiart", new Item(new FabricItemSettings()));
    public static final Item PLUSH = registerItem("plush", new Item(new FabricItemSettings()));

    public static final Item CRATEDETECTOR = registerItem("cratedetector", new CrateDetectorItem(new FabricItemSettings().maxDamage(128)));

    public static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(TEMUCOUPON);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TemuMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TemuMod.LOGGER.info("Registering mod items for " + TemuMod.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
