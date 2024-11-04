package org.example.Stack;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();


        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char topChar = stack.pop();
                if (ch == ')' && topChar != '(') {
                    return false;
                } else if (ch == ']' && topChar != '[') {
                    return false;
                } else if (ch == '}' && topChar != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr1 = "([]{})";
        String expr2 = "[()]{}";
        String expr3 = "[(])";

        System.out.println(isBalanced(expr1)); // Output: true
        System.out.println(isBalanced(expr2)); // Output: true
        System.out.println(isBalanced(expr3)); // Output: false
    }
}
