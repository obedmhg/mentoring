package com.company.class3;

import javax.swing.*;

public class Class3Homework {
    public static void main(String[] args) {

        String howMany = JOptionPane.showInputDialog("Cuantos ciclos?");

        System.out.println("Prime numbers: ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<10; j++) {
                System.out.println("i=" +i + ",j=" +j);
            }
        }

    }

}
