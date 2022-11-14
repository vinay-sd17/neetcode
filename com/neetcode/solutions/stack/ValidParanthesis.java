package com.neetcode.solutions.stack;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParanthesis {

  public static void main(String[] args) {
    System.out.println(isValid("()"));
  }

  public static boolean isValid(String s) {
    Stack<Character> characters = new Stack<>();
    if (s.length() % 2 != 0) {
      return false;
    }
    for (char c : s.toCharArray()) {
      if (characters.isEmpty() && (c == ')' || c == '}' || c == ']')) {
        return false;
      }
      if (!characters.isEmpty()) {
        if ((characters.peek() == '(' && c == ')') || (characters.peek() == '{' && c == '}') || (
            characters.peek() == '[' && c == ']')) {
          characters.pop();
        } else {
          characters.push(c);
        }
      } else {
        characters.push(c);
      }
    }
    return characters.size() == 0;
  }

}
