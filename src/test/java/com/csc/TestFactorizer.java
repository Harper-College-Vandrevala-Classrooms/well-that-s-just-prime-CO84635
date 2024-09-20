package com.csc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    assertEquals("2 2 2 3 3 5", Factorizer.printPrimeFactors(360));
  }

  @Test
  public void testOneHundred() {
    assertEquals("2 2 5 5", Factorizer.printPrimeFactors(100));
  }

  @Test
  public void testIsPrime() {
    assertEquals(true, factorizer.isPrime(3));
  }

  @Test
  public void testIsPrime2() {
    assertEquals(true, factorizer.isPrime(2));
  }

  @Test
  public void testNotPrime() {
    assertEquals(false, factorizer.isPrime(4));
  }

  @Test
  public void testNotPrime2() {
    assertEquals(false, factorizer.isPrime(6));
  }

  @Test
  public void testReduceWholeNumber() {
    assertEquals("3", factorizer.reduce(36,12));
  }

  @Test
  public void testReduceWholeNumber2() {
    assertEquals("1", factorizer.reduce(12,12));
  }

  @Test
  public void testReduce() {assertEquals("6/7", factorizer.reduce(12,14));
  }

  @Test
  public void testReduce2() {assertEquals("12/37", factorizer.reduce(12,37));
  }

  @Test
  public void testisComposite(){
      assertTrue(factorizer.isComposite(36));}

  @Test
  public void testisComposite2(){
      assertTrue(factorizer.isComposite(12));}

  @Test
  public void testNotComposite(){
      assertFalse(factorizer.isComposite(17));}

  @Test
  public void testNotComposite2(){
      assertFalse(factorizer.isComposite(1));}

  @Test
  public void testNotComposite3(){
    assertFalse(factorizer.isComposite(0));}

}



