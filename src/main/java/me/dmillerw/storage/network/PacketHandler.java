package me.dmillerw.storage.network;

import me.dmillerw.storage.lib.ModInfo;
import me.dmillerw.storage.network.packet.PacketConfig;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

/**
 * @author dmillerw
 */
public class PacketHandler {

    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(ModInfo.ID);
    static {
        INSTANCE.registerMessage(PacketConfig.Handler.class, PacketConfig.class, -1, Side.SERVER);
    }
}