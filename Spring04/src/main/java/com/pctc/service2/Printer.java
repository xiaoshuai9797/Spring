package com.pctc.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("c")
public class Printer {
    @Autowired
    private Box box;

    public void printer(){
        System.out.println("开始打印");
        box.box();
    }
}
