package com.Naragan;

public class Main {
    public static void main(String[] args) {
        byte width = 12;
        short lengthSide = 250;
        float height = 578.546_856_4f;
float volume = width * lengthSide * height;
        System.out.println("1.  Volume of the parallelepiped = "+volume);
        float length = width+lengthSide+height;
        System.out.println("1.1 Length = "+length);

        float latitude= 49.8454198f;
        float longitude= 24.0084100f;
        System.out.println("2. My location: "+"("+latitude+","+ longitude+")" );
    }


}
