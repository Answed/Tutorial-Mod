package de.answed.tutorialmod.item.custom;

import de.answed.tutorialmod.util.ModTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;

public class PaxelItem extends DiggerItem implements Vanishable {
    public PaxelItem(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pPropteries){
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, ModTags.Blocks.PAXEL_MINABLE, pPropteries);
    }
}
