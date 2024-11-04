package org.example.Arrays;

import java.util.HashSet;

public class FindRepeatingElements {
    public static void findRepeating(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.println("Repeating element: " + num);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1};
        findRepeating(array);
    }
}
