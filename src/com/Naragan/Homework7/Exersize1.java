package com.Naragan.Homework7;

import java.util.Arrays;

public class Exersize1 {
    public static void main(String[] args) {
        int agTeam1;
        int agTeam2;
        int agMin = 18;
        int agMax = 40;
        int[] arrayAgTeam1 = new int[26];
        int[] arrayAgTeam2 = new int[26];
        for (agTeam1 = 1; agTeam1 < arrayAgTeam1.length; agTeam1++) {
            arrayAgTeam1[agTeam1] = (int) (Math.random() * (agMax - agMin) + agMin);
            System.out.print(arrayAgTeam1[agTeam1] + " ");
        }
        System.out.println();
        for (agTeam2 = 1; agTeam2 < arrayAgTeam2.length; agTeam2++) {
            arrayAgTeam2[agTeam2] = (int) (Math.random() * (agMax - agMin) + agMin);
            System.out.print(arrayAgTeam2[agTeam2] + " ");
        }
        System.out.println();
        int middleAgeTeam1;
        int middleAgeTeam2;
        int sumAg1 = 0;
        int sumAg2 = 0;
        for (agTeam1 = 0; agTeam1 < arrayAgTeam1.length; agTeam1++) {
            sumAg1 += arrayAgTeam1[agTeam1];
        }
        middleAgeTeam1 = sumAg1 / 25;
        System.out.println("average age of first team: " + middleAgeTeam1);
        for (agTeam2 = 0; agTeam2 < arrayAgTeam2.length; agTeam2++) {
            sumAg2 += arrayAgTeam2[agTeam2];
        }
        middleAgeTeam2 = sumAg2 / 25;
        System.out.println("average age of first team: " + middleAgeTeam2);
    }
}


