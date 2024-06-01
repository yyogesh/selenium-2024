package com.example.testng.BeforeAfterTest;

import org.testng.annotations.Test;

public class FacebookLogin {
    @Test
    public void login() {
        System.out.println("Facebook :: Login function");
    }

    @Test
    public void createPost() {
        System.out.println("Facebook :: createPost function");
    }
}
