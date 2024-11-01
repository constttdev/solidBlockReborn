package work.constt.solidblocks_reborn.registries;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import work.constt.solidblocks_reborn.Solidblocks_reborn;
import work.constt.solidblocks_reborn.item.solidCore;
import work.constt.solidblocks_reborn.item.solidHandle;
import work.constt.solidblocks_reborn.item.solidifier;

public class itemRegistry {

    public static final Item SOLIDIFIER = register(
            new solidifier(new Item.Settings()),
            "solidifier"
    );

    public static final Item SOLID_CORE = register(
            new solidCore(new Item.Settings()),
            "solid_core"
    );

    public static final Item SOLID_HANDLE = register(
            new solidHandle(new Item.Settings()),
            "solid_handle"
    );



    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(Solidblocks_reborn.MOD_ID, id);
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    public static final RegistryKey<ItemGroup> SB_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Solidblocks_reborn.MOD_ID, "itemGroup"));
    public static final ItemGroup SB_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.WHITE_CONCRETE))
            .displayName(Text.translatable("itemGroup.solidblocks_reborn"))
            .build();


    public static void initialize() {}
}
