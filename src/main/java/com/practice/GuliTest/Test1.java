package com.practice.GuliTest;

import java.util.Scanner;

public class Test1 {
//    Выведите на экран
//    все положительные делители натурального
//        числа, введённого пользователем с клавиатуры.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите натуральное число: ");
    int number = scanner.nextInt();

    if (number <= 0) {
        System.out.println("Введено не натуральное число.");
    } else {
        System.out.println("Положительные делители числа " + number + ":");
        printPositiveDivisors(number);
    }

    scanner.close();
}

    // Метод для вывода положительных делителей числа
    public static void printPositiveDivisors(int number) {
        //                    50
        for (int i = 1; i <= number; i++) {
            //  50%      1
            if (number % i == 0) {//остаток нет
                System.out.println(i);
            }
        }
    }
}


