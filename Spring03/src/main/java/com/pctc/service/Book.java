package com.pctc.service;

public class Book {
    private  String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }
    public Book() {

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
