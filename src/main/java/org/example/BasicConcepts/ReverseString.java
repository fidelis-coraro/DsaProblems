package org.example;

public class ReverseString {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String text = "Hello";  // example input
        System.out.println("Reversed string: " + reverse(text));
    }
}
