package week0;

import java.util.Scanner;

public class Problem6 {

    //Write a program that reads a single character from standard in and outputs
    //whether it is a vowel or consonant to standard out.
    //A, E, I, O, U, Y.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a single character and i will tell you if its a vowel or a consonant");

        String c = sc.nextLine();

        if (c.equals("a") || c.equals("A") || c.equals("e") || c.equals("E") || c.equals("i") || c.equals("I") ||
                c.equals("o") || c.equals("O") || c.equals("u") || c.equals("U") || c.equals("y") || c.equals("Y")) {

           System.out.println(c + " is a vowel");

        }
        else {
            System.out.println(c + " is a consonant");
        }




    }


}
