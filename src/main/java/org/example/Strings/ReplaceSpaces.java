package org.example.Strings;

public class ReplaceSpaces {
    public static String replaceSpaces(String str) {
        return str.replace(" ", "%20");
    }

    public static void main(String[] args) {
        String str = "Mr John Smith";
        System.out.println("Modified string: " + replaceSpaces(str));
    }
}
