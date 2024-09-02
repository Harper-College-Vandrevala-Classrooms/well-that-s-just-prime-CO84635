package com.csc;

public class Factorizer {

  public static String printPrimeFactors(int n) {
    if (n <= 1) {
      return null;
    }

    String primeFactors = "";
    int divisor = 2;

    while (divisor * divisor <= n) {
      if (n % divisor == 0) {
        primeFactors += divisor + " ";
        n = n / divisor;
      } else {
        divisor++;
      }
    }

    if (n > 1) {
      primeFactors += n;
    }

    return primeFactors;
  }
}
