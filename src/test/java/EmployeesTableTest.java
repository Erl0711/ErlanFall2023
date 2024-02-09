import com.fall23.entity.Employee;
import com.fall23.ui.data.JavaFaker;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.WebTablePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.fall23.entity.Employee.getEmployeesFromTable;

public class EmployeesTableTest {

    WebDriver driver = Driver.getDriver();
    @Test
    void test123() {

        driver.get("https://demoqa.com/webtables");

        List<Employee> employees = getEmployeesFromTable(driver);

        employees.forEach(System.out::println);

        //Преобразовываем мапим в интежер , stream--> открывает поток данных
        int totalSalaryAmount = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();

        int total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }

        System.out.println(totalSalaryAmount);
        System.out.println(total + " total");
    }

        @Test
        void createNewEmployeeWithFakeDataTest(){
            driver.get("https://demoqa.com/webtables");
            Employee randomEmployee = JavaFaker.createNewEmployeeWithFakeData();
            WebTablePage webTablePage = new WebTablePage(driver);
            webTablePage.fillUpTheForm(randomEmployee);
            List<Employee> employeesFaker = getEmployeesFromTable(driver);
            employeesFaker.forEach(System.out::println);

            // TODO verify all employees


        }
    }

