package com.pctc.test;

import com.pctc.service5.Computer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class TestService5 {

    @Test
    public void TestService5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");

        Computer computer = (Computer)context.getBean("computer");
        computer.run();
    }
}
