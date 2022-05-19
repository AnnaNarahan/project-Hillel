package com.Naragan.exersize12;



public class FitnessTrackerMain {
    public static void main(String[] args) {
        FitnessTracker[] array = getFitnessTracker();
        printAccountInfo(array);
    }

    public static FitnessTracker[] getFitnessTracker() {
        return new FitnessTracker[]{new FitnessTracker("Анна",
                "Петрова",
                19,
                5,
                1988,
                "naragan@ukr.net",
                "0667779222",
                50,
                1155,
                "160/90"),
                new FitnessTracker("Наталія",
                        "Громова",
                        1,
                        10,
                        1955,
                        "jfghjg@ukr.net",
                        "0665465222",
                        62,
                        2003,
                        "110/80"),
                new FitnessTracker("Федір",
                        "Мерзлікін",
                        31,
                        1,
                        1987,
                        "gjgkkkk@ukr.net",
                        "0664454256",
                        80,
                        508,
                        "140/95")
        };
    }


    public static void printAccountInfo(FitnessTracker[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i].printAccountInfo();
        }


            }
        }
    




