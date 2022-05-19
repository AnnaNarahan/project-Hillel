package com.Naragan.exersize12;

public class Burgers {
    String bun;
    String meat;
    String cheese;
    String mayonnaise;
    String greenery;
    String doubleMeat;

    public Burgers(String bun, String meat, String cheese, String mayonnaise, String greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        this.greenery = greenery;
        System.out.println("Burgers{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                ", greenery='" + greenery + '\'' +
                '}');
    }
    public Burgers(String bun, String meat, String cheese, String greenery) {
            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.greenery = greenery;
            System.out.println("Burgers{" +
                    "bun='" + bun + '\'' +
                    ", meat='" + meat + '\'' +
                    ", cheese='" + cheese + '\'' + '\'' +
                    ", greenery='" + greenery + '\'' +
                    '}');
        }

    public Burgers(String bun, String meat, String cheese, String mayonnaise, String greenery,String doubleMeat) {
        this.mayonnaise=mayonnaise;
        this.meat=meat;
        this.bun = bun;
        this.doubleMeat= doubleMeat;
        this.cheese = cheese;
        this.greenery = greenery;
        System.out.println("Burgers{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", doubleMeat='" + doubleMeat + '\'' +
                ", cheese='" + cheese + '\'' + '\'' +
                ", greenery='" + greenery + '\'' +
                ", mayonnaise='" + mayonnaise+
                '}');
    }
    }
