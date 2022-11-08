package com.neetcode.solutions.one;

// https://leetcode.com/contest/weekly-contest-291/problems/remove-digit-from-number-to-maximize-result/

import java.math.BigInteger;

public class RemoveDigitToMaxResult {

  public static void main(String[] args) {
    System.out.println(removeDigit("123", '3'));
    System.out.println(removeDigit("1231", '1'));
    System.out.println(removeDigit("2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471", '3'));
  }

  public static String removeDigit(String number, char digit) {
    BigInteger res = new BigInteger("-1");
    for (int i = 0; i < number.length(); i++) {
      if (number.charAt(i) == digit) {
        StringBuilder sb = new StringBuilder(number);
        sb.deleteCharAt(i);
        res = res.max(new BigInteger(sb.toString()));
      }
    }
    return String.valueOf(res);
  }

}
