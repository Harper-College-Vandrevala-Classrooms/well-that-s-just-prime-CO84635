package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();

  }

  // Replace the following example tests with your own tests
  // of the prime factorization function.
  @Test
  public void testNegativeOne() {
    assertEquals(null, Factorizer.printPrimeFactors(-1));
  }

  @Test
  public void testOne() {
    assertEquals(null, Factorizer.printPrimeFactors(1));
  }

  @Test
  public void testThree() {
    assertEquals("3", Factorizer.printPrimeFactors(3));
  }

  @Test
  public void testThirtyFive() {
    assertEquals("5 7", Factorizer.printPrimeFactors(35));
  }

  @Test
  public void testTwentyFour() {
    assertEquals("2 2 2 3", Factorizer.printPrimeFactors(24));
  }

  @Test
  public void testSeventeen() {
    assertEquals("17", Factorizer.printPrimeFactors(17));
  }

  @Test
  public void testThreeHundredSixty() {
    assertEquals("2 2 2 3 3 5", Factorizer.printPrimeFactors(100));
  }

  @Test
  public void testOneHundred() {
    assertEquals("2 2 5 5", Factorizer.printPrimeFactors(100));
  }
}

