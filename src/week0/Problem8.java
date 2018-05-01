package week0;

import java.util.Scanner;

public class Problem8 {

    //Write a program that converts a duration in nanoseconds to days, hours,
    //minutes, and seconds

    public static void main(String[] args) {

        double nano;



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nanoseconds and i will converts it to days, hours, minutes and seconds");

        nano = sc.nextDouble();

        double day = Math.floor((nano / 864000000)/100000);

        System.out.println(day);


        int hour;
        int min;
        int sec;






    }



}
