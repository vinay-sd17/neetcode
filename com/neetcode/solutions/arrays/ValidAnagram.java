package com.neetcode.solutions.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/valid-anagram/description/

public class ValidAnagram {

  public static void main(String[] args) {
    System.out.println(isAnagram("anagram", "nagaram"));
    System.out.println(isAnagram("rat", "car"));
  }

  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    char[] sChars = new char[26];
    char[] tChars = new char[26];
    int wordLength = s.length();
    for (int i = 0; i < wordLength; i++) {
      sChars[s.charAt(i) - 'a']++;
      tChars[t.charAt(i) - 'a']++;
    }
    return Arrays.equals(sChars, tChars);
  }

}
