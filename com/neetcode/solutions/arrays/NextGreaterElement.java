package com.neetcode.solutions.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/next-greater-element-i/
public class NextGreaterElement {

  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(nextGreaterElement(new int[] { 2, 4 }, new int[] { 1, 2, 3, 4 })));
  }

  public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] res = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      int num = nums1[i];
      boolean exist = false;
      int val = 0;
      for (int k : nums2) {
        if (num == k) {
          exist = true;
        }

        if (exist && k > num) {
          val = k;
          break;
        }
      }
      res[i] = val == 0 ? -1 : val;
    }
    return res;
  }
}
