package com.fall23.demoQa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.demoQa.locators.WebDriverManager.openTheSite;

public class ByIDqa extends BaseTest {

    @Test
    void byIdTest(){
        openTheSite("https://demoqa.com/text-box");
        WebElement usernameInput = driver.findElement(By.id("userName"));
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        WebElement submitBtn = driver.findElement(By.id("submit"));

        usernameInput.sendKeys("John");
        emailInput.sendKeys("john@gmail.com");
        currentAddressInput.sendKeys("WallStreet 555");
        permanentAddressInput.sendKeys("Sovet123");
        JavascriptExecutor js = (JavascriptExecutor) driver; //Позволяет нажать на кнопку submit
        js.executeScript("window.scrollBy(0, 600)");
        submitBtn.click();

    }
}
