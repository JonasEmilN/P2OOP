package week0;

import java.util.Scanner;

public class Problem7 {

    //Write a program that converts between temperatures in Fahrenheit and
    //Celsius. The program should prompt the user for the requested conversion, read the
    //input value from standard in, and output the result to stardard out.

    public static void main(String[] arg) {

        double c;
        double f;


        Scanner sc = new Scanner(System.in);

        System.out.println("Fahrenheit and Celsius converter \n Enter 1 for Fahrenheit to Celsius " +
                "\n Enter 2 for Celsius to Fahrenheit");

        double v = sc.nextDouble();

        if (v == 1) {
            System.out.println("Enter fahrenheit");

            f = sc.nextDouble();

            c = (f - 32) / 1.8;

            System.out.println(f + " fahrenheit = " + c + " celsius");



        }
        else if (v == 2) {
            System.out.println("Enter celsius");

            c = sc.nextDouble();

            f = c * 1.8 + 32;

            System.out.println(c + " celsius = " + f + " fahrenheit" );

        }
        else {
            System.out.println("i said only 1 or 2");
        }

    }



}
