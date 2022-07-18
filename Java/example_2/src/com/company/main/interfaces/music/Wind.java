package com.company.main.interfaces.music;

public class Wind extends Instrument {
    @Override
    public void play() {
        System.out.println("wind play");
    }

    @Override
    public String what() {
        return "wind";
    }

    @Override
    public void adjust() {
        System.out.println("wind adjusting");
    }
}
