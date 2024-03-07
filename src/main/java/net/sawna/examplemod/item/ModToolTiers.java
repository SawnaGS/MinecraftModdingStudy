package net.sawna.examplemod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.sawna.examplemod.TestMod;
import net.sawna.examplemod.util.ModTags;
import net.minecraft.world.item.Tiers;
import java.util.List;

public class ModToolTiers {
    public static final Tier EMERALD = new ForgeTier(3, 999, 1f, 1f, 15,
                    BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.EMERALD));

    public static void register() {
        TierSortingRegistry.registerTier(
            EMERALD, new ResourceLocation(TestMod.MOD_ID, "emerald"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
    }
}
