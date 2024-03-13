package net.fro2k.temumod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fro2k.temumod.TemuMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block DROPSHIPPING_CRATE = registerBlock("dropshipping_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHISELED_BOOKSHELF)));

    public static final Block TEMU_SIGN_BLOCK = registerBlock("temu_sign_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OCHRE_FROGLIGHT)));
    public static final Block T_SIGN_BLOCK = registerBlock("t_sign_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OCHRE_FROGLIGHT)));
    public static final Block E_SIGN_BLOCK = registerBlock("e_sign_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OCHRE_FROGLIGHT)));
    public static final Block M_SIGN_BLOCK = registerBlock("m_sign_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OCHRE_FROGLIGHT)));
    public static final Block U_SIGN_BLOCK = registerBlock("u_sign_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OCHRE_FROGLIGHT)));

    public static final Block DRESS_SIGN_BLOCK = registerBlock("dress_sign_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OCHRE_FROGLIGHT)));
    public static final Block TOY_SIGN_BLOCK = registerBlock("toy_sign_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OCHRE_FROGLIGHT)));
    public static final Block HEEL_SIGN_BLOCK = registerBlock("heel_sign_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OCHRE_FROGLIGHT)));
    public static final Block BAG_SIGN_BLOCK = registerBlock("bag_sign_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OCHRE_FROGLIGHT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TemuMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TemuMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        TemuMod.LOGGER.info("Registering ModBlocks for " + TemuMod.MOD_ID);
    }
}
