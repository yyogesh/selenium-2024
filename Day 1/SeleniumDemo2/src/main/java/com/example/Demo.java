package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import com.example.employer.*;

public class Demo {
    public static void main(String[] arg) {

        Employer employer = new Employer();
        Department department = new Department();

//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://mvnrepository.com/");

//        boolean b1 = false;
//        char c1 = 'A';
//        byte B2 = 123;
//        short s1 =123;
//        int x = 23;
//        long y = 209999999L;
//
//        float f = 12.9f;
//        double d = 123.3;

        int x = 10;
        int y = 20;

        int result = x + y; //  +, -, /, *, %

        x++;
        x++;


        System.out.println(10 * 20);
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(x++);
        System.out.println(++x);

        System.out.println(x < y && x < 15);

        // && ||

        if(x < y && x < 15) {
            System.out.println("Great");
        } else {
            System.out.println("Bad");
        }

        String str = x > 20 ? "Greet" : "Bad";
        System.out.println("The value of string is ::" + str);

        //          true/false ?  true :  false
    }
}
