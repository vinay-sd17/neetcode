package com.neetcode.solutions.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/boats-to-save-people/
public class BoatsToSavePeople {

  public static void main(String[] args) {
    System.out.println(numRescueBoats(new int[] { 1, 2 }, 3));
    System.out.println(numRescueBoats(new int[] { 3, 2, 2, 1 }, 3));
    System.out.println(numRescueBoats(new int[] { 3, 5, 3, 4 }, 5));
  }

  public static int numRescueBoats(int[] people, int limit) {
    Arrays.sort(people);
    int res = 0;
    int rp = people.length - 1;
    int lp = 0;
    while (lp <= rp) {
      if (people[rp] + people[lp] <= limit) {
        res = res + 1;
        rp--;
        lp++;
      } else {
        res = res + 1;
        rp--;
      }
    }
    return res;
  }

}
