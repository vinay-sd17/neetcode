package com.neetcode.solutions.arrays;

import java.util.HashSet;

// https://leetcode.com/problems/longest-consecutive-sequence/description/

public class LongestConsequitiveSequence {

  public static void main(String[] args) {
    System.out.println(longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
  }

  public static int longestConsecutive(int[] nums) {
    HashSet<Integer> dict = new HashSet<>();
    for (int n : nums) {
      dict.add(n);
    }
    int longest = 0;
    for (int n : nums) {
      if (!dict.contains(n - 1)) {
        int l = 0;
        while (dict.contains(n + l)) {
          l = l + 1;
        }
        longest = Math.max(longest, l);
      }
    }
    return longest;
  }

}
