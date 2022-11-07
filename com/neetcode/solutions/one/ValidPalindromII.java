package com.neetcode.solutions.one;

// https://leetcode.com/problems/valid-palindrome-ii/description/

public class ValidPalindromII {

  public static void main(String[] args) {
    System.out.println(validPalindrome("aydmda"));
    //    System.out.println(validPalindrome("abca"));
    //    System.out.println(validPalindrome("abc"));
  }

  public static boolean validPalindrome(String s) {
    int lp = 0;
    int rp = s.length() - 1;
    while (lp < rp) {
      char start = s.charAt(lp);
      char end = s.charAt(rp);
      if (start != end) {
        return (isPalindrome(s, lp + 1, rp) || isPalindrome(s, lp, rp - 1));
      }
      lp++;
      rp--;
    }
    return true;
  }

  private static boolean isPalindrome(String s, int i, int j) {
    while (i < j) {
      if (s.charAt(i++) != s.charAt(j--)) {
        return false;
      }
    }
    return true;
  }

}
