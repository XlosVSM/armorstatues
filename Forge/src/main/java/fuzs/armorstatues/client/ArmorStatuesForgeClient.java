package fuzs.armorstatues.client;

import fuzs.armorstatues.api.ArmorStatuesApi;
import fuzs.armorstatues.api.client.ArmorStatuesApiClient;
import fuzs.armorstatues.client.handler.ArmorStandTooltipHandler;
import fuzs.puzzleslib.client.core.ClientCoreServices;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;

@Mod.EventBusSubscriber(modid = ArmorStatuesApi.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArmorStatuesForgeClient {

    @SubscribeEvent
    public static void onConstructMod(final FMLConstructModEvent evt) {
        ClientCoreServices.FACTORIES.clientModConstructor(ArmorStatuesApi.MOD_ID).accept(new ArmorStatuesApiClient());
        registerHandlers();
    }

    private static void registerHandlers() {
        MinecraftForge.EVENT_BUS.addListener((final ItemTooltipEvent evt) -> {
            ArmorStandTooltipHandler.onItemTooltip(evt.getItemStack(), evt.getFlags(), evt.getToolTip());
        });
    }
}
