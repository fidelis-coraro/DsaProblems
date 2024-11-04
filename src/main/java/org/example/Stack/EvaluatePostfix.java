package org.example.Stack;

import java.util.Stack;

public class EvaluatePostfix {
    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();


        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;

                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "231*+9-";
        System.out.println("postfix evaluation: " + evaluatePostfix(exp));
    }
}
