package com.fall23.ui.drivers;

import com.fall23.ui.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {

    private Driver(){

    }

    private static WebDriver driver;

    //Метод возв-ет вебдрайвер
    public static WebDriver getDriver(){
        //ЕСли нет значения
        if (driver == null){
            //передаем значение браузера
            switch (ConfigReader.getValue("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxWebDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
                    //TODO add all drivers
                default:
                    throw new IllegalArgumentException("You provided wrong Driver name");
            }

        }
        return driver;
    }

public static void closeDriver(){
        try {
            if (driver!= null){
                driver.close();
                driver.quit();
                driver=null;
            }
        }catch (Exception e){
            System.out.println("Error while closing driver");
        }
}


}
