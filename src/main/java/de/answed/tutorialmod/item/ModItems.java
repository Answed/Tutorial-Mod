package de.answed.tutorialmod.item;

import de.answed.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    //This register will be used to save all the Items which are getting loaded by Forge when the client runs
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
