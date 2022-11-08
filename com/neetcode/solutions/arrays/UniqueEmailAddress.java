package com.neetcode.solutions.arrays;

import java.util.HashSet;

// https://leetcode.com/problems/unique-email-addresses/
public class UniqueEmailAddress {

  public static void main(String[] args) {
    System.out.println(numUniqueEmails(new String[] {
        "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
        "testemail+david@lee.tcode.com"
    }));
    System.out.println(numUniqueEmails(new String[] {
        "a@leetcode.com", "b@leetcode.com", "c@leetcode.com"
    }));
  }

  public static int numUniqueEmails(String[] emails) {
    HashSet<String> occurances = new HashSet<>();
    for (String email : emails) {
      String[] pairs = email.split("@");
      pairs[0] = pairs[0].replace(".", "");
      String local = pairs[0].contains("+") ?
          pairs[0].substring(0, pairs[0].indexOf("+")) :
          pairs[0];
      String domain = pairs[1];
      String e = local + "@" + domain;
      occurances.add(e);
    }
    return occurances.size();
  }
}
