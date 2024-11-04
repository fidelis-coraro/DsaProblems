package org.example.Strings;

public class Permutations {
    public static void findPermutations(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            findPermutations(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Permutations of " + str + ":");
        findPermutations(str, "");
    }
}
