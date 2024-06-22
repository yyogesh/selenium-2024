package com.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.contants.Constants;
import com.properties.ConfigReader;

public class ExtentReportManager {

    public static ExtentReports setUpExtentReport() {
        String fileName = "ExecutionReport_" + Constants.DATE_TIME_STAMP + ".html";
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(fileName + Constants.EXTENT_REPORT_FILEPATH);
        sparkReporter.config().setReportName(Constants.EXTENT_REPORT_NAME);
        sparkReporter.config().setDocumentTitle(Constants.EXTENT_REPORT_DOCUMENT_TITLE);
        sparkReporter.config().setTimeStampFormat("dd/MM/yyyy HH:mm:ss");

        ExtentReports extentReports = new ExtentReports();
        extentReports.setSystemInfo("Application URL", ConfigReader.getInstance().getPropertyValue("url"));
        extentReports.setSystemInfo("Browser",  ConfigReader.getInstance().getPropertyValue("browser"));
        extentReports.setSystemInfo("Tester", ConfigReader.getInstance().getPropertyValue("testingTeam"));
        extentReports.setSystemInfo("Operating System", System.getProperty("os.name"));
        extentReports.setSystemInfo("Java version", System.getProperty("java.version"));

        return extentReports;
    }
}
