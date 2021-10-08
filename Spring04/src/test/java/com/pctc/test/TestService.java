package com.pctc.test;

import com.pctc.service.Book;
import com.pctc.service.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {


    @Test
    public void TestService(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = (Book)context.getBean("bookbook");
        book.setBookName("java");
        Student student = (Student)context.getBean("student");
        System.out.println(student.getBook().getBookName());
    }
}
