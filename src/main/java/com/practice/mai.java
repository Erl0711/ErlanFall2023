package com.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mai {
    public static void main(String[] args) {
        String str1 = "lemon";
        String str2 = "2";
        int num = Integer.parseInt(str2);
        int len = 0;
        System.out.println(str1.equals(str2));

        if(str1.length() > str2.length()){
            len = str2.length();
        } else len = str1.length();
        var str = "sdasdasd";
        System.out.println(str);
    }

    // 6 + 5 + 4
    // 456 = 45
    public static int zaya(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static int zaya2(String str) {
        int sum = 0;
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += ch - '0';
            }
            i++;
        }
        return sum;
    }

    public static void tansuIndex(String phrase, String word) {
        int index = -1;
        while (true) {
            index = phrase.indexOf(word, index + 1);
            if (index != -1) {
                int endIndex = index + word.length();
                System.out.println("Индексы символов подстроки '" + word + "':");
                for (int i = index; i < endIndex; i++) {
                    System.out.println(i);
                }
            } else {
                break;
            }
        }
    }
}
