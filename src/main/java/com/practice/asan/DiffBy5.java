package com.practice.asan;

public class DiffBy5 {
    //    Создайте программу, выводящую на экран все неотрицательные элементы
//    последовательности 90 85 80 75 70 65 60 ….
    public static void main(String[] args) {
        for (int i = 90; i > 0; i -= 5){
            System.out.println(i);
        }
    }
}
