import com.fall23.entity.Employee;
import com.fall23.ui.data.JavaFaker;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.AlertHelper;
import com.fall23.ui.helper.FrameHelper;
import com.fall23.ui.pages.TextBoxPage;
import com.fall23.ui.pages.WebTablePage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static com.fall23.entity.Employee.getEmployeesFromTable;
import static org.testng.AssertJUnit.assertEquals;

public class TextBoxTest {

    WebDriver driver;

    TextBoxPage textBoxPage;

    @BeforeClass
    void SetUpDriver(){
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
     }

    @AfterClass
    void close(){
        driver.quit();
    }

    @Test
    @Description("Negative:Заполнение поля email некорректным значением")
    void fillUpTheFormNegativeTest(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage
                .fillUpFullName("John Doe")
                .fillUpEmail("john@gmail.com")
                .fillUpCurrentAddress("Mira 123")
                .fillUpPermanentAddress("Sovet 321")
                .clickSubmitBtn();

        System.out.println(textBoxPage.emailInput.getAttribute("placeholder"));
        System.out.println(textBoxPage.emailInput.getAttribute("placeholder"));
        Assert.assertEquals(textBoxPage.emailInput.getAttribute("class"),"mr-sm-2 form-control");
     }
    @Test
    void fillUpTheFormPositiveTest() {
        driver.get("https://demoqa.com/text-box");
        textBoxPage
                .fillUpFullName("John Doe")
                .fillUpEmail("john@gmail.com")
                .fillUpCurrentAddress("Mira 123")
                .fillUpPermanentAddress("Sovet 321")
                .clickSubmitBtn();
        //TODO add the  assertions
        String actualFullNameText =driver.findElement(By.cssSelector("#name")).getText();
        assertEquals(actualFullNameText,"Name:John Doe");
        String actualEmailText =driver.findElement(By.cssSelector("#email")).getText();
        assertEquals(actualEmailText,"Email:john@gmail.com");
        String actualCurrentAddressText =driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
        assertEquals(actualCurrentAddressText,"Current Address :Mira 123");
        String actualPermanentAddressText =driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
        assertEquals(actualPermanentAddressText,"Permananet Address :Sovet 321");

    }
    @Test
            void test1234(){
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

    @Test
    void test123(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/webtables");
        Employee randomEmployee = JavaFaker.createNewEmployeeWithFakeData();
        WebTablePage webTablePage = new WebTablePage(driver);
        webTablePage.fillUpTheForm(randomEmployee);
        List<Employee> employees = getEmployeesFromTable(driver);
        employees.forEach(System.out::println);

        // TODO verify all employees data
    }
    }

