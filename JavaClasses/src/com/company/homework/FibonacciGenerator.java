package com.company.homework;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {
    List<Integer> fibos = new ArrayList<>();
    public FibonacciGenerator() {
        fibos.add(0,0);
    }

    public static void main(String[] args) {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        for (int i = 3; i<1000; i++) {
            System.out.println("Fibo (" + i  + ") = "+ fibonacciGenerator.getFibonacci(i));
        }
    }

    public int getFibonacci(int n) {
        if (fibos.size() > n) {
            return fibos.get(n);
        }
        if (n == 1) {
            fibos.add(1,1);
            return 1;
        } else if (n == 2) {
            fibos.add(2,1);
            return 1;
        }
        fibos.add(n, getFibonacci(n-2) + getFibonacci(n-1));
        return getFibonacci(n-2) + getFibonacci(n-1);
    }

}
