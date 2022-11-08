package com.neetcode.solutions.arrays;

import java.util.HashMap;

// https://leetcode.com/problems/isomorphic-strings/
public class Isomorphic {

  public static void main(String[] args) {
    System.out.println(isIsomorphic("egg", "add"));
    System.out.println(isIsomorphic("foo", "bar"));
    System.out.println(isIsomorphic("paper", "title"));
    System.out.println(isIsomorphic("badc", "baba")); // false
  }

  public static boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    HashMap<Character, Character> stMap = new HashMap<>();
    HashMap<Character, Character> scMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char sc = s.charAt(i);
      char st = t.charAt(i);

      if (stMap.containsKey(sc) && stMap.get(sc) != st ||
          scMap.containsKey(st) && scMap.get(st) != sc) {
        return false;
      }
      stMap.put(sc, st);
      scMap.put(st, sc);
    }
    return true;
  }

}
