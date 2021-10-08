package com.pctc.test;

import com.pctc.service2.Box;
import com.pctc.service2.Paper;
import com.pctc.service2.Printer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrinter {
    @Test
    public void TestPrinter(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Printer printer = (Printer)context.getBean("c");
        Box box = (Box)context.getBean("b");
        Paper paper = (Paper)context.getBean("p");
        box.setColor("黑色");
      /*  paper.setSize("A4");*/
        printer.printer();
    }
}
