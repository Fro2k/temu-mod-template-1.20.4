package net.fro2k.temumod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fro2k.temumod.TemuMod;
import net.fro2k.temumod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TEMU_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TemuMod.MOD_ID, "temucoupon"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.temugroup"))
                .icon(() -> new ItemStack(ModItems.TEMUCOUPON)).entries((displayContext, entries) -> {

                    // MOD ITEM ADDITIONS HERE
                    entries.add(ModItems.TEMUCOUPON);

                    // MOD BLOCK ADDITIONS HERE
                    entries.add(ModBlocks.DROPSHIPPING_CRATE);


                }).build());
    public static void registerItemGroups() {
        TemuMod.LOGGER.info("Registering item groups for " + TemuMod.MOD_ID);
    }
}
