package org.example.Strings;

public class TitleCase {
    public static String toTitleCase(String str) {
        String[] words = str.toLowerCase().split(" ");
        StringBuilder titleCase = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return titleCase.toString().trim();
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Title case: " + toTitleCase(str));
    }
}
