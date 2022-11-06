package mreilly13.solstick.item;

import mreilly13.solstick.SOLStick;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SOLStick.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
