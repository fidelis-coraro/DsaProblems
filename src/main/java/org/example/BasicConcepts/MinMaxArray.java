package org.example;

public class MinMaxArray {
    public static void findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};  // example input
        findMinMax(numbers);
    }
}
