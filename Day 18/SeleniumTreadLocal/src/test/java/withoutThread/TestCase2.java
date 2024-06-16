package withoutThread;

import org.testng.annotations.Test;

public class TestCase2 extends Driver {
    @Test
    public void testMethod() {
        System.out.println("<- TestCase2 -> Executed by Thread : " + Thread.currentThread().getId()
                + " on driver reference : " + driver);

        driver.get("https://www.facebook.com/");

        System.out.println("TestCase2 Title printed by Thread : " + Thread.currentThread().getId() + " <- " + driver.getTitle()
                + " -> on driver reference : " + driver);
    }
}
