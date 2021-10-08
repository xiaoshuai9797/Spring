package com.pctc.test;

import com.pctc.service4.IMusicBox;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService4 {

    @Test
    public void TestService4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");


        IMusicBox musicBox=(IMusicBox)context.getBean("musicBox");
        musicBox.play();

        IMusicBox musicBox1 = (IMusicBox)context.getBean("musicBox1");
        musicBox1.play();

        IMusicBox musicBox2 = (IMusicBox)context.getBean("musicBox2");
        musicBox2.play();

    }
}
