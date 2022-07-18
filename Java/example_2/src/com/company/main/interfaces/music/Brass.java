package com.company.main.interfaces.music;

public class Brass extends Wind{
    @Override
    public void play() {
        System.out.println("Brass play");
    }


    @Override
    public void adjust() {
        System.out.println("Brass adjusting");
    }
}
