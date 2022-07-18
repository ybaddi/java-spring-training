package com.company.main.interfaces;


interface Concept{
    void item1();
    void item2();
}

public class Implementation implements Concept {
    @Override
    public void item1() {
        System.out.println("item 1");
    }

    @Override
    public void item2() {
        System.out.println("item 2");
    }
}
