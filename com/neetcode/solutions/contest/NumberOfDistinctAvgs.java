package com.neetcode.solutions.contest;

import java.util.Arrays;
import java.util.HashSet;

// https://leetcode.com/contest/biweekly-contest-91/problems/number-of-distinct-averages/
public class NumberOfDistinctAvgs {

  public static void main(String[] args) {
    System.out.println(distinctAverages(new int[] { 4, 1, 4, 0, 3, 5 }));
  }

  public static int distinctAverages(int[] nums) {
    HashSet<Float> set = new HashSet<>();
    Arrays.sort(nums);
    int lp = 0;
    int rp = nums.length - 1;
    while (lp < rp) {
      float res = (nums[lp++] + nums[rp--]) / 2f;
      set.add(res);
    }
    return set.size();
  }

}
