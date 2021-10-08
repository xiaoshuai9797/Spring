package com.pctc.test;

import com.pctc.service.Book;
import com.pctc.service.Student;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testStudent(){
        //用Sping框架的测试，容器帮助创建对象，我们只需要拿对象就行
      /*  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student.getBook().getBookName());*/


        //不用Spring框架的测试，创建对象
        Book book = new Book();
        book.setBookName("高等数学");

        Student student = new Student();
        student.setBook(book);
        System.out.println(student.getBook().getBookName());
    }
}
