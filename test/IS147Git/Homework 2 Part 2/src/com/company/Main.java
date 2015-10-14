package com.company;

import java.util.Scanner;

//Ronald Jones  jones27@umbc.edu
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please select an operation.");
        System.out.println("0: Quit");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");

        String choice;
        choice = input.next();

        while (choice.equals("1")) {
            System.out.println("Please enter your first number.");
                float fnum =input.nextFloat();
            System.out.println("Please enter your second number.");
                float snum = input.nextFloat();
            Float tnum = fnum + snum;

            System.out.println("The answer is " + tnum + ".");

            System.out.println(" ");

            System.out.println("Please select an operation.");
            System.out.println("0: Quit");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");

            choice = input.next();

              }

        while (choice.equals("2")) {
            System.out.println("Please enter your first number.");
            float fnum =input.nextFloat();
            System.out.println("Please enter your second number.");
            float snum = input.nextFloat();
            Float tnum = fnum - snum;

            System.out.println("The answer is " + tnum + ".");

            System.out.println(" ");

            System.out.println("Please select an operation.");
            System.out.println("0: Quit");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");

            choice = input.next();
              }

        while (choice.equals("3")) {
            System.out.println("Please enter your first number.");
            float fnum =input.nextFloat();
            System.out.println("Please enter your second number.");
            float snum = input.nextFloat();
            Float tnum = fnum * snum;

            System.out.println("The answer is " + tnum + ".");

            System.out.println(" ");

            System.out.println("Please select an operation.");
            System.out.println("0: Quit");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");

            choice = input.next();
              }

        while (choice.equals("4")) {
            System.out.println("Please enter your first number.");
            float fnum =input.nextFloat();
            System.out.println("Please enter your second number.");
            float snum = input.nextFloat();
            Float tnum = fnum / snum;

            System.out.println("The answer is " + tnum + ".");

            System.out.println(" ");

            System.out.println("Please select an operation.");
            System.out.println("0: Quit");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");

            choice = input.next();
             }

        while (choice.equals("0")) {
            System.out.println("The program is complete.");

        break;}

        }
    }
