package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)    {
        Scanner alpha = new Scanner(System.in);
        String name = null;

        int age = 45;
        int hours = 8;
        double payrate = 20.00;
        double grosspay = 0;

        System.out.println("What is your name?");
        name = alpha.next();

        System.out.println("What is your age?");
        age = alpha.nextInt();

        System.out.println("How long did you work this week?");
        hours = alpha.nextInt();

        System.out.println("How much do you get paid every hour?");
        payrate = alpha.nextDouble();

        grosspay = hours*payrate;

        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old.");
        System .out.println("You worked " + hours + " this week.");
        System.out.println("You are paid " + payrate + " dollars an hour.");
        System.out.println("Your grosspay is  " + grosspay);

    }
}
