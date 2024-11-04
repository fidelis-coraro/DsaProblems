package org.example.Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLength {
    public static void main(String[] args) {
        String[]
        arr = {"apple", "banana", "kiwi", "orange"};
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));
    }
}
