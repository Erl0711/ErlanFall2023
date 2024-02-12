package com.practice.askar;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayPrint {

    public static void main(String[] args) {
        // Создаем 5 массивов из 10 элементов каждый
        int[][] arrays = new int[5][10];

        // Заполняем и сортируем массивы
        fillAndSortArrays(arrays);

        // Выводим отсортированные массивы
        System.out.println("Отсортированные массивы:");
        printArrays(arrays);
    }

    public static void fillAndSortArrays(int[][] arrays) {
        Random random = new Random();

        for (int i = 0; i < arrays.length; i++) {
            // Заполняем массив случайными числами
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = random.nextInt(100); // Генерация случайного числа от 0 до 99
            }

            // Сортируем массив
            sortArray(arrays[i]);
        }
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    public static void printArrays(int[][] arrays) {
        // Проходим по всем массивам и выводим их содержимое на экран
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(Arrays.toString(arrays[i]));
        }
    }
}

