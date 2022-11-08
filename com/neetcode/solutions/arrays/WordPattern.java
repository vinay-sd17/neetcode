package com.neetcode.solutions.arrays;

import java.util.HashMap;

// https://leetcode.com/problems/word-pattern/
public class WordPattern {

  public static void main(String[] args) {
    System.out.println(wordPattern("abba", "dog dog dog dog"));
    //    System.out.println(wordPattern("abba", "dog cat cat fish"));
    //    System.out.println(wordPattern("aaaa", "dog cat cat dog"));
    //    System.out.println(wordPattern("aaaa", "dog cat cat dog"));
  }

  public static boolean wordPattern(String pattern, String s) {
    HashMap<Character, String> datasetPatternToS = new HashMap<>();
    HashMap<String, Character> datasetSToPattern = new HashMap<>();
    String[] words = s.split(" ");
    if (pattern.length() != words.length) {
      return false;
    }
    for (int i = 0; i < words.length; i++) {
      char p = pattern.charAt(i);
      if (!datasetPatternToS.containsKey(p) && !datasetSToPattern.containsKey(words[i])) {
        datasetPatternToS.put(p, words[i]);
        datasetSToPattern.put(words[i], p);
      }
      if ((datasetPatternToS.containsKey(p) && !datasetPatternToS.get(p).equals(words[i])) || (
          datasetSToPattern.containsKey(words[i]) && !datasetSToPattern.get(words[i]).equals(p))) {
        return false;
      }
    }
    return true;
  }

}
