package com.practice.askar;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        /*Создать статический метод, который будет иметь два целочисленных параметра a и b,
        и в качестве своего значения возвращать случайное целое число из отрезка [a;b].*/
        int a = 10;
        int b = 20;

        int randomValue = generateRandomNumber(a, b);

        System.out.println("Случайное число из отрезка [" + a + ", " + b + "]: " + randomValue);
    }

    public static int generateRandomNumber(int a, int b) {
        // Используем класс Random для генерации случайного числа в заданном диапазоне
        Random random = new Random();
        return random.nextInt(b - a + 1) + a;
    }
}


