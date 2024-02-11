package com.iroda.practice.zhazgul_practice;
public class _7_Peremennye {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        swapVar(a,b);

    }
    public static void swapVar(int a,int b){
        a = a + b;//5+4
        b = a - b;//9-4
        a = a -b ;//9-5

        System.out.println("resul of swap:\t" + a + " "+ b);
    }
}
