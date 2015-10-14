package com.company;

import java.util.Scanner;
//Ronald Jones jones27@umbc.edu
//This code will allow you to average three test scores.
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to average three test scores?");
        System.out.println("Please enter R for yes and Q for no.");

        String choice;
        choice = input.next();

        while (choice.equals("R")) {

            System.out.println("Please enter your first test score.");
            float a = input.nextFloat();

            System.out.println("Please enter your second test score.");
            float b = input.nextFloat();

            System.out.println("Please enter your third test score.");
            float c = input.nextFloat();

            float average = (a + b + c) / 3;

            System.out.println("Your test average is " + average + ".");

            System.out.println("Do you want to average other test scores?");
            System.out.println("Please enter R for yes and Q for no.");

            choice = input.next();
        }
    }
}
