package com.neetcode.solutions.one;

public class AdjacentFlowers {

  public static void main(String[] args) {
    System.out.println(canPlaceFlowers(new int[] { 1, 0, 0, 0, 0, 1 }, 2));
    //    System.out.println(canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 2));
  }

  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    int[] fbClonned = new int[flowerbed.length + 2];
    System.arraycopy(flowerbed, 0, fbClonned, 1, flowerbed.length);

    for (int i = 1; i < fbClonned.length - 1; i++) {
      if (fbClonned[i - 1] == 0 && fbClonned[i] == 0 && fbClonned[i + 1] == 0) {
        fbClonned[i] = 1;
        n--;
      }
    }
    return n <= 0;
  }

}
