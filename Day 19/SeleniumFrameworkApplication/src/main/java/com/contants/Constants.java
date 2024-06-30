package com.contants;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Constants {
    public final static String projectDirectory = System.getProperty("user.dir");

    public final static String RESOURCE_FOLDER_PATH = projectDirectory + "\\src\\test\\resources";
    public final static String CONFIG_FILEPATH = RESOURCE_FOLDER_PATH + "\\config.properties";
    public static String DATE_TIME_STAMP = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());

    public static String ENVIROMENT;
    // EXTENT CONSTANT
    public static final String EXTENT_REPORT_FILEPATH = projectDirectory + "\\Reports\\";
    public static String EXTENT_REPORT_NAME = "ABC Migration test report";
    public static String EXTENT_REPORT_DOCUMENT_TITLE = "ABC Migration execution report";

    public static final String MOCK_QA_DATA_FILE = RESOURCE_FOLDER_PATH + "\\mockData\\qa.properties";
    public static final String MOCK_PROD_DATA_FILE = RESOURCE_FOLDER_PATH + "\\mockData\\prod.properties";

}
