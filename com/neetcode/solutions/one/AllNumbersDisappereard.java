package com.neetcode.solutions.one;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class AllNumbersDisappereard {

  public static void main(String[] args) {
    System.out.println(findDisappearedNumbers1(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      set.add(i + 1);
    }
    for (int num : nums) {
      set.remove(num);
    }
    return new ArrayList<>(set);
  }

  public static List<Integer> findDisappearedNumbers1(int[] nums) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      int index = Math.abs(nums[i]) - 1;
      nums[index] = Math.abs(nums[index]) * -1;
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        result.add(i + 1);
      }
    }
    return result;
  }
}
