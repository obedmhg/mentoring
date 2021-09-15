package com.company.homework;

import javax.swing.*;
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
            JOptionPane.showInputDialog("Write the Fibonacci sequence number that you are looking for:");
            System.out.println("Fibo (" + i  + ") = "+ fibonacciGenerator.getFibonacci(i));
            System.out.println("Fibo (import)");
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
