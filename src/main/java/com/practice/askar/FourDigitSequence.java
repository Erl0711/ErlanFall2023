package com.practice.askar;

public class FourDigitSequence {
    public static void main(String[] args) {
        /*Создайте программу, выводящую на экран все четырёхзначные числа последовательности
         1000 1003 1006 1009 1012 1015 ….*/
        int starNumber = 1000;
        printFourDigitSequence(starNumber);

    }

    public static void printFourDigitSequence(int startNumber) {
        // Условие завершения: последнее четырёхзначное число должно быть меньше 10000
        while (startNumber < 1100) {
            System.out.println(startNumber);

            // Увеличиваем число на шаг 3 (следующее четырёхзначное число)
            startNumber += 3;
        }
    }
}

