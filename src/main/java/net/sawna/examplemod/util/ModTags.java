package net.sawna.examplemod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sawna.examplemod.TestMod;

public class ModTags {
//    public static final TagKey<Block> NEEDS_EMERALD_TOOL = tag("needs_emerald")

    public static class Blocks {
        public static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(TestMod.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(TestMod.MOD_ID, name));
        }
    }
}
