package com.pctc.test;

import com.pctc.service.Worker;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWorker {

    @Test
    public void TestWokerSpring(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Worker worker = (Worker)context.getBean("worker");
        System.out.println("工人使用"+worker.getProductionTool().getProductionName()+"工作，每天"+worker.getTrafficTool().getTrafficName()+"上班");


    }
}
