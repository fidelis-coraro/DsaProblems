package org.example.Strings;

public class LongestCommonSubstring {
    public static String findLongestCommonSubstring(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        int maxLength = 0;
        int endIndex = 0;

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }
        return str1.substring(endIndex - maxLength, endIndex);
    }

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "zcdemf";
        System.out.println("Longest common substring: " + findLongestCommonSubstring(str1, str2));
    }
}
