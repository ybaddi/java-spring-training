package com.company.example1.main;

public class Main {
    public static void main(String[] args) {
        Personne p = new Personne("Cap", "gemini", 45);
        p.iMiseEnForm.afficherDetails();
        System.out.println(p.iMiseEnForm.getClass());
        System.out.println(p.iMiseEnForm.getClass().getSuperclass());
    }
}
