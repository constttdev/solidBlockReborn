package work.constt.solidblocks_reborn;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import work.constt.solidblocks_reborn.registries.blockRegistry;
import work.constt.solidblocks_reborn.registries.itemRegistry;
import static work.constt.solidblocks_reborn.registries.itemRegistry.SB_GROUP;
import static work.constt.solidblocks_reborn.registries.itemRegistry.SB_GROUP_KEY;

public class Solidblocks_reborn implements ModInitializer {
    public static final String MOD_ID = "solidblocks_reborn";

    @Override
    public void onInitialize() {
        itemRegistry.initialize();
        blockRegistry.initialize();

        Registry.register(Registries.ITEM_GROUP, SB_GROUP_KEY, SB_GROUP);

        ItemGroupEvents.modifyEntriesEvent(SB_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(blockRegistry.SOLID_RED);
        });
    }
}
