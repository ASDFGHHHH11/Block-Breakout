package com.lyx2333.blockbreakout.item;

import com.lyx2333.blockbreakout.blockbreakout;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, blockbreakout.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MASK_TAB = CREATIVE_MODE_TABS.register("mask",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.T7.get()))
                    .title(Component.translatable("creativetab.mask_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.T7.get());
                        pOutput.accept(ModItems.DK5.get());
                        pOutput.accept(ModItems.DK6.get());
                        pOutput.accept(ModItems.DK7.get());
                        pOutput.accept(ModItems.SH60.get());
                        pOutput.accept(ModItems.SH.get());
                        pOutput.accept(ModItems.BNT.get());
                        pOutput.accept(ModItems.SH65A.get());
                        pOutput.accept(ModItems.SH65B.get());
                        pOutput.accept(ModItems.SHU.get());
                        pOutput.accept(ModItems.RST.get());
                        pOutput.accept(ModItems.AN95.get());
                        pOutput.accept(ModItems.DK8.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
