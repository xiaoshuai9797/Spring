package com.pctc.service1;

public class Book {
    private  String bookName;


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("bookName='").append(bookName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
