package org.example.Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1; // Length of array without duplicates
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(sortedArray);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(sortedArray, newLength)));
    }
}

