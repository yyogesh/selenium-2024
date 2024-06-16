package withoutThread;

import org.testng.annotations.Test;

public class TestCase1 extends Driver {
    @Test
    public void testMethod() {
        System.out.println("<- TestCase1 -> Executed by Thread : " + Thread.currentThread().getId()
                + " on driver reference : " + driver);

        driver.get("https://www.google.com/");

        System.out.println("TestCase1 Title printed by Thread : " + Thread.currentThread().getId() + " <- " + driver.getTitle()
                + " -> on driver reference : " + driver);
    }
}
