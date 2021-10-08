package com.pctc.service2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("b")
public class Box {
    private String color;

    @Autowired
    private Paper paper;

    public void box(){
        System.out.println("使用"+color+"墨盒");
        paper.paper();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
