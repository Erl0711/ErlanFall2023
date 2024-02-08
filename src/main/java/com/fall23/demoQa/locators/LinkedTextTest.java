package com.fall23.demoQa.locators;

import org.testng.annotations.Test;

import static com.fall23.demoQa.locators.WebDriverManager.openTheSite;


public class LinkedTextTest extends BaseTest {
    @Test
    void test123() throws InterruptedException {
        openTheSite("https://demoqa.com/links");

//        WebElement home = WebElementManager.findElementById("home");

//        home.click();
//        Thread.sleep(5000);
    }
}