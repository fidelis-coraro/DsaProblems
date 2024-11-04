package org.example.Sorting;
import java.util.Arrays;

public class CountingSort {
    public static void countSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];

        // Store the count of each element
        for (int num : arr) {
            count[num - min]++;
        }

        // Modify the count array to store the actual position of the elements
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy the sorted elements back to the original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        int min = 0;
        int max = 2;
        countSort(arr, min, max);
        System.out.println(Arrays.toString(arr));
    }
}
