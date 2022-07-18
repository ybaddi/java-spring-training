package com.company.example2.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personne> ps = new ArrayList<Personne>();
        Personne p = new Personne("Cap1", "gemini1", 45);
        ps.add(p);
        Personne p2 = new Personne("Cap2", "gemini2", 45);
        ps.add(p2);
        Personne p3 = new Personne("Cap3", "gemini3", 45);
        ps.add(p3);
        Personne p4 = new Personne("Cap4", "gemini4", 45);
        ps.add(p4);
        Personne p5 = new Personne("Cap5", "gemini5", 45);
        ps.add(p5);
        p.iMiseEnForm.afficher();
        System.out.println(p.plus.operationBinaire(2,3));
        p.iMiseEnForm.afficher();
        System.out.println(p.iMiseEnForm.getClass());
        System.out.println(p.iMiseEnForm.getClass().getSuperclass());

        List<String> str = Personne.listTostring(ps);
        for (String item: str){
            System.out.println(item);
        }


    }
}
