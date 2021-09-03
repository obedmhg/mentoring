package com.company.class2;

import javax.swing.*;

public class Class2 {

    public static void main(String[] args) {
        try {
            String name = JOptionPane.showInputDialog("Como te llamas?");
            String age = JOptionPane.showInputDialog("cuantos años tienes?");
            MyJOptionPane.showMessageDialog(null, "Hola " + name + " tienes " + (Double.parseDouble(age) * 365) + " dias");
            JOptionPane.showMessageDialog(null, "Hola " + name + " tienes " + (Double.parseDouble(age) * 365) + " dias", "Here is the title", 2);
            String address = JOptionPane.showInputDialog("¿Cuál es tu dirección?");
            String hobby = JOptionPane.showInputDialog("Cuál es tu Hobby?");
            String height = JOptionPane.showInputDialog("Cual es tu estatura?");
            String weight = JOptionPane.showInputDialog("Cual es tu peso?");
            Person person = new Person();
            person.setName(name);
            person.setAge(age);
            person.setAddress(address);
            person.setHobby(hobby);
            person.setHeight(height);
            person.setWeight(weight);
            JOptionPane.showMessageDialog(null, person.toString());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Hola parece que algun dato no es correcto");
        }

    }

}
