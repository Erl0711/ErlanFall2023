package com.practice.asan;

import java.util.Scanner;

public class DisplayTeenNum {
    //    Выведите на экран все положительные делители натурального
//        числа, введённого пользователем с клавиатуры.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a natural number: ");
        int num = scan.nextInt();
        if (num <= 0){
            System.out.println("It is not natural number");
        }else  {
            System.out.println("Положительные делители числа " + num + ":");
        displayPositiveDiv(num);
    }

            //        int res = 0;
//        if (num > 0){
//            if (num % 2 == 0){
//                res = num / 2;
//            }
//            System.out.println(res);
//        }
    }

    public static void displayPositiveDiv(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
