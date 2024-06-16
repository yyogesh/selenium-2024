package withoutThread;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Driver {
    public static WebDriver driver;

    @BeforeClass
    public void setDriver()
    {
        driver = new ChromeDriver();
        System.out.println(
                "BeforeClass:: setup by Thread : " + Thread.currentThread().getId() + " and Driver reference is : " + driver);
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("AfterClass:: Browser closed by Thread : " + Thread.currentThread().getId()
                + " and Closing driver reference is :" + driver);
        driver.quit();
    }
}
