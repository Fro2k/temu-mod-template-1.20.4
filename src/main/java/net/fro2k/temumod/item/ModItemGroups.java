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
                    entries.add(ModItems.CRATEDETECTOR);
                    entries.add(ModItems.SWATCH);
                    entries.add(ModItems.PHONE);
                    entries.add(ModItems.AIRBUDS);
                    entries.add(ModItems.DASHCAM);
                    entries.add(ModItems.GUN);
                    entries.add(ModItems.FLASHLIGHT);
                    entries.add(ModItems.BLAUX);
                    entries.add(ModItems.AIART);
                    entries.add(ModItems.PLUSH);

                    // MOD BLOCK ADDITIONS HERE
                    entries.add(ModBlocks.DROPSHIPPING_CRATE);
                    entries.add(ModBlocks.TEMU_SIGN_BLOCK);
                    entries.add(ModBlocks.T_SIGN_BLOCK);
                    entries.add(ModBlocks.E_SIGN_BLOCK);
                    entries.add(ModBlocks.M_SIGN_BLOCK);
                    entries.add(ModBlocks.U_SIGN_BLOCK);
                    entries.add(ModBlocks.DRESS_SIGN_BLOCK);
                    entries.add(ModBlocks.TOY_SIGN_BLOCK);
                    entries.add(ModBlocks.HEEL_SIGN_BLOCK);
                    entries.add(ModBlocks.BAG_SIGN_BLOCK);


                }).build());
    public static void registerItemGroups() {
        TemuMod.LOGGER.info("Registering item groups for " + TemuMod.MOD_ID);
    }
}
