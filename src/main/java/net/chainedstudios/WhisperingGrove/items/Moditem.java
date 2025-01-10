package net.chainedstudios.WhisperingGrove.items;

import net.chainedstudios.WhisperingGrove.WhisperingGrove;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WhisperingGrove.MODID);

    public static final RegistryObject<Item> GOLEMITE = ITEMS.register("golemite",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);


    }
}
