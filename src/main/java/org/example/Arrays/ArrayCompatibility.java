package org.example.Arrays;

public class ArrayCompatibility {
    public static boolean areCompatible(int[] arr1, int[] arr2) {
        return arr1.length == arr2.length;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        System.out.println("Are arrays compatible? " + areCompatible(array1, array2));
    }
}
