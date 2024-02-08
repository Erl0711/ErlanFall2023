package com.fall23.demoQa.locators.mouseInteractions;

import com.fall23.demoQa.locators.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.demoQa.locators.WebDriverManager.openTheSite;
import static org.testng.Assert.assertEquals;


public class AdvancedMouseInteractions extends BaseTest {


    @Test
    void doubleClickTest() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickBtn).perform();
        String actualDoubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();
        assertEquals(actualDoubleClickMessage, "You have done a double click");
        Thread.sleep(5000);
    }

    @Test
    void rightClickTest() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).perform();
        String actualContextClickMessage = driver.findElement(By.id("rightClickMessage")).getText();
        assertEquals(actualContextClickMessage,"You have done a right click");
        Thread.sleep(5000);
    }

    @Test
    void dynamicClickTest() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clickBtn).perform();
        String actualDynamicClickMessage = driver.findElement(By.id("dynamicClickMessage")).getText();
        assertEquals(actualDynamicClickMessage,"You have done a dynamic click");
        Thread.sleep(5000);
    }
}