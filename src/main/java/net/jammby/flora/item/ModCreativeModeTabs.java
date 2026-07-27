package net.jammby.flora.item;

import net.jammby.flora.Flora;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Flora.MOD_ID);

            public static final Supplier<CreativeModeTab> FLORA_TAB = CREATIVE_MODE_TAB.register("flora_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HONEY_SUCKLE.get()))
                            .title(Component.translatable("creativetab.flora.flora_tab"))
                            .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModItems.HONEY_SUCKLE );




                            }).build());


            public static void register(IEventBus eventBus) { CREATIVE_MODE_TAB.register(eventBus);}
}

