package stack;

import java.util.Stack;

// LeetCode 20
// https://leetcode.com/problems/valid-parentheses/description/

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' ||ch == '['){
                st.add(ch);
            }else{
                if(st.size() !=0){
                    if((ch == ')' && st.peek() == '(') ||
                    (ch == '}' && st.peek() == '{')||
                    (ch == ']' && st.peek() == '[')){
                        st.pop();
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        return st.empty();
    }
}
