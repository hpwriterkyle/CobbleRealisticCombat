package top.vrilhyc.mods.cobblerealisticcombat;

import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public class CobbleRealisticCombat implements ModInitializer {
    public static Logger logger;

    @Override
    public void onInitialize() {
        logger = Logger.getLogger("CobbleRealisticCombat");
    }
}
