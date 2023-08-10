package de.answed.tutorialmod.datagen;

import de.answed.tutorialmod.TutorialMod;
import de.answed.tutorialmod.block.ModBlocks;
import de.answed.tutorialmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TutorialMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(), ModBlocks.SOUND_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES);
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get()).addTag(Tags.Blocks.ORES);
        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .addTag(Tags.Blocks.ORES);
    }
}
