package com.Naragan.HomeworkEx3;

public class Person<n> {
    public static void main(String[] args) {
        personInfo (  "Will",  "Smith",  "New York", "2936729462846");
        personInfo ( "Jackie", "Chan",  "Shanghai", "12312412412");
        personInfo (  "Sherlock", "Holmes",  "London", "37742123513");
        System.out.println();
        System.out.println("Fuctorial n!= "+fuctorial(5));
                           }
    public static void  personInfo (String name,String surname,String city,String telefon) {
        System.out.println("You can call a citizen " + name + " " + surname + " from the city " + city + " by number:" + telefon + ".");
        return ;
    }

    public static long fuctorial(int n) {
        if (n<1){
            return 1;
    }
                return n*fuctorial(n-1);
    }
}