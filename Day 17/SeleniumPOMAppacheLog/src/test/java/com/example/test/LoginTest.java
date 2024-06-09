package com.example.test;

import com.example.pages.LoginPage;
import com.example.utility.ExcelUtility;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseTest {

    @Test
    public void login() throws IOException, InvalidFormatException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToApplication(ExcelUtility.getData(1, 0), ExcelUtility.getData(1, 1));
    }
}
