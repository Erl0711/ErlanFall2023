package com.practice.askar;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        /*есть 2 переменные A и B, поменять местами значения без использования 3 переменной...*/
        int a = 5;
        int b = 10;



        // Вызов метода для обмена значений переменных
        swapValuesWithoutThirdVariable(a, b);


    }

    public static void swapValuesWithoutThirdVariable(int a, int b) {
        // Обмен значений без использования третьей переменной
        a = a + b;
        System.out.println(a);
        b = a - b;
        System.out.println(b);
        a = a - b;
        System.out.println(a);

        // Передаем измененные значения обратно в вызывающий код
        /* (в Java передача аргументов осуществляется по значению, поэтому это не затронет
         оригинальные переменные)*/
    }
}


