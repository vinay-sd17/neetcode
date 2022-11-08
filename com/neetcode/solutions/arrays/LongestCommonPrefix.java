package com.neetcode.solutions.arrays;

// https://leetcode.com/problems/longest-common-prefix/description/

public class LongestCommonPrefix {

  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
    System.out.println(longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
    System.out.println(longestCommonPrefix(new String[] { "ab", "a" }));
  }

  public static String longestCommonPrefix(String[] strs) {
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < strs[0].length(); i++) {
      for (int j = 1; j < strs.length; j++) {
        if (strs[j].length() == i || strs[0].charAt(i) != strs[j].charAt(i)) {
          return res.toString();
        }
      }
      res.append(strs[0].charAt(i));
    }
    return res.toString();

  }

}
