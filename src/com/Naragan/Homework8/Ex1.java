package com.Naragan.Homework8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Random numbers of company:");
        int[] array1 = new int[7];
        int min = 0;
        int max = 9;
        for (int i = 0; i < 7; i++) {
            array1[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        System.out.println("Enter seven numbers 0 to 9");

        int[] array2 = new int[7];
        for (int j = 0; j < array2.length; j++) {

            array2[j] = getNumber(scanner);
        }
        System.out.println("You are entered numbers are:");

        for (int j = 0; j < array2.length; j++) {
        }
        Arrays.sort(array2);
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array2[j]+" ");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j] && i == j) {

                    System.out.print(" " + array1[i] + " " + " ");
                    System.out.print(":you guessed right!");
                }
            }continue;}
        System.out.println();
                System.out.print("For the rest or all of the numbers no matches");
            }

    public static int getNumber(Scanner scanner) {
        int n = 0;

            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if((n<=9)&&(n>=0)){
                System.out.println("you entered :" + n);

            } else {
                System.out.println("wrong data");
                scanner.next();
            }
        }
            return n;
        }

    }











