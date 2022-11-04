package com.neetcode.solutions.one;

import java.util.HashMap;

// https://leetcode.com/problems/maximum-number-of-balloons/description/
public class MaxBalloons {

  public static void main(String[] args) {
    System.out.println(maxNumberOfBalloons("balloonballoon"));
  }

  public static int maxNumberOfBalloons(String text) {
    int b = 0, a = 0, l = 0, o = 0, n = 0, count = 0;
    for (char c : text.toCharArray()) {
      switch (c) {
      case 'b':
        b++;
        break;
      case 'a':
        a++;
        break;
      case 'l':
        l++;
        break;
      case 'o':
        o++;
        break;
      case 'n':
        n++;
        break;
      }

      if (b >= 1 && a >= 1 && l >= 2 && o >= 2 && n >= 1) {
        count += 1;
        b -= 1;
        a -= 1;
        n -= 1;
        l -= 2;
        o -= 2;
      }
    }
    return count;
  }

}
