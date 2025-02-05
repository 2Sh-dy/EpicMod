package net.retrosky.davidsmod.item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.retrosky.davidsmod.DavidsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DavidsMod.MOD_ID);


    public static final RegistryObject<Item> METANITE = ITEMS.register("metanite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_METANITE = ITEMS.register("raw_metanite",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
