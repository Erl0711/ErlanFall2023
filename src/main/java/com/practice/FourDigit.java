package com.practice;

public class FourDigit {
    // Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
    public static void fourDigits() {
        for (int i = 1000; i < 1050; i += 3) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        fourDigits();
    }
}
