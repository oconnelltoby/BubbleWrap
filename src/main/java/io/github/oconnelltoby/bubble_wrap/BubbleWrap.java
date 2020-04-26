package io.github.oconnelltoby.bubble_wrap;

import io.github.oconnelltoby.bubble_wrap.init.BubbleWrapItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BubbleWrap.MODID)
public final class BubbleWrap {
    public static final String MODID = "bubble_wrap";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public BubbleWrap() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BubbleWrapItems.ITEMS.register(modEventBus);
    }
}