package com.properties;


import com.contants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private final Properties properties;

    static Logger logger = LogManager.getLogger(ConfigReader.class);

    private ConfigReader() {
        FileReader reader = null;
        try {
            reader = new FileReader(Constants.CONFIG_FILEPATH);
        } catch (FileNotFoundException e) {
            logger.error("No Config file found");
        }
        properties = new Properties();

        try {
            properties.load(reader);
        } catch (IOException ex) {
            logger.error("Config file load error");
        }

        Constants.ENVIROMENT = getPropertyValue("environment");
    }

    private static ConfigReader instance = new ConfigReader();

    public static ConfigReader getInstance() {
        return instance;
    }

    public String getPropertyValue(String key) {
        return properties.getProperty(key);
    }
}
