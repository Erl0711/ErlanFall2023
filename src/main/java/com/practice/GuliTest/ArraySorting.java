package com.practice.GuliTest;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[][] arrays = new int[5][10];
        fillArrays(arrays);
        sortArrays(arrays);
        printArrays(arrays);
        // Метод для обмена значениями переменных без использования третьей
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        swapVariables(a, b);
    }

    // Метод для обмена значениями переменных без использования третьей
    public static void swapVariables(int a, int b) {
        System.out.println("Swapping without using third variable...");
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }



    // Метод для заполнения массивов случайными числами
    public static void fillArrays(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = getRandomNumber(1, 100); // заполняем случайными числами от 1 до 100
            }
        }
    }

    // Метод для сортировки массивов по возрастанию
    public static void sortArrays(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            Arrays.sort(arrays[i]);
        }
    }

    // Метод для вывода массивов на экран
    public static void printArrays(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(Arrays.toString(arrays[i]));
        }
    }

    // Метод для генерации случайного числа в заданном диапазоне [a, b]
    public static int getRandomNumber(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a;



   }
    // Метод для вывода всех четырехзначных чисел последовательности, начиная с указанного числа
    public static void printFourDigitNumbers(int start) {
        while (start < 10000) {
            System.out.print(start + " ");
            start += 3; // последовательность увеличивается на 3
        }
        System.out.println();
    }
    // Метод для вывода всех неотрицательных чисел последовательности, начиная с указанного числа
    public static void printNonNegativeNumbers(int start) {
        while (start >= 0) {
            System.out.print(start + " ");
            start -= 5; // последовательность уменьшается на 5
        }
        System.out.println();
    }
}




