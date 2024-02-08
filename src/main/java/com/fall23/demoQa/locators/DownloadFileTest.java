package com.fall23.demoQa.locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DownloadFileTest extends BaseTest {
    @Test
    void downloadTest() throws InterruptedException {
        WebDriverManager.openTheSite("https://demoqa.com/upload-download");
        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2023-09-20 at 10.06.07.jpeg");
        Thread.sleep(500);
    }
}
