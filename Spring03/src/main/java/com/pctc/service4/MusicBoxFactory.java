package com.pctc.service4;

public class MusicBoxFactory {

    public MusicBoxFactory(){
        System.out.println("默认构造方法");
    }

    public static IMusicBox createMusicBox(){
        return new IMusicBox() {
            @Override
            public void play() {
                System.out.println("play piano");
            }
        };
    }
}
