package com.javarush.task.pro.task02.task0218;

import java.util.Scanner;

/* 
Ручное управление
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number1 = console.nextInt();
        int number2 = console.nextInt();
        int number3 = console.nextInt();

        System.out.println(number1 * number2 * number3);
    }
}
