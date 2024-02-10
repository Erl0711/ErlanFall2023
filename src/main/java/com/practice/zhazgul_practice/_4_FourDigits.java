package com.practice.zhazgul_practice;

public class _4_FourDigits {
    public static void main(String[] args) {
//        Создайте программу, выводящую на
//        экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

        digits();
    }

    public static void digits (){
        for (int i = 1000; i <= 9999; i+=3){
            System.out.println(i);
        }


    }

}
