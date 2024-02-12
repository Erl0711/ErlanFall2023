package com.practice;

import java.util.Scanner;

public class PositiveDivisors {
    public static void main(String[] args) {
        /*Выведите на экран все положительные делители натурального числа, введённого пользователем
        с клавиатуры.*/
        Scanner scanner = new Scanner(System.in);

        // Ввод натурального числа от пользователя
        System.out.print("Введите натуральное число: ");
        int number = scanner.nextInt();

        // Вывод положительных делителей
        System.out.println("Положительные делители числа " + number + ":");
        printPositiveDivisors(number);

        scanner.close();
    }

    public static void printPositiveDivisors(int number) {
        // Проверка на натуральность числа
        if (number <= 0) {
            System.out.println("Число не является натуральным.");
            return;
        }

        // Перебор чисел от 1 до number и вывод делителей
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}


