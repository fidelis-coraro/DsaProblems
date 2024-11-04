package org.example.Strings;

public class StringRotation {
    public static boolean isRotation(String str1, String str2) {
        return str1.length() == str2.length() && (str1 + str1).contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println("Is rotation? " + isRotation(str1, str2));
    }
}
