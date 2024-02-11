package com.practice;

import java.util.Random;

public class StaticMethod {
    //Создать статический метод, который будет иметь два целочисленных
   // параметра a и b, и в качестве своего значения возвращать случайное целое число из отрезка [a;b].
    public static int randomNumber(int a, int b){
        Random random = new Random();
        return random.nextInt(b-a+1)+a;
    }
    public static void main(String[] args) {
        int res = randomNumber(1,100);
        System.out.println("Случайное число "+ res);
    }

}
