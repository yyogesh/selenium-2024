package withThreadLocal;

import org.testng.annotations.Test;

public class TestCase2 extends Driver {
    @Test
    public void testMethod() {
        System.out.println("<- TestCase2 -> Executed by Thread : " + Thread.currentThread().getId()
                + " on driver reference : " + getDriver());

        getDriver().get("https://www.facebook.com/");

        System.out.println("TestCase2 Title printed by Thread : " + Thread.currentThread().getId() + " <- " + getDriver().getTitle()
                + " -> on driver reference : " + getDriver());
    }
}

