package com.example.test;

import com.example.pages.HomePage;
import org.testng.annotations.Test;

public class HomeTest extends  BaseTest{
    @Test
    public void logout() {
        HomePage homePage = new HomePage();
        homePage.logoutFromApplication();
    }
}
