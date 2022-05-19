package com.Naragan.Exersize11;

public class Main {
    public static void main(String[] args) {
        Employee[] array = new Employee[5];

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        array[0] = employee1;
        array[1] = employee2;
        array[2] = employee3;
        array[3] = employee4;
        array[4] = employee5;

        employee1.surnameNamePatronymic = "ШЕВЧЕНКО МИКОЛА ІВАНОВИЧ";
        employee1.position = "генеральний директор";
        employee1.email = "wevchenko@ukr.net";
        employee1.phoneNumber = "068-452-98-32";
        employee1.salary = 250000;
        employee1.age = 52;


        employee2.surnameNamePatronymic = "МЕЛЬНИК МИКОЛА ІВАНОВИЧ ";
        employee2.position = "спеціаліст вищої категорії";
        employee2.email = "melnuk@ukr.net";
        employee2.phoneNumber = "066-482-38-02";
        employee2.salary = 150000;
        employee2.age = 32;

        employee3.surnameNamePatronymic = "КОВАЛЕНКО МИКОЛА ІВАНОВИЧ";
        employee3.position = "бухгалтер";
        employee3.email = "kovalenko@ukr.net";
        employee3.phoneNumber = "067-002-12-02";
        employee3.salary = 85000;
        employee3.age = 35;

        employee4.surnameNamePatronymic = "БОНДАРЕНКО МИКОЛА ІВАНОВИЧ";
        employee4.position = "охоронець";
        employee4.email = "bondarenko@ukr.net";
        employee4.phoneNumber = "066-111-88-37";
        employee4.salary = 35000;
        employee4.age = 31;

        employee5.surnameNamePatronymic = "БОЙКО МИКОЛА ІВАНОВИЧ ";
        employee5.position = "юрист";
        employee5.email = "boyko@ukr.net";
        employee5.phoneNumber = "063-177-10-95";
        employee5.salary = 45000;
        employee5.age = 44;



        for ( int i=0;i< array.length;i++) {
            if (array[i].age>40) {
                array[i].inform();
            }}

        }

        }

