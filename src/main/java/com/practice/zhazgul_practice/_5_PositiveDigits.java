package com.iroda.practice.zhazgul_practice;

public class _5_PositiveDigits {
    public static void main(String[] args) {
// Создайте программу, выводящую на экран все неотрицательные элементы
// последовательности 90 85 80 75 70 65 60….
   positiveNums();
    }

    public static void positiveNums() {
        for (int i = 90; i >= 0; i -= 5) {
            System.out.println(i);
        }
    }
}
