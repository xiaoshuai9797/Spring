package com.pctc.test;


import com.pctc.service7.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类，使用spring框架
 */
public class TestService7 {


    @Test
    public void testHello(){

        //spring容器初始化
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext7.xml");

		Book book=(Book)context.getBean("book"); //对象是有spring容器创建，客户端直接拿来使用，思想叫做IOC,反转控制
        System.out.println(book);


        Book book1=(Book)context.getBean("book"); //对象是有spring容器创建，客户端直接拿来使用，思想叫做IOC,反转控制
        System.out.println(book1);


    }
}
