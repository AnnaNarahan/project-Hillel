package com.Naragan.Homework7;

import java.util.Arrays;

public class Exersize2 {
    public static void main(String[] args) {
        /*Задать одномерный массив заполненный
        случайными числами (используем random) и найти в нем минимальный и максимальный элементы*/
        int[] array = new int[34];
        int number;
        int min = 1;
        int max = 33;
        int maxRandom = array[0];

        for (number = 0; number < array.length; number++) {
            array[number] = (int) (Math.random() * (max - min) + min);
            System.out.print(array[number] + " ");
        }
               System.out.println();
        int minRandom = array[0];
        for (number = 1; number < array.length; number++) {
            if (array[number] > maxRandom) {
                maxRandom = array[number];

            } else if (array[number] < minRandom) {
                minRandom = array[number];
            }
        }
        System.out.println("Min random number : "+minRandom+" Max random number : "+maxRandom);
    }

}




