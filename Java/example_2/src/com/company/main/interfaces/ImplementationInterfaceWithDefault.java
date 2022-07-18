package com.company.main.interfaces;

public class ImplementationInterfaceWithDefault  implements InterfaceWithDefault{
    @Override
    public void firstMethod() {
        System.out.println("first Method");
    }

    @Override
    public void secondMethod() {
        System.out.println("second Method");
    }

    public static void main(String[] args) {
        InterfaceWithDefault i = new ImplementationInterfaceWithDefault();
        i.firstMethod();
        i.secondMethod();
        i.defaultMethod();
    }
}
