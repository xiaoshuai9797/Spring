package com.pctc.test;

import com.pctc.service.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

    @Test
    public void TestStudentSpring(){
        //不用Spring框架
     /*   Student student = new Student();
        student.setName("肖帅");
        student.setAge(21);
        student.setSchool("南昌航空大学科技学院");
       System.out.println(student.getName()+"---"+student.getAge()+"---"+student.getSchool());*/


     //使用Spring框架

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student.getName()+"---"+student.getAge()+"---"+student.getSchool());

    }

}
