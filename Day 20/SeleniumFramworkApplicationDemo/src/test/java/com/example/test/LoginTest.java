package com.example.test;

import com.example.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void login() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToApplication("Admin", "admin123");
    }
}
