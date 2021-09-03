package com.company;

public class Triangulo extends Rectangulo {
    @Override
    public String getName() {
        return "Triangulo";
    }

    @Override
    public int getSides() {
        return 3;
    }

    @Override
    public double getArea(int base, int altura) {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return getName() + " It is on memory at: " +super.toString() ;
    }
}
