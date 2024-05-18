package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Html2Table {
    public static void main(String[] args) throws ParseException {
        WebDriver wd;
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("https://demo.guru99.com/test/table.html");
        //To locate table.
        WebElement mytable = wd.findElement(By.xpath("/html/body/table/tbody"));
        //To locate rows of table.
        List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
        int row_count = rows_table.size();

        for(int row = 0; row < row_count; row++) {
            List<WebElement> columns = rows_table.get(row).findElements(By.tagName("td"));
            int columns_count = columns.size();
            System.out.println("Number of cells In Row " + row + " are " + columns_count);
            for (int column = 0; column < columns_count; column++) {
                // To retrieve text from that specific cell.
                String celtext = columns.get(column).getText();
                System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
            }
            System.out.println("-------------------------------------------------- ");
        }
    }
}
