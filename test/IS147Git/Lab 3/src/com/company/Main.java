package com.company;

import java.util.Scanner;
import java.util.Random;
//Ronald Jones jones27@umbc.edu
//This script creates a password using the person's name and a randomly generated number.
public class Main {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String firstname;
        firstname = name.next();

        System.out.println("Please enter your last name.");
        String lastname;
        lastname = name.next();

        String nameOne = "firstname";
        "firstname".toUpperCase().substring(firstname.length() - 1);

        String nameTwo = "lastname";
        "lastname".substring(0, 3).toLowerCase();

        Random rand = new Random();
        int random = rand.nextInt(100) + 9;

        System.out.println("Your password is " + firstname.substring(firstname.length() - 1).toUpperCase()+ (int) random
                            + lastname.substring(0, 3).toLowerCase() + ".");


    }
}
