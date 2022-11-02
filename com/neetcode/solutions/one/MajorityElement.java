package com.neetcode.solutions.one;

import java.util.HashMap;

// https://leetcode.com/problems/majority-element/
public class MajorityElement {

  public static void main(String[] args) {
    System.out.println(majorityElement(new int[] { 3, 2, 3 }));
    System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    System.out.println(majorityElement(new int[] { 8, 8, 7, 7, 7 }));
    System.out.println(majorityElement(new int[] { 3, 3, 4 }));
  }

  public static int majorityElement(int[] nums) {
    int majority = Integer.MIN_VALUE;
    int times = 0;
    HashMap<Integer, Integer> occurances = new HashMap<>();
    for (int num : nums) {
      if (occurances.containsKey(num)) {
        occurances.put(num, occurances.get(num) + 1);
      } else {
        occurances.put(num, 1);
      }

      if (occurances.get(num) > times) {
        times = occurances.get(num);
        majority = num;
      }
    }
    return majority;
  }

}
