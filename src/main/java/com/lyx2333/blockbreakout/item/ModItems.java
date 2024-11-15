package com.lyx2333.blockbreakout.item;

import com.lyx2333.blockbreakout.blockbreakout;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, blockbreakout.MOD_ID);

    public static final RegistryObject<Item> T7 = ITEMS.register("t7",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DK5 = ITEMS.register("dk5",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DK6 = ITEMS.register("dk6",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DK7 = ITEMS.register("dk7",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SH60 = ITEMS.register("sh60",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SH = ITEMS.register("sh",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BNT = ITEMS.register("bnt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SH65A = ITEMS.register("sh65a",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SH65B = ITEMS.register("sh65b",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHU = ITEMS.register("shu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RST = ITEMS.register("rst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AN95 = ITEMS.register("an95",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DK8 = ITEMS.register("dk8",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
