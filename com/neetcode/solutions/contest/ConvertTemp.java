package com.neetcode.solutions.contest;

import java.math.BigDecimal;

// https://leetcode.com/contest/weekly-contest-319/problems/convert-the-temperature/

public class ConvertTemp {

  public static void main(String[] args) {
    double cel = 122.11;
    double[] res = new double[2];
    new BigDecimal("122.11");
    res[0] = new BigDecimal("122.11").add(BigDecimal.valueOf(273.15)).doubleValue();
    res[1] = new BigDecimal(cel * 1.80 + 32).doubleValue();

    //res[1] = Math.round(() * 1e5) / 1e5;
    System.out.println(res);

  }
}
