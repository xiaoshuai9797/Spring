package com.pctc.service2;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "p")
public class Paper {
@Value("A3")//给基本属性赋值，在测试中用set重新赋值可覆盖Value
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void paper(){
        System.out.println("使用"+size+"纸张");
    }

}
