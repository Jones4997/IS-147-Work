package com.company;
import javax.swing.*;
import java.util.Scanner;
//Ronald Jones jones27@umbc.edu
//This script allows the person to perform various operations.
public class Main {
    public static void main(String[] args) {
        float numberOne, numberTwo;
        Scanner input = new Scanner(System.in);

        System.out.println("Select which operation you wish to perform.");
        JOptionPane.showMessageDialog(null, "Enter the letter for the operation you wish to perform.");
        String choice = JOptionPane.showInputDialog("A=equality B=greater or less than C=greater than, less than, or equal");

        if (choice.equals("A")) {
            System.out.println("Please enter a value for your first number.");
            numberOne = input.nextFloat();

            System.out.println("Please enter a value for your second number.");
            numberTwo = input.nextFloat();

            if (numberOne == numberTwo) {
                System.out.println("The numbers are equal."); }

                else if (numberOne != numberTwo) {
                System.out.println("The numbers are not equal."); }
        }

        else if (choice.equals("B")) {
            System.out.println("Please enter a value for your first number.");
            numberOne = input.nextFloat();

            System.out.println("Please enter a value for your second number.");
            numberTwo = input.nextFloat();

            if (numberOne > numberTwo) {
                System.out.println("The first number is greater than the second number."); }

                else if (numberOne < numberTwo) {
                System.out.println("The first number is less than the second number."); }
        }

        else if (choice.equals("C")) {
            System.out.println("Please enter your first number.");
            numberOne = input.nextFloat();

            System.out.println("Please enter your second number.");
            numberTwo = input.nextFloat();

            if (numberOne >= numberTwo) {
                System.out.println("The first number is greater than or equal to the second number."); }

                else if (numberOne <= numberTwo) {
                System.out.println("The first number is less than or equal to the second number."); }
        }
    }
}