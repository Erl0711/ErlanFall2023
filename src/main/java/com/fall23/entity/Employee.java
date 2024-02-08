package com.fall23.entity;

import lombok.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//Конструктор со всеми аргументами,под капотом соз-ет конструктор со всеми свойствами
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Employee {

    private String firstName;
    private String lastName;
//    private String userName;
//    private int password;
    private int age;
    private String email;
    private int salary;
    private String department;

    //Возьми всех сотруд-в с таблицы
    public static ArrayList<Employee> getEmployeesFromTable(WebDriver driver){

        //Ищем ряды таблицы и ложим туда 10 рядов
        List<WebElement> rows = driver.findElements(By.cssSelector(".ReactTable .rt-tr-group"));

        //Создали пустой лист для заполнения
        ArrayList<Employee> employees = new ArrayList<>();

      // Перебираем лист
      for(WebElement row:rows){
          List <WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
          //Начинаем перебирать rt
          String firstName = cells.get(0).getText();
          String lastName = cells.get(1).getText();
          String ageText = cells.get(2).getText().replaceAll("[^0-9]","");
          String email = cells.get(3).getText();
          String salaryText = cells.get(4).getText().replaceAll("[^0-9]","");
          String departament = cells.get(5).getText();

          //Проверка на пустоту поля
          if (firstName.isEmpty() || lastName.isEmpty()|| ageText.isEmpty()||salaryText.isEmpty() || departament.isEmpty()){
              continue;
          }

          // trim - удаляет лишние пробелы (парсим)
          int age = Integer.parseInt(ageText.trim());
          int salary = Integer.parseInt(salaryText.trim());


          employees.add(new Employee (firstName, lastName, age, email, salary, departament));
      }
          return employees;
    }

}
