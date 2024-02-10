package com.practice.asan;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
//    Создать метод, который будет сортировать указанный массив по
//    возрастанию любым известным вам способом.
//    С помощью созданного метода и метода из предыдущей задачи заполнить
//    5 массивов из 10 элементов каждый случайными числами и вывести
//        все 5 массивов на экран, каждый на отдельной строке.

public static void arraySort(int[] arr){
    Arrays.sort(arr);
    }
    public static int arraySort2(int[] arr){
    int max = arr[0];
    for (int i = 1; i < arr.length; i++){
        if (arr[i] > max){
            max = arr[i];
        }
    }
    return max;
    }
    public static void main(String[] args) {
//        int [] we = {12,45,86,32,12,56};
//        System.out.println(arraySort2(we));

        int[][] array =new int [5][10];
        Random random = new Random();
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                array[i][j] = random.nextInt(50);
            }System.out.println(Arrays.toString(array[i]));

        }

      //  System.out.println(Arrays.deepToString(array))
        }
}
