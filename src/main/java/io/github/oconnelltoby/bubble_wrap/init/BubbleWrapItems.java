package io.github.oconnelltoby.bubble_wrap.init;

import io.github.oconnelltoby.bubble_wrap.BubbleWrap;
import io.github.oconnelltoby.bubble_wrap.item.BubbleWrapItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BubbleWrapItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BubbleWrap.MODID);

    public static final RegistryObject<Item> BUBBLE_WRAP = ITEMS.register("bubble_wrap_item", BubbleWrapItem::new);

}
