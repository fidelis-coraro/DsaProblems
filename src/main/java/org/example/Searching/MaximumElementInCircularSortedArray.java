package org.example.Searching;

public class MaximumElementInCircularSortedArray {
    public static int findMaximum(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];

    }

    public static void main(String[] args) {
        int[] nums= {11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxElement = findMaximum(nums);
        System.out.println("Maximum element: " + maxElement);
    }
}
