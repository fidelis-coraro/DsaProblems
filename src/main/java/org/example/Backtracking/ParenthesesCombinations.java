package org.example.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class ParenthesesCombinations {
    public static void generateParenthesis(int n, int open, int close, String curr, List<String> result) {
        if (curr.length() == 2 * n) {
            result.add(curr);
            return;
        }

        if (open < n) {
            generateParenthesis(n, open + 1, close, curr + "(", result);
        }

        if (close < open) {
            generateParenthesis(n, open, close + 1, curr + ")", result);

        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(n, 0, 0, "", result);
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> combinations = generateParenthesis(n);
        System.out.println(combinations);

    }
}
