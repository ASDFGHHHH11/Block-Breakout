package com.lyx2333.blockbreakout;

import com.lyx2333.blockbreakout.item.ModCreativeModTabs;
import com.lyx2333.blockbreakout.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(blockbreakout.MOD_ID)
public class blockbreakout
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "blockbreakout";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public blockbreakout() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);


    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.T7);
            event.accept(ModItems.DK5);
            event.accept(ModItems.DK6);
            event.accept(ModItems.DK7);
            event.accept(ModItems.SH60);
            event.accept(ModItems.SH);
            event.accept(ModItems.BNT);
            event.accept(ModItems.SH65A);
            event.accept(ModItems.SH65B);
            event.accept(ModItems.SHU);
            event.accept(ModItems.RST);
            event.accept(ModItems.AN95);
            event.accept(ModItems.DK8);
        }
    }
}
