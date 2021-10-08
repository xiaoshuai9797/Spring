package com.pctc.test;

import com.pctc.service2.DateType;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService2 {


    @Test
    public void TestDateType(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        DateType dateType = (DateType)context.getBean("dateType");
        System.out.println(dateType);
        System.out.println(dateType.getDateValue());
    }
}
