package com.company;

public class Cuadrado extends Rectangulo {

    public static final int HOW_MANY_SIDES = 4;

    public static String getInformation() {
        return "Cuadro tiene " + HOW_MANY_SIDES + " Lados";
    }


    @Override
    public String getName() {
        return "Cuadro and his parent is " + super.getName();
    }

    public void doPrintSomething() {
        doNothingPrivate();
    }


}
