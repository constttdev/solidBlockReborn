package work.constt.solidblocks_reborn.registries;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import work.constt.solidblocks_reborn.Solidblocks_reborn;
import work.constt.solidblocks_reborn.block.solidBlock;

public class blockRegistry {

    public static final Block SOLID_PINK = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_pink",
            true
    );

    public static final Block SOLID_PURPLE = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_purple",
            true
    );

    public static final Block SOLID_ROSE = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_rose",
            true
    );

    public static final Block SOLID_BLUE = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_blue",
            true
    );

    public static final Block SOLID_AQUA = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_aqua",
            true
    );

    public static final Block SOLID_GREEN = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_green",
            true
    );

    public static final Block SOLID_LIME = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_lime",
            true
    );

    public static final Block SOLID_GRAY = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_gray",
            true
    );

    public static final Block SOLID_BLACK = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_black",
            true
    );

    public static final Block SOLID_WHITE = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_white",
            true
    );

    public static final Block SOLID_YELLOW = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_yellow",
            true
    );

    public static final Block SOLID_BROWN = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_brown",
            true
    );

    public static final Block SOLID_ORANGE = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_orange",
            true
    );

    public static final Block SOLID_TEAL = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_teal",
            true
    );

    public static final Block SOLID_RED = register(
            new solidBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_red",
            true
    );


    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(Solidblocks_reborn.MOD_ID, name);
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialize() {}
}
