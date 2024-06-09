package com.example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties properties;

    static {
        String configuration= "config.properties";

        try {
            FileInputStream fileInputStream = new FileInputStream(configuration);
            properties = new Properties();
            properties.load(fileInputStream);
        }
        catch (IOException exception) {
            System.out.println("properties file could not read");
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
