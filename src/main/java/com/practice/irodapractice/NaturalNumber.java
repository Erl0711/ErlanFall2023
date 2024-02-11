package com.practice;

import java.util.Scanner;

public class NaturalNumber {
  //  Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
     public static void positiveNum(int a){
         for(int i = 1; i <=a; i++) {
             if (a % 1 == 0) {
                 System.out.println(i);
             }
         }
     }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натурально число...");
        int number = scan.nextInt();
        if(number<=0){
            System.out.println("Некорректно, введите положительное число");
        }else {
            System.out.println("Положительные делители " + number + ":");
            positiveNum(number);
        }
    }
}
