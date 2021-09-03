package com.company.class4;

public class PrimeNumbers {

    public static void main(String[] args) {

        for (int i=0; i< 1000; i++) {
            boolean isDivisible = false;
            if (isPair(i)) {
                continue;
            }
            for (int j=3; j<i; j++) {
                if (i%j == 0) {
                    isDivisible = true;
                    break;

                }
            }
            if (isDivisible) {
                continue;
            }
            System.out.println(i);
        }

    }

    public static boolean isPair(int number) {
        boolean isPair = false;
        if (number%2 == 0) {
            isPair = true;
        }
        return isPair;
    }


    /**
     * Describen que hace el metodo
     */
    public static void forFlow() {
        // Ejemplo de comentario en una linea para developers

        /*

         if (contador == 4) {
                System.out.println(contador + " bye bye");
                break;
            }
         */

        for(int contador=0; contador < 5; contador++) {
            if (contador == 4) {
                System.out.println(contador + " bye bye");
                break;
            }
            if (contador == 3) {
                System.out.println(contador + " continue");
                continue;
            }
            System.out.println(contador);
        }
    }

}
