package com.neetcode.solutions.arrays;

// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome1("A man, a plan, a canal: Panama"));
    System.out.println(isPalindrome1("race a car"));
    System.out.println(isPalindrome1(" "));
  }

  public static boolean isPalindrome(String s) {
    s = s.replaceAll("[^A-Za-z\\d]", "").toLowerCase();
    int lp = 0;
    int rp = s.length() - 1;
    while (lp < rp) {
      if (s.charAt(lp++) != s.charAt(rp--)) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPalindrome1(String s) {
    int lp = 0;
    int rp = s.length() - 1;
    while (lp < rp) {
      char start = s.charAt(lp);
      char end = s.charAt(rp);
      if (!Character.isLetterOrDigit(start)) {
        lp++;
        continue;
      }
      if (!Character.isLetterOrDigit(end)) {
        rp--;
        continue;
      }
      if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
        return false;
      }
      lp++;
      rp--;
    }
    return true;
  }

}
