package com.company;

import javax.swing.*;
import java.util.Scanner;
//Ronald Jones jones27@umbc.edu
//This script allows the person to perform various operations.
public class Main {
    public static void main(String[] args) {
        float numberOne, numberTwo, numberThree;
        Scanner input = new Scanner(System.in);

        System.out.println("Select which operation you wish to perform.");
        JOptionPane.showMessageDialog(null, "Enter the letter for the operation you wish to perform.");
        String choice = JOptionPane.showInputDialog("A=add B=subtract C=multiply D=divide E=remainder F=increase G=decrease");

        if (choice.equals("A")) {
            System.out.println("Please enter a value for your first number.");
            numberOne = input.nextFloat();

            System.out.println("Please enter a value for your second number.");
            numberTwo = input.nextFloat();

            numberThree = numberOne + numberTwo;
            System.out.println("The answer is " + numberThree + "."); }

        else if (choice.equals("B")) {
            System.out.println("Please enter a value for your first number.");
            numberOne = input.nextFloat();

            System.out.println("Please enter a value for your second number.");
            numberTwo = input.nextFloat();

            numberThree = numberOne - numberTwo;
            System.out.println("The answer is " + numberThree + "."); }

        else if (choice.equals("C")) {
            System.out.println("Please enter a value for your first number.");
            numberOne = input.nextFloat();

            System.out.println("Please enter a value for your second number.");
            numberTwo = input.nextFloat();

            numberThree = numberOne * numberTwo;
            System.out.println("The answer is " + numberThree + "."); }

        else if (choice.equals("D")) {
            System.out.println("Please enter a value for your first number.");
            numberOne = input.nextFloat();

            System.out.println("Please enter a value for your second number.");
            numberTwo = input.nextFloat();

            numberThree = numberOne / numberTwo;
            System.out.println("The answer is " + numberThree + "."); }

        else if (choice.equals("E")) {
            System.out.println("Please enter a value for your first number.");
            numberOne = input.nextFloat();

            System.out.println("Please enter a value for your second number.");
            numberTwo = input.nextFloat();

            numberThree = numberOne % numberTwo;
            System.out.println("The answer is " + numberThree + "."); }

        else if (choice.equals("F")) {
            System.out.println("Please enter a number.");
            numberOne = input.nextFloat();

            numberTwo = ++numberOne;
            System.out.println("The answer is " + numberTwo + "."); }

        else if (choice.equals("G")) {
            System.out.println("Please enter a number.");
            numberOne = input.nextFloat();

            numberTwo = --numberOne;
            System.out.println("The answer is " + numberTwo + "."); }
    }
}
