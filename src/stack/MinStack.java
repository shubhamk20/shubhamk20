package stack;

import java.util.Stack;

// LeetCode 155
// https://leetcode.com/problems/min-stack/description/

public class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> minStack;
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }

    public MinStack() {
        st = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    void push(int val) {
        st.add(val);
        val = Math.min(val, minStack.isEmpty()?val:minStack.peek());
        minStack.add(val);
        // System.out.println("st: "+st);
        // System.out.println("minStack: "+minStack);
    }
    
    void pop() {
        st.pop();
        minStack.pop();
        // System.out.println("st: "+st);
        // System.out.println("minStack: "+minStack);
    }
    
    int top() {
        return st.peek();
    }
    
    int getMin() {
        return minStack.peek();
    } 
}
