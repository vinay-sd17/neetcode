package com.neetcode.solutions.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/product-of-array-except-self/description/

public class ProductOfArrayExceptSelf {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(productExceptSelf(new int[] { 1, 2, 3, 4 })));
    System.out.println(Arrays.toString(productExceptSelf(new int[] { -1, 1, 0, -3, 3 })));
  }

  public static int[] productExceptSelf(int[] nums) {
    int leftPrefix = 1, rightPrefix = 1;
    int[] res = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      res[i] = leftPrefix;
      leftPrefix *= nums[i];
    }

    for (int j = nums.length - 1; j >= 0; j--) {
      res[j] = res[j] * rightPrefix;
      rightPrefix *= nums[j];
    }
    return res;
  }

}
