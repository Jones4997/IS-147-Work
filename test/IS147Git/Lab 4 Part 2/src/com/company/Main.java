package com.company;
//Ronald Jones jones27@umbc.edu
//This code prints a triangle.
public class Main {

    public static void main(String[] args) {


        for (int row = 10; row >= 1; row--) {
            for (int star = 1; star <= row; star++)
                System.out.print("*");

            System.out.println();


        }
    }
}
