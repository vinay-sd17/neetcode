package com.neetcode.solutions.arrays;

// https://leetcode.com/problems/maximum-69-number/description/
public class MaxSixtyNine {

  public static void main(String[] args) {
    System.out.println(maximum69Number(9669));
    System.out.println(maximum69Number(9996));
    System.out.println(maximum69Number(9999));
  }

  public static int maximum69Number(int num) {
    String numStr = String.valueOf(num);
    return Integer.parseInt(numStr.replaceFirst("6", "9"));
  }
}
