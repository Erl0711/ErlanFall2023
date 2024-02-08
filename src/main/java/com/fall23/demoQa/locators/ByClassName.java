package com.fall23.demoQa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.demoQa.locators.WebDriverManager.openTheSite;
import static com.fall23.demoQa.locators.WebElementManager.findElementById;

public class ByClassName extends BaseTest {

    @Test
    void byClassNameTest() throws InterruptedException {
        openTheSite("https://demoqa.com/text-box");

     // Проверка кастомного метода findElementById (после вызова,импортируем)
        WebElement usernameInput = findElementById("userName");
        WebElement emailInput =findElementById("userEmail");
        WebElement currentAddressInput = findElementById("currentAddress");
        WebElement permanentAddressInput = findElementById("permanentAddress");
        WebElement submitBtn = driver.findElement(By.className("btn-primary")); // raznica

        usernameInput.sendKeys("John");
        emailInput.sendKeys("john@gmail.com");
        currentAddressInput.sendKeys("WallStreet 555");
        permanentAddressInput.sendKeys("Sovet 123");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
        submitBtn.click();
        Thread.sleep(5000);
    }
}