package org.example.Stack;

import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--)
        {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums= {1, 3, 2, 4};
        int[] nextGreater = nextGreaterElement(nums);
        System.out.println(Arrays.toString(nextGreater)); // Output: [3, 4, 4, -1]
    }
}
