package week0;

import java.util.Scanner;

public class Problem5 {

    //Write a program that converts a length in feet to meters. The program
    //should read the length from standard in and output the result to standard out.

    public static void main(String[] args) {

        double feet;
        double meter = 0;
        double convert = 0.3048;

        Scanner sc = new Scanner(System.in);

        System.out.println("Feet to Meter Convertor \n Input Feet and press Enter");

        feet = sc.nextDouble();

        meter = feet * convert;

        System.out.println(feet + "Feet = " + meter + "Meters");



    }



}
