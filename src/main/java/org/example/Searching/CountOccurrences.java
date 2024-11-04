package org.example.Searching;

public class CountOccurrences {
    public static int countOccurrences(int[] arr, int target) {
        int firstOccurrence = firstOccurrence(arr, target);
        if (firstOccurrence == -1) {
            return 0;
        }

        int lastOccurrence = lastOccurrence(arr, target);
        return lastOccurrence - firstOccurrence + 1;
    }

    private static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Look for earlier occurrences
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Look for later occurrences
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int target = 2;
        int count = countOccurrences(arr, target);
        System.out.println("Count of " + target + ": " + count);
    }
}

