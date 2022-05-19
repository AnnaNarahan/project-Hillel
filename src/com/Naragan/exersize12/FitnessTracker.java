package com.Naragan.exersize12;

public class FitnessTracker {
     private String name;
    String surname;
    private int dayOfBirthday;
    private int monthOfBirthday;
   private int yearOfBirthday;
   private String email;
   private String numberPhone;
    double weight;
    int amountOfSteps;
    String pressure;

    public FitnessTracker(String name,String surname,int dayOfBirthday, int monthOfBirthday,
                          int yearOfBirthday, String email, String numberPhone,double weight,
                          int amountOfSteps,String pressure) {

        this.surname=surname;
        this.weight=weight;
        this.pressure=pressure;
        this.amountOfSteps=amountOfSteps;
        this.name=name;
        this.dayOfBirthday=dayOfBirthday;
        this.monthOfBirthday=monthOfBirthday;
        this.yearOfBirthday=yearOfBirthday;
        this.email=email;
        this.numberPhone=numberPhone;
    }




    public void getInfo (FitnessTracker[]array){
        for (int i = 0; i < array.length; i++) {
            array[i].printAccountInfo();
        }
    }
    public void   printAccountInfo(){
        System.out.println("FitnessTracker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", day of birthday=" + dayOfBirthday +
                ", month of birthday=" + monthOfBirthday +
                ", year of birthday=" + yearOfBirthday +
                ", email='" + email + '\'' +
                ", number phone='" + numberPhone + '\'' +
                ", weight=" + weight +
                ", amount of steps=" + amountOfSteps +
                ", pressure='" + pressure + '\''+
                ", age of user='" + (int)(2022-yearOfBirthday) + '\'' +
                '}');
    }

    int age=(int)(2022-yearOfBirthday);

    public String getName(){
        return name;  }
           public void setName(String name){
        this.name=name; }
    public int getDayOfBirthday(){
        return dayOfBirthday;
    }
    public void setDayOfBirthday(int dayOfBirthday){
        this.dayOfBirthday=dayOfBirthday;
    }
    public int getMonthOfBirthday(){
        return monthOfBirthday;
    }
    public void setMonthOfBirthday(int monthOfBirthday){
        this.monthOfBirthday=monthOfBirthday;
    }
    public int getYearOfBirthday(){
        return yearOfBirthday;
    }
    public void setYearOfBirthday(int yearOfBirthday){
        this.yearOfBirthday=yearOfBirthday;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getNumberPhone(){
        return numberPhone;
    }
    public void setNumberPhone(String numberPhone){
        this.numberPhone=numberPhone;
    }

    public int getAge(){
        return age;}






    }

