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
import work.constt.solidblocks_reborn.block.solidRed;

public class blockRegistry {

    public static final Block SOLID_RED = register(
            new solidRed(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "solid_red",
            false
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
