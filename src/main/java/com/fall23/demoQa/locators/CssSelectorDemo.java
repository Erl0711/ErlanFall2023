package com.fall23.demoQa.locators;

import com.fall23.demoQa.locators.basicLocators.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CssSelectorDemo extends BaseTest {

    @Test
    void demo123(){

        driver.findElement(By.cssSelector("#userName")).sendKeys("John Done");
    }
}
