package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int i = 5;
        while (i > 0) {
            int j = 10;
            while (j > 0) {
                System.out.print("Q");
                j--;
            }
            System.out.println();
            i--;
        }
    }
}