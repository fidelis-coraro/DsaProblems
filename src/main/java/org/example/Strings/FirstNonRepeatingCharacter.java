package org.example.Strings;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeating(String str) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (countMap.get(c) == 1) return c;
        }
        return '_'; // Default character if no unique character found
    }

    public static void main(String[] args) {
        String str = "swiss";
        System.out.println("First non-repeating character: " + findFirstNonRepeating(str));
    }
}
