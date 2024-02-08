package com.fall23.demoQa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.fall23.demoQa.locators.WebDriverManager.driver;

public class HomeWorkbyTest {


    public static WebElement  findElementById (String ID){
        return  driver.findElement(By.id(ID));
    }

    public static WebElement  partialLinkText (String ID){
        return  driver.findElement(By.id(ID));
    }
}
