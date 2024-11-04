package org.example.Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] arr, int positions) {
        int n = arr.length;
        positions %= n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, positions - 1);
        reverse(arr, positions, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int positions = 2;
        rotate(array, positions);
        System.out.println("Rotated array: " + Arrays.toString(array));
    }
}
