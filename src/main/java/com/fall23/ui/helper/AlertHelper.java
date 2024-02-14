package com.fall23.ui.helper;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    private WebDriver driver ;
    // вызывает Alert - спец интерфейс для управления алертами
    //switchTo -переключись
    public Alert getAlert(){
        return Driver.getDriver().switchTo().alert();
    }

    //Принимает Alert
    public void acceptAlert(){

        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        if(!isAlertPresent()){
            // остановись
            return;
        }
        // accept - принимает
        getAlert().accept();
    }

    //Отклоняем Alert
    public void dismissAlert(){
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        if(!isAlertPresent()){
            // остановись
            return;
        }
        // dismiss - отклоняет
        getAlert().dismiss();
    }

    //
    public  void sendKeysAlert(String txt){
        if(!isAlertPresent()){
            // остановись
            return;
        }
        getAlert().sendKeys(txt);
        acceptAlert();;
    }

    //Проверяем есть ли алерт
    public boolean isAlertPresent(){
        try {
            Driver.getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException e){
            //напечатай ошибку в консоль
            e.printStackTrace();
            return false;
        }
    }
}
