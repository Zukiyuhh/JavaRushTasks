package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {

            int j = 20;

            while (j > 0) {
                if (i == 10 || i == 1){
                    System.out.print("Б");
                } else if (j == 20 || j == 1) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                j--;
            }
            System.out.println();
            i--;
        }
    }
}