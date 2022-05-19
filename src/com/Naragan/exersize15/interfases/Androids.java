package com.Naragan.exersize15.interfases;

public class Androids implements Smartphones, LinuxOS {

    @Override
    public void call() {
        System.out.println("call Android");
    }

    @Override
    public void sms() {
        System.out.println("sms Android");
    }

    @Override
    public void internet() {
        System.out.println("internet Android");
    }

    @Override
    public void LinuxOS() {
        System.out.println("LinuxOS+Androids");
    }
}

