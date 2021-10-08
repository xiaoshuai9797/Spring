package com.pctc.service4;

import org.springframework.beans.factory.FactoryBean;

public class MusicBoxFactory2 implements FactoryBean {

    public MusicBoxFactory2(){
        System.out.println("默认构造方法");
    }

    public Object getObject() throws Exception{
        return new IMusicBox() {
            @Override
            public void play() {
                System.out.println("play piano");
            }
        };
    }

    public Class getObjectType(){
        System.out.println("getObjectType()");
        return IMusicBox.class;
    }

    public boolean isSiongleton(){
        System.out.println("isSingleton");
        return false;
    }
}
