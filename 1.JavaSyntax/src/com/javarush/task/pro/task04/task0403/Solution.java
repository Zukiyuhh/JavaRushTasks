package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        boolean isEnter;
        while(true){
            String string = console.nextLine();
            isEnter = string.equalsIgnoreCase("Enter");
            if (isEnter){
                break;
            }
            int a = Integer.parseInt(string);
            sum = sum + a;
        }
        System.out.println(sum);



    }
}