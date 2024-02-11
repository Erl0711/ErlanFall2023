package com.practice;

public class Swap {
   // есть 2 переменные A и B,поменять местами значения без использования 3 переменной...
   public static void main(String[] args) {
       int a = 10;
       int b = 20;
       a= a+b;//30
       b=a-b;//10
       a=a-b;//20
       System.out.println(a);
   }
}
