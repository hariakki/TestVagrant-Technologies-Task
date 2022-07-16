package com.testVagrant.utils;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;

public class JsonUtils {

    public static JsonObject getJsonObject() throws Exception {
        FileReader reader = new FileReader(System.getProperty("user.dir") + "//TestData//players.json");
        JsonObject jsonObject = new JsonParser().parse(reader).getAsJsonObject();
        return jsonObject;
    }

}
