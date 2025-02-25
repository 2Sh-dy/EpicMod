package net.retrosky.davidsmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.retrosky.davidsmod.DavidsMod;
import net.retrosky.davidsmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DavidsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DAVIDS_MOD = CREATIVE_MODE_TABS.register("davids_mod",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.METANITE.get()))
                    .title(Component.translatable("creativetab.davidsmod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.METANITE.get());
                        pOutput.accept(ModItems.RAW_METANITE.get());

                        pOutput.accept(ModBlocks.METANITE_BLOCK.get());
                        pOutput.accept(ModBlocks.IMPLODING_METANITE_BLOCK.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
