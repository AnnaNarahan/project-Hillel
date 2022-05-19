package com.Naragan.Exersize11;

public class Employee {
    String surnameNamePatronymic;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public void inform(){
        System.out.println("Employee information:"+surnameNamePatronymic+" ;"+position+" ;"+email+" ;"+phoneNumber+" ;"
        +salary+"грн. ;"+age+" .");
    }

}
