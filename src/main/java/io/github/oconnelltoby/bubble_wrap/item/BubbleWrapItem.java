package io.github.oconnelltoby.bubble_wrap.item;

import io.github.oconnelltoby.bubble_wrap.BubbleWrap;
import io.github.oconnelltoby.bubble_wrap.init.BubbleWrapItemGroups.BubbleWrapItemGroup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.world.World;

import java.util.Random;

public class BubbleWrapItem extends Item {
    public BubbleWrapItem(Properties properties) {
        super(properties);
    }

    public static Properties defaultProperties = new Properties().group(BubbleWrapItemGroup.BUBBLE_WRAP_ITEM_GROUP);

    public BubbleWrapItem() {
        super(defaultProperties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        ResourceLocation location = new ResourceLocation(BubbleWrap.MODID, "bubble_wrap_pop");
        SoundEvent popSoundEvent = new SoundEvent(location);
        SoundCategory soundCategory = SoundCategory.PLAYERS;

        Random random = new Random();

        float volume = 0.8f + 0.2f * random.nextFloat(); // 0.8 to 1.0 volume
        float pitch = 0.9f + 0.2f * random.nextFloat(); // 0.9 to 1.1 pitch

        worldIn.playSound(playerIn, playerIn.getPosition(), popSoundEvent, soundCategory, volume, pitch);

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
