package org.example.Searching;

public class TernarySearch {
    public static int ternarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == target) {
                return mid1;
            } else if (arr[mid2] == target) {
                return mid2;
            } else if (arr[mid1] < target) {
                left = mid1 + 1;
            } else if (arr[mid2] > target) {
                right = mid2 - 1;
            } else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = ternarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}
