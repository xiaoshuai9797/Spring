package com.pctc.service5;

public class Computer {
    private Host host;
    private DisPlay disPlay;

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public DisPlay getDisPlay() {
        return disPlay;
    }

    public void setDisPlay(DisPlay disPlay) {
        this.disPlay = disPlay;
    }


    public void run(){
        System.out.println(host.run());
        System.out.println(disPlay.start());

    }
}
