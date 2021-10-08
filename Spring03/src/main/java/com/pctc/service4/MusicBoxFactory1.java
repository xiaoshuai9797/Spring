package com.pctc.service4;

public class MusicBoxFactory1 {
    public MusicBoxFactory1(){
        System.out.println("默认构造方法");
    }

    public IMusicBox createMusicBox(){
        return new IMusicBox() {
            @Override
            public void play() {
                System.out.println("play music");
            }
        };
    }
}
