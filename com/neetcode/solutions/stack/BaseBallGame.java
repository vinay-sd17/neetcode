package com.neetcode.solutions.stack;

import java.util.Stack;

// https://leetcode.com/problems/baseball-game/
public class BaseBallGame {

  public static void main(String[] args) {
    System.out.println(calPoints(new String[] { "5", "2", "C", "D", "+" }));
    System.out.println(calPoints(new String[] { "5", "-2", "4", "C", "D", "9", "+", "+" }));
    System.out.println(calPoints(new String[] { "1", "C" }));
  }

  public static int calPoints(String[] operations) {
    int res = 0;
    int size = 0;
    Stack<Integer> stack = new Stack<>();
    for (String s : operations) {
      if (isNumeric(s)) {
        res += Integer.parseInt(s);
        stack.push(Integer.parseInt(s));
        size++;
      } else {
        int pk;
        switch (s) {
        case "+":
          pk = stack.get(size - 1) + stack.get(size - 2);
          res += pk;
          size++;
          stack.push(pk);
          break;
        case "D":
          pk = stack.get(size - 1) * 2;
          res += pk;
          size++;
          stack.push(pk);
          break;
        case "C":
          size--;
          res -= stack.pop();
          break;
        }
      }
    }
    return res;
  }

  public static boolean isNumeric(String str) {
    try {
      Integer.parseInt(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

}
