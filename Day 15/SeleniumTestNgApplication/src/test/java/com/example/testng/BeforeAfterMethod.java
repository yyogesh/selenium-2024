package com.example.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
    @BeforeMethod
    public void login(){
        System.out.println("Login");
    }

    @AfterMethod
    public void logout() {
        System.out.println("Logout");
    }

    @Test
    public void addToCart() {
        System.out.println("AddToCart");
    }

    @Test
    public void payment() {
        System.out.println("payment");
    }
}
