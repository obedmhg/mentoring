package com.company.homework;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {
    List<Double> fibos = new ArrayList<>();
    public FibonacciGenerator() {
        fibos.add(0,0d);
    }

    public static void main(String[] args) {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        for (int i = 3; i<1000; i++) {
            System.out.println("Fibo (" + i  + ") = "+ fibonacciGenerator.getFibonacci(i));
            System.out.println("FiboWithMath (" + i  + ") = "+ fibonacciGenerator.getFibonacciUsingMath(i));
            System.out.println("FiboWithFi (" + i  + ") = "+ fibonacciGenerator.getFibonacciUsingFi(i));
        }
    }

    public double getFibonacci(int n) {
        if (fibos.size() > n) {
            return fibos.get(n);
        }
        if (n == 1) {
            fibos.add(1,1d);
            return 1;
        } else if (n == 2) {
            fibos.add(2,1d);
            return 1;
        }
        fibos.add(n, getFibonacci(n-2) + getFibonacci(n-1));
        return getFibonacci(n-2) + getFibonacci(n-1);
    }

    public double getFibonacciUsingMath(int n) {
        double innerExp1 = Math.pow(((1 + Math.sqrt(5))/2),n);
        double innerExp2 = Math.pow(((1 - Math.sqrt(5))/2),n);
        return 1 / Math.sqrt(5) * (innerExp1 - innerExp2);
    }

    public double getFibonacciUsingFi(int n) {
        double fi = (1 + Math.sqrt(5))/2;
        return 1 / Math.sqrt(5) * (Math.pow(fi,n) - Math.pow(-1/fi, n));
    }

}
