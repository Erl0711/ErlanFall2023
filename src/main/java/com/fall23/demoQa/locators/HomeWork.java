package com.fall23.demoQa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.time.Duration;

public class HomeWork {
    WebDriver driver =new ChromeDriver();

    // Используется для обозначения метода, который должен быть выполнен один раз перед запуском всех тестовых методов в классе.
    // Часто этот метод используется для настройки ресурсов, которые будут использоваться во всех тестах, например, для инициализации соединения с базой данных или запуска веб-браузера перед выполнением тестов.

    @BeforeClass
    void openSite(){
    // Указываем путь до установочной драйвера браузера
    System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    // Позволяет открыть окно полностью
    driver.manage().window().maximize();
    // Устанавливает глобальное время ожидания для каждого действия поиска элементов.
    // Это означает, что если WebDriver не может найти элемент сразу, он будет ждать указанное время, прежде чем выбросить исключение.
    // Этот метод полезен, когда вам нужно дать веб-странице дополнительное время для загрузки элементов
    // или если элемент может быть доступен в течение некоторого времени, но не сразу после загрузки страницы.
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    //Ищем элемент по назв-ю тега
    String actualLoginText = driver.findElement(By.tagName("h5")).getText();
    String expectedLoginText = "Login";
    //Сравниваем фактическое с ожидаемым результатом
    Assert.assertEquals(actualLoginText,expectedLoginText);
    }

    //обозначает метод, который должен быть выполнен один раз после выполнения всех тестовых методов в классе.
    //Этот метод обычно используется для очистки ресурсов или завершения соединений, которые были настроены в методе `@BeforeClass`.

    @AfterClass
    void closeBrowser(){
        driver.close();
    }
    // Описание теста
    @Test (description = "Login with valid username and valid password", groups = "Valid data", priority = 0)
    void loginValidUsernameValidPasswordTest() throws InterruptedException {
        String username = "Admin";
        String password = "admin123";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualDashboardText = driver.findElement(By.tagName("h6")).getText();
        String expectedDashboardText = "Dashboard";
        Assert.assertEquals(actualDashboardText,expectedDashboardText);
        Thread.sleep(5000);

    }

    @Test (description = "Login with invalid username and valid password", groups = "Invalid data",dataProvider = "provider", priority = 2)
    void loginInvalidDataTest(String username,String password) {
        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualFailedLogin = driver.findElement(By.tagName("p")).getText();
        String expectedFailedLogin = "Invalid  credentials";
        Assert.assertEquals(actualFailedLogin, expectedFailedLogin);
    }
    // Исп-ем этот провайдер для краткого написания данных для теста
    @DataProvider(name = "provider")
    public Object [][] getInvalidData() throws InterruptedException {
        return new Object[][]{
                {"Admin","12345"},
                {"12345a","Admin235"},
                {"1dfh5a","jjggj"}
        };

    }
}


































