package com.neetcode.solutions.arrays;

import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/two-sum/

public class TwoSum {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6)));
  }

  // Input: nums = [2,7,11,15], target = 9
  // Output: [0,1]
  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        return new int[] { map.get(target - nums[i]), i };
      }
      map.put(nums[i], i);
    }
    return null;
  }

}
