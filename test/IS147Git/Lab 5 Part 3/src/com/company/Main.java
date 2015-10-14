package com.company;
//Ronald Jones  jones27@umbc.edu
public class Main {

    public static void main(String[] args) {

        Book book = new Book();

        String author = "Ronald Jones";
        String title = "I Love Java!";
        int pagenum = 100;
        int price = 20;

        book.bookInfo(author, title, pagenum, price);

    }
}

