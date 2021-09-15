package com.company.class5;

public class KnowingPrimitives {

    public static void main(String[] args) {
        byte thisIs8Bits = (byte)252;
        boolean flag = false; // this is just true | false
        System.out.println(thisIs8Bits);
        for (byte i= 0; i<1000; i++) {
            System.out.println(i + " = " + (char)i);
        }
    }

}
