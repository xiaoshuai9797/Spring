package com.pctc.test;

import com.pctc.service3.Book;
import com.pctc.service3.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService3 {
    @Test
    public void TestService3(){
        //通过构造方法注入的测试
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Student student = (Student)context.getBean("student");
        System.out.println(student.getBook().getBookName());

        Student student1 = (Student)context.getBean("student1");
        System.out.println(student.getBook().getBookName());
    }
}
