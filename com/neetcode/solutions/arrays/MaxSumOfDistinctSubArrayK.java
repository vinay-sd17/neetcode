package com.neetcode.solutions.arrays;

import java.util.HashMap;
import java.util.HashSet;

// https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/

public class MaxSumOfDistinctSubArrayK {

  public static void main(String[] args) {
    System.out.println(maximumSubarraySum1(new int[] { 1, 1, 1, 7, 8, 9 }, 3));
    //    System.out.println(maximumSubarraySum(new int[] { 4,4,4 }, 3));
  }

  public static long maximumSubarraySum1(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    long ans = 0;
    long currentSum = 0;
    for (int i = 0; i < k; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
      currentSum += nums[i];
    }

    if (map.size() == k) {
      ans = currentSum;
    }

    int startLeftIndex = 0;
    for (int i = k; i < nums.length; i++) {
      currentSum -= nums[startLeftIndex];
      currentSum += nums[i];
      map.put(nums[startLeftIndex], map.get(nums[startLeftIndex]) - 1);
      if (map.get(nums[startLeftIndex]) == 0) {
        map.remove(nums[startLeftIndex]);
      }
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
      startLeftIndex++;
      if (map.size() == k) {
        ans = Math.max(ans, currentSum);
      }
    }
    return ans;
  }

  public static long maximumSubarraySum(int[] nums, int k) {
    long res = 0;
    for (int i = 0; i < nums.length; i++) {
      res = Math.max(isDistinctSum(nums, i, k), res);
    }
    return res;
  }

  public static Long isDistinctSum(int[] nums, int i, int k) {
    HashSet<Integer> collection = new HashSet<>();
    long sum = 0L;
    int j = i + k;
    while (i < j && j <= nums.length) {
      collection.add(nums[i]);
      sum += nums[i];
      i++;
    }
    return collection.size() == k ? sum : Long.MIN_VALUE;
  }

}
