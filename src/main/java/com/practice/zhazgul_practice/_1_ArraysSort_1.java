package com.iroda.practice.zhazgul_practice;

import java.util.Arrays;


public class _1_ArraysSort_1 {

    public static void main(String[] args) {
//  Создать метод,
//  который будет сортировать указанный массив по возрастанию любым
//  известным вам способом.
        int[] arr = {5, 9, 0, 7, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrSort(arr)));

        System.out.println("--------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }


    public static int[] arrSort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        int temp = 0;
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        isSort = false;
                    }
                }
            }
        }
        return arr;
    }
}
