package org.example.Arrays;

import java.util.Arrays;

public class LeftRotate {
    public static void leftRotateByOne(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        leftRotateByOne(array);
        System.out.println("Array after left rotation: " + Arrays.toString(array));
    }
}
