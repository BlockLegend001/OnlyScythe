package com.blocklegend001.onlyscythe;

import com.blocklegend001.onlyscythe.platform.Services;

public class CommonClass {

    public static void init() {
        if (Services.PLATFORM.isModLoaded("onlyscythe")) {
            Constants.LOG.info("Only Scythe Loaded!");
        }
    }
}
