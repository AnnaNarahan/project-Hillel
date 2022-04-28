package com.Naragan.HomeworkEx3;

import java.util.Scanner;

public class Homework6 {
    public static void main  (String[] args) {
        System.out.println("Quess an integer from 0 to 10?You have three tries! ");
        Scanner scanner = new Scanner(System.in);
        int try1, try2, try3;
        int number1 =0;
        int number2 =10;
        int numberRandom = number1+(int)((Math.random()) * number2);

        try1=getTry(scanner);
        try2=getTry(scanner);
        try3=getTry(scanner);

        while (try1>=0 && try2>=0&& try3>=0){
            if (numberRandom==try1||numberRandom==try2||numberRandom==try3) {
                System.out.println("YUO ARE WINNER! You right number is :" + numberRandom);
                           }else {
                System.out.println("YOU lost, you didn't guess:(((");
                            }
            break;

    }

        }

        public static int getTry(Scanner scanner) {
            int result = 0;
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                System.out.println("You entered:" + result);
            } else {
                System.out.println("You entered wrong data");
                System.out.println("Try start game again");
                System.exit(0);
            }
            return result;
        }

    
        }











