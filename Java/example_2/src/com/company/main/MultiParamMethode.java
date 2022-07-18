package com.company.main;

public class MultiParamMethode {

    public static int somme(int... tab) {
        int res = 0;
        for (int elt : tab)  res += elt;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(somme(1,2,3,4,5));
    }

}
