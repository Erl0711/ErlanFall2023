package com.practice.askar;

public class NonNegativeSequence {
    public static void main(String[] args) {
        /*Создайте программу, выводящую на экран все неотрицательные элементы последовательности
        90 85 80 75 70 65 60 ….*/
        // Начальное число последовательности
        int startNumber = 90;

        // Вывод неотрицательных элементов последовательности
        printNonNegativeSequence(startNumber);
    }

    public static void printNonNegativeSequence(int startNumber) {
        // Условие завершения: текущее число должно быть неотрицательным
        while (startNumber >= 0) {
            System.out.println(startNumber);

            // Уменьшаем число на шаг 5 (следующий неотрицательный элемент)
            startNumber -= 5;
        }
    }
}


