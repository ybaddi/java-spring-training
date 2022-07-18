package com.company.main.interfaces.music;

public class Main {

    public static void playAll(Instrument[] musicTeam){
        for(Instrument item : musicTeam) item.play();
    }
    public static void main(String[] args) {
        Instrument[] musicTeam = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new WoodWind()
        };
        playAll(musicTeam);
    }


}
