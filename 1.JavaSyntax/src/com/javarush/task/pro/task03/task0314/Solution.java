package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String string = console.nextLine();
        int number;
        double aDouble = console.nextDouble();
        if (console.hasNextInt()){
            number = console.nextInt();
        }








        /*
        String string = console.nextLine();

        if (secret.equalsIgnoreCase(string)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }
         */
    }
}
