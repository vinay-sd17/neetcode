package com.neetcode.solutions.stack;

import java.util.Stack;

// https://leetcode.com/problems/min-stack/description/
public class MinimumStack {

  Stack<Integer> stack = new Stack<>();

  Stack<Integer> minStack = new Stack<>();

  public static void main(String[] args) {

  }

  public MinimumStack() {

  }

  public void push(int val) {
    stack.push(val);
    int min = Math.min(val, minStack.size() == 0 ? val : minStack.peek());
    minStack.push(min);
  }

  public void pop() {
    stack.pop();
    minStack.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return minStack.peek();
  }
}
