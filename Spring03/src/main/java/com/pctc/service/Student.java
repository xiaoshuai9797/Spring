package com.pctc.service;

public class Student {
    private Book book;

    public Student(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
