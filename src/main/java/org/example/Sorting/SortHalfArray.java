package org.example.Sorting;

import java.util.Arrays;

public class SortHalfArray {
    public static void sortFirstHalf(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        // Sort the first half using any sorting algorithm (e.g., insertion sort)
        for (int i = 1; i < mid; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        sortFirstHalf(arr);
        System.out.println(Arrays.toString(arr));
    }
}
