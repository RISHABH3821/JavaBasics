package com.rishabh.javabasicsexercise1;

public class FibonacciCalculator {
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        System.out.println("First 10 fibonacci no. ");
        for (int i = 0; i < 10; i++) {
            System.out.format("%d ", fibonacciCalculator.fibonacci(i + 1));
        }

    }

}
