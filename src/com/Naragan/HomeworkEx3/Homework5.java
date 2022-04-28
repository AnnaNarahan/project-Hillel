package com.Naragan.HomeworkEx3;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        String nameFirstTeam = "Faze";
        String nameSecondTeam = "Azov";
               Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you sum of frags of your team :");
        double averageFaze = 0;
        double averageAzov = 0;
        if (scanner.hasNextInt()) {
            int playerFaze1 = scanner.nextInt();
            int playerFaze2 = scanner.nextInt();
            int playerFaze3 = scanner.nextInt();
            int playerFaze4 = scanner.nextInt();
            int playerFaze5 = scanner.nextInt();
            int playerAzov1 = scanner.nextInt();
            int playerAzov2 = scanner.nextInt();
            int playerAzov3 = scanner.nextInt();
            int playerAzov4 = scanner.nextInt();
            int playerAzov5 = scanner.nextInt();
            averageFaze = (double) (playerFaze1 + playerFaze2 + playerFaze3 + playerFaze4 + playerFaze5) / 5;
            averageAzov = (double) (playerAzov1 + playerAzov2 + playerAzov3 + playerAzov4 + playerAzov5) / 5;
            System.out.println("Average of frags you team 'Faze': " + averageFaze);
            System.out.println("Average of frags you team 'Azov': " + averageAzov);
        } else {
            System.out.println("Wrong data");
        }
        if (averageFaze == averageAzov) {
            System.out.println("no one won the results are the same");
        } if (averageFaze > averageAzov){
            System.out.println("Team 'Faze' is winner!Your result is :"+averageFaze);
        } else {
            System.out.println("Team 'Azov' is winner!Your result is :"+averageAzov);
        }
            scanner.close();
    }

}

