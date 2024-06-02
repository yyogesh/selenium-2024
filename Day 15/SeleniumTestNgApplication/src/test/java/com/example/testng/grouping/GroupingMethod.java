package com.example.testng.grouping;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupingMethod {

    @BeforeGroups(groups = {"A", "B"})
    public void beforeGroups() {
        System.out.println("This is before group");
    }

    @AfterGroups(groups = "A")
    public void afterGroups() {
        System.out.println("This is after group");
    }

    @Test(groups = "B")
    public void login(){
        System.out.println("Amazon Login function");
    }

    @Test(groups = "B")
    public void search(){
        System.out.println("Amazon search function");
    }

    @Test(groups = "A")
    public void addCart(){
        System.out.println("Amazon addCart function");
    }

    @Test(groups = "A")
    public void payment(){
        System.out.println("Amazon payment function");
    }

    @Test(groups = "B")
    public void logout(){
        System.out.println("Amazon logout function");
    }
}
