package com.iroda.practice.GuliTest;

import java.util.Arrays;
import java.util.Random;

public class ArraySorting1 {

    //    Создать метод, который будет сортировать указанный массив по
//    возрастанию любым известным вам способом.
//    С помощью созданного метода и метода из предыдущей задачи заполнить
//    5 массивов из 10 элементов каждый случайными числами и вывести все 5 массивов на экран, каждый на отдельной строке.
    public static void sortArray(int[] arr) {//метод
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        // Создаем и заполняем пять массивов случайными числами
        int[][] arrays = new int[5][10];
        Random random = new Random();
        for (int i = 0; i < 5; i++) { //по массив
            for (int j = 0; j < 10; j++) {//значений
                arrays[i][j] = random.nextInt(100); // генерируем случайное число от 0 до 99
            }
        }

        // Сортируем каждый массив с помощью метода sortArray
        for (int i = 0; i < 5; i++) {
            sortArray(arrays[i]);
        }

        // Выводим отсортированные массивы на экран
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arrays[i]));
        }
    }
}


