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
    String primeFactors = printPrimeFactors(n);

    if (primeFactors == null ) {
      return false;
    }
    
    return primeFactors.equals(String.valueOf(n));
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
    int divisor = 2;

    while (divisor <= numerator && divisor <= denominator) {
      String numeratorFactors = printPrimeFactors(numerator);
      String denominatorFactors = printPrimeFactors(denominator);

      while (numerator % divisor == 0 && denominator % divisor == 0) {
        greatestCommonDivisor *= divisor;
        numerator /= divisor;
        denominator /= divisor;
      }
      divisor++;
    }

    if (denominator == 1) {
      return String.valueOf(numerator);
    } else {
      return numerator + "/" + denominator;
    }
  }

}
