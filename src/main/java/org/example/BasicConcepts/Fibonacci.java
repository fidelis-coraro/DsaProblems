package org.example;

public class Fibonacci {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
}
    public static void main(String[] args) {
        int n = 10;  // example input
        printFibonacci(n);
    }
}