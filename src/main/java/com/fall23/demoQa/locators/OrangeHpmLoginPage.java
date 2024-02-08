package com.fall23.demoQa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHpmLoginPage {

    @Test(description = "Login with valid username and valid password")

    void loginWithValidUsernameandValidPasswordTest(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String actualLoginText = driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText ="Login";
        Assert.assertEquals(actualLoginText,expectedLoginText);

        String username = "Admin";
        String password = "admin123";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualDashboardText = driver.findElement(By.tagName("h6")).getText();
        String exDashboardText = "Dashboard";
        Assert.assertEquals(actualDashboardText,exDashboardText);

    }

//    @Test(description = "Login with invalid username and valid password")
//    void loginWithInvalidUsernameandValidPasswordTest() {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//
//
//    }
}
