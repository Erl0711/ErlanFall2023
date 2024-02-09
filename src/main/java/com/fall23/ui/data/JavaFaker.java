package com.fall23.ui.data;


import com.fall23.entity.Employee;
import com.github.javafaker.Faker;

public class JavaFaker {

    static Faker faker = new Faker();

    public static Employee createNewEmployeeWithFakeData(){
        return Employee.builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .age(faker.number().randomDigit())
                .email(faker.internet().emailAddress())
                .salary(faker.number().randomDigit())
                .department(faker.commerce().department())
                .build();
    }

}