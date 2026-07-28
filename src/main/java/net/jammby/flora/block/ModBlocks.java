package net.jammby.flora.block;

import net.jammby.flora.Flora;
import net.jammby.flora.item.ModItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Flora.MOD_ID);

    public static final DeferredBlock<FlowerBlock> GILDED_TULIP = registerBlock(
            "gilded_tulip",
            () -> new FlowerBlock(
                    MobEffects.DAMAGE_RESISTANCE,
                    5,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
            )
    );

    public static final DeferredBlock<FlowerBlock> MOON_BLOSSOM = registerBlock(
            "moon_blossom",
            () -> new FlowerBlock(
                    MobEffects.DARKNESS,
                    5,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
            )
    );

    public static final DeferredBlock<FlowerBlock> TULIP_BUSHEL = registerBlock(
            "tulip_bushel",
            () -> new FlowerBlock(
                    MobEffects.REGENERATION,
                    5,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
            )
    );

    public static final DeferredBlock<FlowerBlock> ALOE_VERA = registerBlock(
            "aloe_vera",
            () -> new FlowerBlock(
                    MobEffects.HEALTH_BOOST,
                    5,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.WET_GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
            )
    );

    public static final DeferredBlock<FlowerBlock> VILE_BLOOM = registerBlock(
            "vile_bloom",
            () -> new FlowerBlock(
                    MobEffects.POISON,
                    5,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
            )
    );

    public static final DeferredBlock<FlowerBlock> SMALL_CACTUS = registerBlock(
            "small_cactus",
            () -> new FlowerBlock(
                    MobEffects.HARM,
                    5,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.WET_GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
            )
    );

    public static final DeferredBlock<FlowerBlock> GLOOM_BELL = registerBlock(
            "gloom_bell",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
            )
    );

    public static final DeferredBlock<FlowerBlock> LAVENDER = registerBlock(
            "lavender",
            () -> new FlowerBlock(
                    MobEffects.LUCK,
                    5,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
            )
    );
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
    ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) { BLOCKS.register(eventBus); }
}




