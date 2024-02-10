package com.practice.asan;

import java.util.Scanner;

public class ChangeABWithoutC {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // есть 2 переменные A и B,
        // поменять местами значения без использования 3 переменной...


        System.out.println("Enter A num: ");
       int a = scan.nextInt();
        System.out.println("Enter B num: ");
        int b = scan.nextInt();
        // Меняем значения местами без использования третьей переменной
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("После обмена:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        scan.close();


    }


}
