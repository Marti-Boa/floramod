package net.jammby.flora.item;

import net.jammby.flora.Flora;
import net.jammby.flora.block.ModBlocks;
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
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GILDED_TULIP.get()))
                            .title(Component.translatable("creativetab.flora.flora_tab"))
                            .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModBlocks.GILDED_TULIP.get());
                            output.accept(ModBlocks.MOON_BLOSSOM.get());
                            output.accept(ModBlocks.TULIP_BUSHEL.get());
                            output.accept(ModBlocks.ALOE_VERA.get());
                            output.accept(ModBlocks.VILE_BLOOM.get());
                            output.accept(ModBlocks.SMALL_CACTUS.get());
                            output.accept(ModBlocks.GLOOM_BELL.get());
                            output.accept(ModBlocks.LAVENDER.get());




                            }).build());


            public static void register(IEventBus eventBus) { CREATIVE_MODE_TAB.register(eventBus);}
}
//changed name as i didnt like it and it broke please help
//idk what is wrong
