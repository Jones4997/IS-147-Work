package com.company;
//Ronald Jones jones27@umbc.edu

public class Main {

    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 75;
        add(num1, num2);

        int num3 = 950;
        int num4 = 1548;
        subt(num3, num4);

        int num5 = 791;
        int num6 = 483;
        mult(num5, num6);

        int num7 = 88;
        int num8 = 64;
        divd(num7, num8);

    }

    public static int add(int num1, int num2) {
        int result;
        int sum = num1 + num2;
        System.out.println("The answer is " + sum + ".");
        result = sum;
        return result;  }

    public static int subt(int num3, int num4) {
        int result;
        int subt = num3 - num4;
        System.out.println("The answer is " + subt + ".");
        result = subt;
        return result;  }

    public static int mult(int num5, int num6) {
        int result;
        int mult = num5 - num6;
        System.out.println("The answer is " + mult + ".");
        result = mult;
        return result;  }

    public static int divd(int num7, int num8) {
        int result;
        int divd = num7 - num8;
        System.out.println("The answer is " + divd + ".");
        result = divd;
        return result;  }
}


