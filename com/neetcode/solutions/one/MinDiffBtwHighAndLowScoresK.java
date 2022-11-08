package com.neetcode.solutions.one;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/
public class MinDiffBtwHighAndLowScoresK {

  public static void main(String[] args) {
//    System.out.println(minimumDifference(new int[]{90}, 1));
    System.out.println(minimumDifference(new int[]{9,4,1,7}, 2));
  }

  public static int minimumDifference(int[] nums, int k) {
    Arrays.sort(nums);
    int l = 0;
    int r = k - 1;
    int res = Integer.MAX_VALUE;
    while (r < nums.length) {
      res = Math.min(res, nums[r] - nums[l]);
      r++;
      l++;
    }
    return res;
  }

}
