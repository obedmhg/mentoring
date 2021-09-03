package com.company.class3;

import javax.swing.*;

public class FlowControlExamples {

    public static void main(String[] args) {

        String howMany = JOptionPane.showInputDialog("Cuantos ciclos?");
        System.out.println("Numbers that are multiple for 3 and 5");
        for (int i=0; i<Integer.parseInt(howMany); i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Numbers that are multiple for 3 or 5");
        for (int i=0; i<Integer.parseInt(howMany); i++) {
            if (i%3 == 0 || i%5 == 0) {
                System.out.println(i);
            }
        }

        for (int i=0; i<3; i++) {
            for (int j=0; j<10; j++) {
                System.out.println("i=" +i + ",j=" +j);
            }
        }

    }

    public static void ifExamples() {
        String justAString = JOptionPane.showInputDialog("Una cadena");

        if (justAString.length()>0  && justAString.length() < 5) {
            System.out.println("String corto");
        } else if (justAString.length()>5  && justAString.length() < 10) {
            System.out.println("String mediano");
        } else {
            System.out.println("String largo");
        }
    }


}
