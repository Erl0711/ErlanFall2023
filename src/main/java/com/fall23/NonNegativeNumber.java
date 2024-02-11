package com.practice;

public class NonNegativeNumber {
    // Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
    public static void nonNegative() {
        for (int i = 90; i >= 0; i -= 5) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        nonNegative();
    }
}
