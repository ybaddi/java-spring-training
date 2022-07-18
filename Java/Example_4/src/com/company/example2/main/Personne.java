package com.company.example2.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Personne {
    private String nom;
    private String prenom;
    private int age;

    /*public IMiseEnForm iMiseEnForm = new IMiseEnForm() {
        @Override
        public void afficherDetails() {
            System.out.println("nom = " + nom + ", prenom = " + prenom);
        }
    };*/

    public IMiseEnForm iMiseEnForm = () -> {age =5;System.out.println("nom = " + nom + ", prenom = " + prenom+ ", age = " + age);};
    ICalcul plus = (x , y) ->	{ age =5; return age + x + y;};

    public static List<String> listTostring(List<Personne> personnes){
        Function<Personne, String> personneToString = p -> p.getNom() + " " + p.getPrenom();
        List<String> str = new ArrayList<String>();
        for (Personne p: personnes){
            str.add(personneToString.apply(p));
        }
        return str;
    }


    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
