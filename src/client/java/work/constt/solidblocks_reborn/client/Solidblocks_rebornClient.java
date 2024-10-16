package work.constt.solidblocks_reborn.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import work.constt.solidblocks_reborn.registries.blockRegistry;

public class Solidblocks_rebornClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xFF69B4, blockRegistry.SOLID_PINK);  // Bright Pink
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x9B30FF, blockRegistry.SOLID_PURPLE); // Brighter Purple
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xFF1493, blockRegistry.SOLID_ROSE);   // Deep Rose
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x1E90FF, blockRegistry.SOLID_BLUE);   // Dodger Blue
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x00FFFF, blockRegistry.SOLID_AQUA);   // Aqua Cyan
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x00FF00, blockRegistry.SOLID_GREEN);  // Bright Green
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x32CD32, blockRegistry.SOLID_LIME);   // Lime Green
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xA9A9A9, blockRegistry.SOLID_GRAY);   // Bright Grey
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x1C1C1C, blockRegistry.SOLID_BLACK);  // Dark Black
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xFFFFFF, blockRegistry.SOLID_WHITE);  // Pure White
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xFFFF33, blockRegistry.SOLID_YELLOW); // Bright Yellow
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xD2691E, blockRegistry.SOLID_BROWN);  // Chocolate Brown
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xFF8C00, blockRegistry.SOLID_ORANGE); // Dark Orange
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x40E0D0, blockRegistry.SOLID_TEAL);   // Bright Teal
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xFF0000, blockRegistry.SOLID_RED);   // Red

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xFF69B4, blockRegistry.SOLID_PINK);  // Bright Pink
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x9B30FF, blockRegistry.SOLID_PURPLE); // Brighter Purple
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xFF1493, blockRegistry.SOLID_ROSE);   // Deep Rose
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x1E90FF, blockRegistry.SOLID_BLUE);   // Dodger Blue
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x00FFFF, blockRegistry.SOLID_AQUA);   // Aqua Cyan
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x00FF00, blockRegistry.SOLID_GREEN);  // Bright Green
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x32CD32, blockRegistry.SOLID_LIME);   // Lime Green
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xA9A9A9, blockRegistry.SOLID_GRAY);   // Bright Grey
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x1C1C1C, blockRegistry.SOLID_BLACK);  // Dark Black
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xFFFFFF, blockRegistry.SOLID_WHITE);  // Pure White
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xFFFF33, blockRegistry.SOLID_YELLOW); // Bright Yellow
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xD2691E, blockRegistry.SOLID_BROWN);  // Chocolate Brown
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xFF8C00, blockRegistry.SOLID_ORANGE); // Dark Orange
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x40E0D0, blockRegistry.SOLID_TEAL);   // Bright Teal
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xFF0000, blockRegistry.SOLID_RED);   // Red



    }
}
