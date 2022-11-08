package com.neetcode.solutions.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElem {

  public static void main(String[] args) {
    topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2);
    topKFrequent(new int[] { 1 }, 1);
  }

  // Input: nums = [1,1,1,2,2,3], k = 2
  //Output: [1,2]
  public static int[] topKFrequent(int[] nums, int k) {
    int[] res = new int[k];
    HashMap<Integer, Integer> ocuranceMap = new HashMap<>();
    PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
        (a, b) -> a.getValue() - b.getValue());

    for (int i : nums) {
      if (ocuranceMap.containsKey(i)) {
        ocuranceMap.put(i, ocuranceMap.get(i) + 1);
      } else {
        ocuranceMap.put(i, 1);
      }
    }

    for (HashMap.Entry<Integer, Integer> e : ocuranceMap.entrySet()) {
      pq.add(e);
      if (pq.size() > k) {
        pq.poll();
      }
    }
    int index = 0;
    for (Map.Entry<Integer, Integer> pp : pq) {
      res[index++] = pp.getKey();
    }
    return res;
  }

}
