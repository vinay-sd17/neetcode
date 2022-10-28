package com.neetcode.solutions.one;

import java.util.HashSet;

// https://leetcode.com/problems/contains-duplicate/

public class ContainsDuplicate {

  public static void main(String[] args) {
    System.out.println(containsDuplicate(new int[] { 1, 2, 3, 1 }));
    System.out.println(containsDuplicate(new int[] { 1, 2, 3, 4 }));
    String ss = "sadsadasd";
    ss.substring(1, 0);
  }

  // Input: nums = [1,2,3,1]
  // Output: true

  public static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (!set.add(num)) {
        return true;
      }
    }
    return false;
  }
}
