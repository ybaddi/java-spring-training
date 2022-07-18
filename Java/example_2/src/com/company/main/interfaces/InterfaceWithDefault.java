package com.company.main.interfaces;

public interface InterfaceWithDefault {
    void firstMethod();
    void secondMethod();
    default void defaultMethod(){
        System.out.println("default Method");
    }
}
