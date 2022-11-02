package com.neetcode.solutions.one;

import java.util.HashSet;

// https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/description/

public class AllBinaryCodes {

  public static void main(String[] args) {
    System.out.println(hasAllCodes("00110", 2));
  }

  public static boolean hasAllCodes(String s, int k) {
    HashSet<String> occurance = new HashSet<>();
    for (int i = 0; i <= s.length() - k; i++) {
      String sequence = s.substring(i, i + k);
      occurance.add(sequence);
    }
    return occurance.size() == Math.pow(2, k);
  }

}
