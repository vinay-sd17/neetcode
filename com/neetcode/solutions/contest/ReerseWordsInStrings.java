package com.neetcode.solutions.contest;

public class ReerseWordsInStrings {

  public static void main(String[] args) {
    System.out.println(reverseWords("  hello world  "));
  }

  public static String reverseWords(String s) {
    StringBuilder sb = new StringBuilder();
    String[] subs = s.split(" ");
    for (int i = subs.length - 1; i >= 0; i--) {
      if (subs[i].trim().length() > 0) {
        sb.append(subs[i]).append(" ");
      }
    }
    return sb.toString().trim();
  }

}
