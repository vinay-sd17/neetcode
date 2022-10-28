package com.neetcode.solutions.one;

// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

import java.util.Arrays;

public class ReplaceElemWithGreatestElem {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(replaceElements1(new int[] { 17, 18, 5, 4, 6, 1 })));
    System.out.println(Arrays.toString(replaceElements1(new int[] { 400 })));
  }

  //Brute force O(n2)
  public static int[] replaceElements(int[] arr) {
    int[] op = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        op[i] = -1;
      } else {
        for (int j = i + 1; j < arr.length; j++) {
          op[i] = Math.max(op[i], arr[j]);
        }
      }
    }
    return op;
  }

  public static int[] replaceElements1(int[] arr) {
    int lMax = -1;
    for (int i = arr.length - 1; i >= 0; i--) {
      int cMax = arr[i];
      arr[i] = lMax;
      lMax = Math.max(lMax, cMax);
    }
    return arr;
  }

}
