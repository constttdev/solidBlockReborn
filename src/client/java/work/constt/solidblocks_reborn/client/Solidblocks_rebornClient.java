package work.constt.solidblocks_reborn.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import work.constt.solidblocks_reborn.registries.blockRegistry;

public class Solidblocks_rebornClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xFFC0CB, blockRegistry.SOLID_PINK);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x800080, blockRegistry.SOLID_PURPLE);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xFF007F, blockRegistry.SOLID_ROSE);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x0000FF, blockRegistry.SOLID_BLUE);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x00FFFF, blockRegistry.SOLID_AQUA);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x008000, blockRegistry.SOLID_GREEN);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x00FF00, blockRegistry.SOLID_LIME);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x808080, blockRegistry.SOLID_GREY);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x000000, blockRegistry.SOLID_BLACK);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xFFFFFF, blockRegistry.SOLID_WHITE);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xFFFF00, blockRegistry.SOLID_YELLOW);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xA52A2A, blockRegistry.SOLID_BROWN);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xFFA500, blockRegistry.SOLID_ORANGE);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x00FFFF, blockRegistry.SOLID_CYAN);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xFFC0CB, blockRegistry.SOLID_PINK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x800080, blockRegistry.SOLID_PURPLE);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xFF007F, blockRegistry.SOLID_ROSE);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x0000FF, blockRegistry.SOLID_BLUE);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x00FFFF, blockRegistry.SOLID_AQUA);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x008000, blockRegistry.SOLID_GREEN);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x00FF00, blockRegistry.SOLID_LIME);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x808080, blockRegistry.SOLID_GREY);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x000000, blockRegistry.SOLID_BLACK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xFFFFFF, blockRegistry.SOLID_WHITE);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xFFFF00, blockRegistry.SOLID_YELLOW);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xA52A2A, blockRegistry.SOLID_BROWN);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xFFA500, blockRegistry.SOLID_ORANGE);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x00FFFF, blockRegistry.SOLID_CYAN);

    }
}