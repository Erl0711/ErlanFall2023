package com.practice.asan;

import java.util.Random;

public class HomeWork2 {
    //    Создать статический метод, который будет иметь два целочисленных параметра a и b,
//    и в качестве своего значения возвращать случайное целое число из отрезка [a;b].
    public static int returnRandomNum(int a, int b){
                if (b < a) {
                    throw new IllegalArgumentException("b должно быть больше или равно a");
                }
                Random random = new Random();
                return random.nextInt(b - a + 1) + a;
            }

            public static void main(String[] args) {
                int a = 5;
                int b = 10;
                int randomNum = returnRandomNum(a, b);
                System.out.println("Случайное число в диапазоне [" + a + ", " + b + "]: " + randomNum);
            }


        }




