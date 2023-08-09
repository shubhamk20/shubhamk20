package stack;

import java.util.Stack;

// LeetCode 150
// https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

public class EvaluateReversePolish {
    public static void main(String[] args) {
        String[] tokens = {"2","1","-","3","*"};
        // String[] tokens = {"4","13","5","/","+"};
        // String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }

    static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                stack.add(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b - a);
            } else if (token.equals("*")) {
                stack.add(stack.pop() * stack.pop());
            } else if (token.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b / a);
            } else {
                stack.add(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
