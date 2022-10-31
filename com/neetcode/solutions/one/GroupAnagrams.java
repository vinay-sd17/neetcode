package com.neetcode.solutions.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

  public static void main(String[] args) {
    groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      char[] carray = new char[26];
      for (int j = 0; j < str.length(); j++) {
        carray[str.charAt(j) - 'a']++;
      }
      String key = new String(carray);
      map.computeIfAbsent(key, k -> new ArrayList<>());
      map.get(key).add(str);
    }
    return new ArrayList<>(map.values());
  }

}
