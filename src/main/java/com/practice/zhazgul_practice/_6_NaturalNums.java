package com.iroda.practice.zhazgul_practice;

import java.util.Scanner;

public class _6_NaturalNums {
    //    Выведите на экран все положительные делители натурального числа,
//    введённого пользователем с клавиатуры.
    public static void main(String[] args) {
        naturalDigits();


    }

    public static void naturalDigits() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите натуральное число:\t");
        int num = input.nextInt();
        if (num <= 0) {
            System.out.println("Invalid number, please try again");
        } else {
            System.out.println("Делителями числа "+num+" являются:\t");
            for (int i =num; i >0; i--){
                int b = num % i;
                if (b == 0){
                    System.out.println(i+ "");
                }
            }
        }

    }
}
