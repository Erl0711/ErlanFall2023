package com.iroda.practice.zhazgul_practice;

import java.util.Arrays;
import java.util.Random;

public class _2_ArraysRandomInput_2 {
    public static void main(String[] args) {
//        С помощью созданного метода и метода из предыдущей задачи заполнить 5 массивов
//        из 10 элементов каждый случайными числами и вывести все 5 массивов на экран,
//        каждый на отдельной строке.

        int [] massiv = new int [10];
        arrInputLoop(massiv);
        for (int nums : massiv){
            System.out.println(nums);
        }

        System.out.println("-------------------------------");



        int [] arr = new int[10];
        int [] arr2 = new int[10];
        int [] arr3 = new int[10];
        int [] arr4 = new int[10];
        int [] arr5 = new int[10];

        System.out.println(Arrays.toString(arrInputRand(arr)));
        for (int arrs : arr){
            System.out.println(arrs);
        }
        System.out.println(Arrays.toString(arrInputRand(arr2)));
        for (int arrs : arr2){
            System.out.println(arrs);
        }
        System.out.println(Arrays.toString(arrInputRand(arr3)));
        for (int arr1 : arr3){
            System.out.println(arr1);
        }
        System.out.println(Arrays.toString(arrInputRand(arr4)));
        for (int arr1 : arr4){
            System.out.println(arr1);
        }
        System.out.println(Arrays.toString(arrInputRand(arr5)));
        for (int arr1 : arr5){
            System.out.println(arr1);
        }



    }



    public static int [] arrInputRand (int []arr){
        Random random = new Random();
        for (int i= 0; i < arr.length; i++){
            arr [i] = random.nextInt(100);
                    }
        return arr;
    }

    public static void arrInputLoop(int []arr){
        for (int i = 0; i < arr.length; i++){
            arr [i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
