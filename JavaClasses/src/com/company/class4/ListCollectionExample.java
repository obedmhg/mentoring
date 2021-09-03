package com.company.class4;

import javax.swing.*;

import static com.company.class4.PrimeNumbers.isPair;

import java.util.ArrayList;
import java.util.List;

public class ListCollectionExample {

    public static void main(String[] args) {
        List primes = new ArrayList();
        List pairs = new ArrayList();
        List even = new ArrayList();
        String whichPrime = JOptionPane.showInputDialog("Cual primo quieres?");
        int whichPrimeInt = Integer.parseInt(whichPrime);
        for (int i=0; i< 1000; i++) {
            if (primes.size() == whichPrimeInt) {
                break;
            }
            boolean isDivisible = false;
            if (isPair(i)) {
                pairs.add(i);
                continue;
            }
            for (int j=3; j<i; j++) {
                if (i%j == 0) {
                    isDivisible = true;
                    break;

                }
            }
            if (isDivisible) {
                even.add(i);
                continue;
            }
            primes.add(i);
        }
        System.out.println("Primes " + primes.toString());
        System.out.println("Pairs " + pairs.toString());
        System.out.println("Evens " + even.toString());

        System.out.println("The prime No " + whichPrime + " is " + primes.get(whichPrimeInt-1));

    }

}
