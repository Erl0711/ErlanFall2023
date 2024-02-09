package uiTests.Alert;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.AlertHelper;
import com.fall23.ui.helper.FrameHelper;
import com.fall23.ui.pages.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CallAlertMethods {

   // В качестве филда указываем веб драйвер для использования его  во всем классе
    WebDriver driver;

    TextBoxPage textBoxPage;


    @BeforeClass
        // Для чего создаем этот метод?
        //  Используются для инициализации объектов, установки начальных условий или загрузки ресурсов, необходимых для работы тестов.
    void SetUpDriver() {
        //возвращает предварительно настроенный экземпляр WebDriver, чтобы избежать дублирования инициализации в каждом тесте.
        driver = Driver.getDriver();
        //создается объект `TextBoxPage`, предназначенный для взаимодействия с элементами страницы, содержащей текстовые поля.
        textBoxPage = new TextBoxPage();
    }

    @AfterClass
    void close(){
        driver.quit();
    }
    @Test
        //Тестим переход на другой фрейм
    void switchToFrameTest() {
        // Вызываем драйвер для открытия браузера
        WebDriver driver = Driver.getDriver();

        //Переходим на нужную страницу
        driver.get("https://demoqa.com/frames");

        //Для чего создаем этот объект? Для использования методов фрейма
        FrameHelper framehelper = new FrameHelper(driver);
        WebElement frameID = driver.findElement(By.id("frame2"));

        //Для перехода на другой фрейм
        driver.switchTo().frame("frame2");

        //Просим вывести атрибут sampleHeading и распечатать текст
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
    }

    @Test
        //Тестим подтверждение алерта
    void acceptAlertTest() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();
        AlertHelper alertHelper = new AlertHelper();
        alertHelper.acceptAlert();
        Thread.sleep(50000);
    }

    @Test
        //Тестим отклонение алерта
    void dismissAlertTest() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();
        AlertHelper alertHelper = new AlertHelper();
        alertHelper.dismissAlert();
        Thread.sleep(5000);
    }

    @Test
        //Тестим передачу текста в алерте
    void sendKeysAlertTest() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement promtButton = driver.findElement(By.id("promtButton"));
        promtButton.click();
        AlertHelper alertHelper = new AlertHelper();
        alertHelper.sendKeysAlert("sendKeysAlrtTest");
        Thread.sleep(100000);
    }

    @Test
        //Тестим есть ли алерт на негативный вариант
    void isAlertPresentTestOf() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/frames");
        AlertHelper alertHelper = new AlertHelper();
        alertHelper.isAlertPresent();
        Thread.sleep(5000);
    }

    @Test
        //Тестим есть ли алерт на позитивный вариант
    void isAlertPresentTestOn() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();
        AlertHelper alertHelper = new AlertHelper();
        Assert.assertTrue(alertHelper.isAlertPresent());
        //Тест прошел,но в консоле Failed почему? Должно было быть true
    }


}

