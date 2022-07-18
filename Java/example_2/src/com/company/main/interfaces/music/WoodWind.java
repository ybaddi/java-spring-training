package com.company.main.interfaces.music;

public class WoodWind extends Wind{

    @Override
    public void play() {
        System.out.println("WoodWind play");
    }

    @Override
    public String what() {
        return "WoodWind";
    }
}
