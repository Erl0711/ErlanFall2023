package com.fall23.demoQa.locators.basicLocators;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    protected WebDriver driver;


    @BeforeClass
    public void setUp(){
        driver = WebDriverManage.initChromeDriver();
    }

    @AfterClass
    public void tearDown(){
        WebDriverManage.closeDriver();
    }
}
