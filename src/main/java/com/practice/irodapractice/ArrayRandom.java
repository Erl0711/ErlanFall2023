package com.practice;
import java.util.Arrays;
import java.util.Random;
import static com.practice.zhazgul_practice.ArraySort.arraysToSort;

public class ArrayRandom {

   /* С помощью созданного метода и метода из предыдущей задачи заполнить 5 массивов из 10 элементов
    каждый случайными числами и вывести все 5 массивов на экран, каждый на отдельной строке.
    */

    public static int[] randomNumArray(int length) { //создали метод для заполнения случайными числами массив
        int[] array = new int[length]; // создали массив для хранения случайных чисел
        Random random = new Random();  // создали объект класса Random
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);//генерация случайных чисел(от 0 до 99)
        }
        return array; // возвращает массив
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {        // цикл для 5 массивов
            int[] newArrays = randomNumArray(10); // создали массив для хранения случайных чисеl
            arraysToSort(newArrays); // сортировка
            System.out.println( i + " Новый массив: " + Arrays.toString(newArrays)); //отсортированный новый массив, рандомные числа, но отсортированы по возрастанию
        }
    }
}
