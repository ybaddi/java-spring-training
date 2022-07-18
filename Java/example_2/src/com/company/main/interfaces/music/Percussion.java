package com.company.main.interfaces.music;

public class Percussion extends Instrument {
    @Override
    public void play() {
        System.out.println("Percussion play");
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println("Percussion adjusting");
    }
}
