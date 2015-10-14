package com.company;
//Ronald Jones jones27@umbc.edu
public class Main {

    public static void main(String[] args) {

        String greeting = "Hello World!";
        String farewell = "GOODBYE WORLD!";

        System.out.println(greeting.length());

        System.out.println(greeting.substring(4, 11));

        System.out.println(greeting.indexOf("W"));

        System.out.println(greeting.charAt(8));

        System.out.println(greeting.toUpperCase());

       for (String retval: greeting.split(" ")) {
        System.out.println(retval); }

       CharSequence sequence = "orld";
       boolean retval = greeting.contains(sequence);
        System.out.println("It is " + retval + " that this string contains the character sequence orld.");

       retval = greeting.equalsIgnoreCase(farewell);
        System.out.println("It is " + retval + " that the strings are equal.");

    }
}

