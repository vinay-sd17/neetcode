package com.neetcode.solutions.arrays;

// https://leetcode.com/problems/length-of-last-word/

public class LengthOfLastWord {

  public static void main(String[] args) {
    System.out.println(lengthOfLastWord("luffy is still joyboy"));
  }

  public static int lengthOfLastWord(String s) {
    s = s.trim();
    int i = s.lastIndexOf(" ");
    return s.substring(i + 1).length();
  }

}
