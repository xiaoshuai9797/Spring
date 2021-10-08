package com.pctc.service;


import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Student {

    //@Autowired
    @Resource
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }




}
