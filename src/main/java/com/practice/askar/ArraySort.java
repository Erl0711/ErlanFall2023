package com.practice.askar;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        /*Создать метод, который будет сортировать указанный массив по возрастанию любым
        известным вам способом.*/

        int [] array = {7,4,2,6,9,8,1,5,3};
        arraySort(array);

        System.out.println("Sorted array " + Arrays.toString(array));
    }

public static void arraySort(int [] arr){
    Arrays.sort(arr);
    }
}
