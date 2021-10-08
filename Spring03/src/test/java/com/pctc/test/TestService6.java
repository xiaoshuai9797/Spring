package com.pctc.test;

import com.pctc.service6.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类，使用spring框架
 */
public class TestService6 {


    @Test
    public void testHello(){

        //spring容器初始化
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext6.xml");

        Customer customer=(Customer)context.getBean("sonCustomer");
        System.out.println(customer.getCountry());
        System.out.println(customer.getAction());
        System.out.println(customer.getType());

        System.out.println("---------");
        Customer customer1=(Customer)context.getBean("baseCustomer");
        System.out.println(customer1.getCountry());
        System.out.println(customer1.getAction());
        System.out.println(customer1.getType());



    }
}
