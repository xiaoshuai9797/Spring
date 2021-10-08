package com.pctc.test;

import com.pctc.service.Book;
import com.pctc.service.Student;
import com.pctc.service1.ProductServlet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类，使用spring框架
 */
public class TestService1 {


    @Test
    public void testHello(){

        //spring容器初始化
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        ProductServlet productServlet=(ProductServlet)context.getBean("aaa");

        //ProductServlet productServlet=(ProductServlet)context.getBean("productServlet");

		System.out.println(productServlet);
        productServlet.execute();



    }
}
