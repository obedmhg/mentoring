package com.company;

public class Rectangulo implements Figure {

    @Override
    public String getName() {
        return "Rectangulo";
    }

    @Override
    public int getSides() {
        return 4;
    }

    @Override
    public double getArea(int a, int b) {
        return a*b;
    }


    public void doNothing() {
        System.out.println("Do nothing");
    }

    protected void doNothingPrivate() {
        System.out.println("Do nothing private");
    }

    void doNothingDefault() {
        System.out.println("Do nothing private");
    }

    public final String cantExtend() {
        return "Can't extend this";
    }

}
