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

  public boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }

    int divisor = 2;
    while (divisor * divisor <= n) {
      if (n % divisor == 0) {
        return false;
      } else {
        divisor++;
      }
    }
    return true;
  }

  public boolean isComposite(int n) {
    if (n <= 1) {
      return false;
    }

    return !isPrime(n);
  }

  public String reduce(int numerator, int denominator) {
    if (denominator == 0) {
      return "Undefined";
    }

    if (numerator == 0) {
      return "0";
    }

    int greatestCommonDivisor = 1;
    for (int i = 1; i <= Math.min(numerator, denominator); i++){
      if (numerator % i == 0 && denominator % i == 0) {
        greatestCommonDivisor = i;
      }
    }

    numerator /= greatestCommonDivisor;
    denominator /= greatestCommonDivisor;

    if (denominator == 1) {
      return String.valueOf(numerator);
    } else {
      return numerator + "/" + denominator;
    }
  }

}
