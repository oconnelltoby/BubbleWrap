package io.github.oconnelltoby.bubble_wrap.item;

import io.github.oconnelltoby.bubble_wrap.init.BubbleWrapItemGroups.BubbleWrapItemGroup;
import net.minecraft.item.Item;

public class BubbleWrapItem extends Item {
    public BubbleWrapItem(Properties properties) {
        super(properties);
    }

    public static Properties defaultProperties = new Properties().group(BubbleWrapItemGroup.BUBBLE_WRAP_ITEM_GROUP);

    public BubbleWrapItem() {
        super(defaultProperties);
    }
}
