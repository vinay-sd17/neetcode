package com.neetcode.solutions.arrays;

import java.util.Stack;

// https://leetcode.com/problems/reverse-vowels-of-a-string/description/
public class ReverseVowelOfString {

  public static void main(String[] args) {
    System.out.println(reverseVowels("aA"));
    System.out.println(reverseVowels("leetcode"));
  }

  public static String reverseVowelsStack(String s) {
    StringBuilder vowelInString = new StringBuilder();
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char letter = s.charAt(i);
      if (isVowel(letter)) {
        vowelInString.append(letter);
      }
    }
    int index = vowelInString.length() - 1;
    for (int i = 0; i < s.length(); i++) {
      char letter = s.charAt(i);
      if (isVowel(letter)) {
        letter = vowelInString.charAt(index--);
      }
      result.append(letter);
    }
    return result.toString();
  }

  public static String reverseVowels(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (isVowel(c)) {
        stack.push(c);
      }
    }
    StringBuilder sb = new StringBuilder(s);

    for (int i = 0; i < s.length(); i++) {
      if (isVowel(sb.charAt(i))) {
        sb.setCharAt(i, stack.pop());
      }
    }
    return sb.toString();
  }

  public static boolean isVowel(char letter) {
    return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
        || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U';
  }
}
