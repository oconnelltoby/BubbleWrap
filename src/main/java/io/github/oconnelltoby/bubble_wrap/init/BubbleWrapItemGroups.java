package io.github.oconnelltoby.bubble_wrap.init;

import io.github.oconnelltoby.bubble_wrap.BubbleWrap;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class BubbleWrapItemGroups {
    public static class BubbleWrapItemGroup extends ItemGroup {

        public static final ItemGroup BUBBLE_WRAP_ITEM_GROUP = new BubbleWrapItemGroup(BubbleWrap.MODID, () -> new ItemStack(BubbleWrapItems.BUBBLE_WRAP.get()));

        private final Supplier<ItemStack> iconSupplier;

        public BubbleWrapItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }

    }
}
