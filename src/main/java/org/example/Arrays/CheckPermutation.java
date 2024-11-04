package org.example.Arrays;

import java.util.Arrays;

public class CheckPermutation {
    public static boolean arePermutations(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {3, 2, 1};
        System.out.println("Are arrays permutations of each other? " + arePermutations(array1, array2));
    }
}
