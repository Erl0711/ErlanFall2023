package com.practice;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        //Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом.

        int[] myArrays = {88, 75, 98, 67, 46};
        System.out.println("Исходный массив: " + Arrays.toString(myArrays));

        arraysToSort(myArrays);
        System.out.println("После сортировки: " + Arrays.toString(myArrays));
    }

    public static int[] arraysToSort(int[] array) { // метод для сортировки
        Arrays.sort(array); // сортирует по возрастанию
        return array;
    }
}