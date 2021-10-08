package com.pctc.test;

import com.pctc.service.Book;
import com.pctc.service.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class TestService {

    @Test
    public void TestService(){
        //通过构造方法注入的测试
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = (Book)context.getBean("book");
        System.out.println(book.getBookName());

        Student student = (Student)context.getBean("student");
        System.out.println(student.getBook().getBookName());
    }
}
