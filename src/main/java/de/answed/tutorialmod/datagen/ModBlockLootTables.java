package de.answed.tutorialmod.datagen;

import de.answed.tutorialmod.block.ModBlocks;
import de.answed.tutorialmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;


import java.util.Iterator;
import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables(){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }
    @Override
    protected void generate() {
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        dropSelf(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

        add(ModBlocks.SAPPHIRE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
