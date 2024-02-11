package com.iroda.practice.GuliTest;

import java.util.Random;

public class ArraySorting2 {

//    Создать статический метод, который будет иметь два целочисленных параметра a и b,
//    и в качестве своего значения возвращать случайное целое число из отрезка [a;b].

    public static int generateRandomNumber(int a, int b) {
        // Проверяем, что b не меньше a
        if (b < a) {
            throw new IllegalArgumentException("b должно быть больше или равно a");//ошибка
        }

        // Создаем объект класса Random
        Random random = new Random();

        // Генерируем случайное число из отрезка [a; b]
        return random.nextInt(b - a + 5)+a;//выташи
    }

    public static void main(String[] args) {
        // Пример использования метода
        int a = 11;
        int b = 27;
        int randomNumber = generateRandomNumber(a, b);
        System.out.println("Случайное число из отрезка [" + a + "; " + b + "]: " + randomNumber);
    }
}
