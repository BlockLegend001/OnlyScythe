package com.blocklegend001.onlyscythe.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ScytheConfig {
    private static final File CONFIG_FILE = new File("config/onlyscythe-common.toml");

    public static int WoodenRadius = 1;
    public static int StoneRadius = 1;
    public static int IronRadius = 2;
    public static int GoldRadius = 2;
    public static int DiamondRadius = 3;
    public static int NetheriteRadius = 4;

    public static void loadConfig() {
        if (!CONFIG_FILE.exists()) {
            saveConfig();
        } else {
            try (FileReader reader = new FileReader(CONFIG_FILE)) {
                JsonObject config = JsonParser.parseReader(reader).getAsJsonObject();

                WoodenRadius = config.get("WoodenRadius").getAsInt();
                StoneRadius = config.get("StoneRadius").getAsInt();
                IronRadius = config.get("IronRadius").getAsInt();
                GoldRadius = config.get("GoldRadius").getAsInt();
                DiamondRadius = config.get("DiamondRadius").getAsInt();
                NetheriteRadius = config.get("NetheriteRadius").getAsInt();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void saveConfig() {
        JsonObject config = new JsonObject();

        config.addProperty("WoodenRadius", WoodenRadius);
        config.addProperty("StoneRadius", StoneRadius);
        config.addProperty("IronRadius", IronRadius);
        config.addProperty("GoldRadius", GoldRadius);
        config.addProperty("DiamondRadius", DiamondRadius);
        config.addProperty("NetheriteRadius", NetheriteRadius);

        try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            writer.write(gson.toJson(config));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}