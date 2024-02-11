package com.iroda.practice.zhazgul_practice;

import java.util.Scanner;

public class _3_IntAAndB {
    public static void main(String[] args) {
//        Создать статический метод, который будет иметь
//        два целочисленных параметра a и b, и в качестве своего значения возвращать
//        случайное целое число из отрезка [a;b].


        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число а:\t" + "= ");
        int a = scan.nextInt();
        System.out.print("Введите число b:\t" + "= ");
        int b = scan.nextInt();

        System.out.println(randomDigit(a, b));
    }


    public static int randomDigit(int a, int b) {
        if (a > b) {
            int c = (int) (Math.random() * (a - b));
            return c;
        }
        int d = (int) (Math.random() * (b - a));
        return d;
    }
}
