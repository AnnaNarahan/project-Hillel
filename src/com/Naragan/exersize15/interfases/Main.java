package com.Naragan.exersize15.interfases;

public class Main {
    public static void main(String[] args) {
        Smartphones[]array= new Smartphones[]{
        new Androids(),new iPhones()};
for (Smartphones smartphones:array){
    smartphones.call();
    smartphones.sms();
    smartphones.internet();
}

    }
}
