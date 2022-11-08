package com.neetcode.solutions.arrays;

// https://leetcode.com/problems/find-pivot-index/
public class PivotIndex {

  public static void main(String[] args) {
    System.out.println(pivotIndex(new int[] { 1,2,3 }));
  }

  public static int pivotIndex(int[] nums) {
    int leftSum = 0, total = 0, rightSum = 0;
    for (int num : nums) {
      total += num;
    }
    for (int i = 0; i < nums.length; i++) {
      rightSum = total - nums[i] - leftSum;
      if (rightSum == leftSum) {
        return i;
      }
      leftSum = leftSum + nums[i];
    }
    return -1;
  }

}
