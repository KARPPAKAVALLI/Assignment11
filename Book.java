package com.assignment11;

import java.util.ArrayList;

public class Book {
    //1. Add a constructor to the Book class already created.
    // Write a function to add books using constructors to an array of <Book> objects, and display all the books added.
    String title;
    String author;
    int isbn;
    static int bookCount=0;
    {
        bookCount++;
    }

    Book(String title,String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public void display(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("ISBN: "+this.isbn);
    }
    public static int totalBooks(){
        return bookCount;
    }

    public static void main(String[] args) {
        Book[] books=new Book[3];
        books[0]=new Book("Percy Jackson","Rick Riordan",1990);
        books[1]=new Book("Heros Of Olympus","Rick Riordan",2000);
        books[2]=new Book("Harry Potter","JK Rowling",1999);

        for (Book b:books) {
            b.display();
            System.out.println();
        }
    }
}
