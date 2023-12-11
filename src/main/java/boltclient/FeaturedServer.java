package boltclient;

import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.util.ResourceLocation;

public class FeaturedServer extends ServerData {

    public static final ResourceLocation STAR_ICON = new ResourceLocation("boltclient/star.png");

    public FeaturedServer(String name, String ip) {
        super(name, ip, false);
    }
}
