package net.jammby.flora.item;

import net.jammby.flora.Flora;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Flora.MOD_ID);

//public static final DeferredItem<Item> GILDED_TULIP = ITEMS.register("gilded_tulip",
//        () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
