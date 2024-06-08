package suitlistener;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ISuitListerExample2 {
    @BeforeSuite
    public void bsuite()
    {
        System.out.println("BeforeSuite ISuitListerExample2 method started for the first IsuiteListener example 2 class");
    }

    @Test
    public void test()
    {
        System.out.println("Test method ISuitListerExample2 started for the first IsuiteListener example 2 class");
    }

    @AfterSuite
    public void asuite()
    {
        System.out.println("AfterSuite ISuitListerExample2 method started for the first IsuiteListener example 2 class");
    }
}
