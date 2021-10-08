package com.pctc.service3;

public class Student {
    private Book book;


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student(Book book) {
        this.book = book;
        System.out.println("define");
    }

    public Student() {
        System.out.println("default");
    }
}
