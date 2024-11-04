package org.example.Backtracking;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 12345;

        System.out.println("Sum of digits: " + sumOfDigits(num));
    }
}
