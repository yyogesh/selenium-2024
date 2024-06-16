package withThreadLocal;

import org.testng.annotations.Test;

public class TestCase1 extends Driver {
    @Test
    public void testMethod() {
        System.out.println("<- TestCase1 -> Executed by Thread : " + Thread.currentThread().getId()
                + " on driver reference : " + getDriver());

        getDriver().get("https://www.google.com/");

        System.out.println("TestCase1 Title printed by Thread : " + Thread.currentThread().getId() + " <- " + getDriver().getTitle()
                + " -> on driver reference : " + getDriver());
    }
}
