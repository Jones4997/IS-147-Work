package com.company;
//Ronald Jones jones27@umbc.edu
public class Book {

    private String author = "Ronald Jones";
    private String title = "I love Java!";
    private int pagenum = 100;
    private int price = 20;

    public String bookInfo(String author, String title, int pagenum, int price) {

        System.out.println("The author of the book is " + author + ".");
        System.out.println("The title of the book is " + title + ".");
        System.out.println("The number of pages is " + pagenum + ".");
        System.out.println("The price of the book is $" + price + ".");

        String result;
        result = author + title + pagenum + price;
        return result;

    }
}
