package org.example;

public class EvenNumbers {
    public static void printEvenNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;  // example input
        printEvenNumbers(n);
    }
}
