package com.Naragan.exersize15.interfases;

public class iPhones implements Smartphones, iOS {

    @Override
    public void call() {
        System.out.println("call iPhone");
    }

    @Override
    public void sms() {
        System.out.println("sms iPhone");
    }

    @Override
    public void internet() {
        System.out.println("internet iPhone");
    }

    @Override
    public void iOs() {
        System.out.println("ios-iphone");
    }
}
