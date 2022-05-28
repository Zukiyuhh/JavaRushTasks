package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console1 = new Scanner(System.in);
        Scanner console2 = new Scanner(System.in);
        String string1 = console1.nextLine();
        String string2 = console2.nextLine();

        if (string1.equalsIgnoreCase(string2)){
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
    }
}
