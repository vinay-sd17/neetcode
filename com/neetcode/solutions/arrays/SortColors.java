package com.neetcode.solutions.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/sort-colors/description/
public class SortColors {

  public static void main(String[] args) {
//    sortColors1(new int[] { 2, 0, 2, 1, 1, 0 });
    sortColors1(new int[] { 2, 0, 1 });
    //sortColors1(new int[] { 2, 1, 1 });
  }

  public static void swap(int i, int j, int[] nums) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }

  public static void sortColors1(int[] nums) {
    int l = 0, r = nums.length - 1, i = 0;
    while (i < r) {
      if (nums[i] == 0) {
        swap(l, i, nums);
        l++;
      } else if (nums[i] == 2) {
        swap(r, i, nums);
        r--;
        i--;
      }
      i++;
    }
    System.out.println(Arrays.toString(nums));
  }

  public static void sortColors(int[] nums) {
    int[] colors = new int[3];
    for (int num : nums) {
      colors[num] += 1;
    }
    int startIndex = 0;
    for (int i = 0; i < colors.length; i++) {
      int loop = startIndex + colors[i];
      while (startIndex < loop) {
        nums[startIndex++] = i;
      }
    }
    System.out.println(Arrays.toString(nums));
  }

}
