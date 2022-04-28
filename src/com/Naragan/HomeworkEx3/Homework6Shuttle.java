package com.Naragan.HomeworkEx3;

public class Homework6Shuttle {
    public static void main(String[] args) {
        int numberShuttle = 0;
        int countShuttle = 0;
        for (; numberShuttle < 155; numberShuttle++) {
            if ((numberShuttle % 10 != 9 && numberShuttle % 10 != 4 &&
                    (numberShuttle / 10) % 10 != 9) && (numberShuttle / 10) % 10 != 4) {
                countShuttle++;
                System.out.println("numberShuttle" + numberShuttle + "countShuttle" + countShuttle);}
            }
        }

    }








