package org.example;

public class SumOfDigits {
    public static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 1234;  // example input
        System.out.println("Sum of digits: " + sumDigits(number));
    }
}
