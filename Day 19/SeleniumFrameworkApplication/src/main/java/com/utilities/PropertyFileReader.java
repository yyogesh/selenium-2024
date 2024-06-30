package com.utilities;

import com.report.ExtentFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
    public static Properties loadFile(String filePath) {
        FileReader reader = null;
        try {
            reader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            ExtentFactory.failTest("Exception occurred while reading test data file");
        }
        Properties prop = new Properties();

        try {
            prop.load(reader);
        } catch (IOException e) {
            ExtentFactory.failTest("Exception occurred while reading test data file");
        }

        return prop;
    }
}
