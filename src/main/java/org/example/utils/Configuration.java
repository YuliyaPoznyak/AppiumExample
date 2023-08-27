package org.example.utils;

import com.google.gson.Gson;
import org.example.models.Config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Configuration {
    private static Config config;
    public static Config getConfigData() {
        try {
            config = new Gson().fromJson(Files.readString(Path.of(System.getProperty("user.dir") + "/src/main/resources/config.json")), Config.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return config;
    }
}
