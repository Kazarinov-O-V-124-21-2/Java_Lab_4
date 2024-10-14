package edu.dp.sau.Kazarinov.O.V.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    private Gson gson;

    public JsonManager() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void writeToJson(Object object, String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(object, writer);
        }
    }

    public <T> T readFromJson(String filePath, Class<T> clazz) throws IOException {
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, clazz);
        }
    }

    public void displayJsonFromFile(String filePath) throws IOException {
        try (FileReader reader = new FileReader(filePath)) {
            StringBuilder jsonContent = new StringBuilder();
            int ch;
            while ((ch = reader.read()) != -1) {
                jsonContent.append((char) ch);
            }
            System.out.println(jsonContent.toString());
        }
    }
}
