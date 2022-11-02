package com.neetcode.solutions.one;

public class IndexOfFirstOccurance {

  public static void main(String[] args) {
    System.out.println(strStr("leetcode", "leeto"));
  }

  public static int strStr(String haystack, String needle) {
    if (haystack.length() < needle.length()) {
      return -1;
    }
    return haystack.indexOf(needle);
  }

}
