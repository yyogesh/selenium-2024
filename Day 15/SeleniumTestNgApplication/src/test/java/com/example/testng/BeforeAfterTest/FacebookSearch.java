package com.example.testng.BeforeAfterTest;

import org.testng.annotations.Test;

public class FacebookSearch {
    @Test
    public void search() {
        System.out.println("FacebookSearch :: search function");
    }

    @Test
    public void searchPost() {
        System.out.println("FacebookSearch :: searchPost function");
    }
}
