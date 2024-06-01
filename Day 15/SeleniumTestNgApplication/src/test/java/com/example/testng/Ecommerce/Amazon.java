package com.example.testng.Ecommerce;

import org.testng.annotations.Test;

public class Amazon {
    @Test(priority = 1)
    public void login(){
        System.out.println("Amazon Login function");
    }

    @Test(priority = 2)
    public void search(){
        System.out.println("Amazon search function");
    }

    @Test(priority = 3)
    public void addCart(){
        System.out.println("Amazon addCart function");
    }

    @Test(priority = 4)
    public void payment(){
        System.out.println("Amazon payment function");
    }

    @Test(priority = 5)
    public void logout(){
        System.out.println("Amazon logout function");
    }
}
