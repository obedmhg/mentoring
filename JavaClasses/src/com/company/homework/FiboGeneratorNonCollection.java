package com.company.homework;

import java.util.ArrayList;
import java.util.List;

public class FiboGeneratorNonCollection {

    public static void main(String[] args) {
        FiboGeneratorNonCollection fibonacciGenerator = new FiboGeneratorNonCollection();
        for (int i = 3; i<1000; i++) {
            System.out.println("Fibo (" + i  + ") = "+ fibonacciGenerator.getFibonacci(i));
        }
    }

    public int getFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        return getFibonacci(n-2) + getFibonacci(n-1);
    }



}
