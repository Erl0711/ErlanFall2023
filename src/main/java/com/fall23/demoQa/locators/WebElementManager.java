package com.fall23.demoQa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.fall23.demoQa.locators.WebDriverManager.driver;


public class WebElementManager {

    //Кастомный метод для поиска элементов

    // При вызове метода указываем найденный id элемента  (word)

    public  static WebElement findElementById ( String ID) {
        return  driver.findElement(By.id(ID));
    }


    //Кастомный метод для частичного поиска элементов
    public  static WebElement PartialLinkText ( String Text) {
        return  driver.findElement(By.partialLinkText(Text));
    }

}
