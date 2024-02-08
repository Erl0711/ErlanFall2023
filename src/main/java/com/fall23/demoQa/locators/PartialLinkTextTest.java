package com.fall23.demoQa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.demoQa.locators.WebDriverManager.openTheSite;
public class PartialLinkTextTest extends BaseTest {

    @Test
    void demo() throws InterruptedException {

        openTheSite("https://demoqa.com/links");
        WebElement home = driver.findElement(By.partialLinkText("Unauth"));
        home.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
        Thread.sleep(5000);
    }
}
