package org.example;

public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 48, num2 = 18;  // example input
        System.out.println("GCD: " + gcd(num1, num2));
    }
}
