package com.Naragan.Exersize10;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int numberN;
        int numberM;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entered lenght of array M and N");
        numberN = getNumber(scanner);
        System.out.println("Your entered  N :" + numberN);
        numberM = getNumber(scanner);
        System.out.println("Your entered  M :" + numberM);

        int[][] array = new int[numberM][numberN];
        int number = 1;
        for (numberM = 0; numberM < array.length; numberM++) {
            for (numberN = 0; numberN < array[numberM].length; numberN++) {
                array[numberM][numberN] = number;
                number++;
            }
        }
        for (numberM = 0; numberM < array.length; numberM++) {
            for (numberN = 0; numberN < array[numberM].length; numberN++) {
            }
        }
        System.out.println(Arrays.deepToString(array));

        int[][] array2 = new int[numberN][numberM];
        for (numberN = 0; numberN < array2.length; numberN++) {
            for (numberM = 0; numberM < array2[numberN].length; numberM++) {
                array2[numberN][numberM] = array[numberM][numberN];
            }
        }
        for (numberN = 0; numberN < array2.length; numberN++) {
            for (numberM = 0; numberM < array2[numberN].length; numberM++) {
            }
        }
                System.out.println(Arrays.deepToString(array2));


            System.out.println();

    }
        public static int getNumber(Scanner scanner){
                    while (true){
              if(scanner.hasNextInt()){
                  int number= scanner.nextInt();
                  return number;
              }else{
                  System.out.println("Pleas enter number");
              }scanner.next();
          }
        }
    }

