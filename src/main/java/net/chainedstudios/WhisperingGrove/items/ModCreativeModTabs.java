package net.chainedstudios.WhisperingGrove.items;

import net.chainedstudios.WhisperingGrove.WhisperingGrove;
import net.chainedstudios.WhisperingGrove.block.Modblocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WhisperingGrove.MODID);

    public static final RegistryObject<CreativeModeTab> GOLEMITE_TAB = CREATIVE_MODE_TABS.register("golemite-tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditem.GOLEMITE.get()))
                    .title(Component.translatable("creative.golemite_tab"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(Moditem.GOLEMITE.get());
                        output.accept(Modblocks.CHICKEN_BLOCK.get());
                    } )

                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

    }

}
