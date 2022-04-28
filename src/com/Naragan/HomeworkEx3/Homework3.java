package com.Naragan.HomeworkEx3;

import java.util.concurrent.atomic.AtomicInteger;

public class Homework3 {
    public static void main(String[] args) {

        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;
        int indicatorAttackLi = 860 * (warriorLi + archerLi + riderLi);
        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;
        double indicatorAttackMin = 1.5 * 860 * (warriorMin + archerMin + riderMin);
        System.out.println("Exersize number 1");
        System.out.println("indicatorAttackLi : " + indicatorAttackLi);
        System.out.println("indicatorAttackMin : " + indicatorAttackMin);
        System.out.println();
        division ();
        random();
    }
    public static void division (){
        int a = 8;
        int b = 3;
        double division = (double) a / b;
        System.out.println("Exersize number 2");
        System.out.println("result of devision is: " + division);
        System.out.println();
    }
public static void random(){
        double n = (int) ((-100) + Math.random() * 200);
        System.out.println("Exersize number 3*");
        System.out.println("random n= " + n);
    }
}












