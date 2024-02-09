package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MainTest {
    public static void main(String[] args) {

        Car tesla = new Car("tesla", 3.5);
        Car mers = new Car("tesla", 3.5);

        Map<Car, String> map = new HashMap<>();

        map.put(tesla, "modelS");

        System.out.println(map.get(mers));
        System.out.println(tesla.equals(mers));
    }
}
