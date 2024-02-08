package uiTests.textBox;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.AlertHelper;
import com.fall23.ui.helper.FrameHelper;
import com.fall23.ui.pages.TextBoxPage.*;
import com.fall23.ui.pages.TextBoxPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextBoxTest {

    WebDriver driver;

    TextBoxPage textBoxPage;

    @BeforeClass
    void SetUpDriver(){
        driver = Driver.getDriver();

     }

     @AfterClass
     void close(){
        driver.close();
        driver.quit();
     }

    @Test
    @Description("Negative: Заполнение поля email некорректным значением")
    void fillUpEmailWithIncorrectValue(){
        driver.get("https://demoqa.com/text-box");

        new TextBoxPage()
                .fillUpFullName("John Doe")
                .fillUpEmail("joinsdfv@g")
                .fillUpCurrentAddress("Mira 123")
                .fillUpPermanentAddress("Sovet 321")
                .clickSubmitBtn();

        Assert.assertEquals(textBoxPage.emailInput.getAttribute("class"),"mr-sm-2 field-error form-control");
    }

    @Test
    void fillUpTheFormPositiveTest() {
        driver.get("https://demoqa.com/text-box");
        textBoxPage
                .fillUpFullName("John Doe")
                .fillUpEmail("joinsdfv@gmail.com")
                .fillUpCurrentAddress("Mira 123")
                .fillUpPermanentAddress("Sovet 321")
                .clickSubmitBtn();

        //TODO add the  assertions
    }
    @Test
    void test123(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
        confirmButton.click();
        AlertHelper alertHelper = new AlertHelper();
            alertHelper.acceptAlert();
        }


        @Test
    void frameTest(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/frames");
        FrameHelper frameHelper = new FrameHelper(driver);
        WebElement frame1ID = driver.findElement(By.id("frame1"));
        driver.switchTo().frame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        }

    }

