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
  public void testNotPrime1() {
      assertFalse(factorizer.isPrime(36));
  }

  @Test
  public void testNotPrime2() {
      assertFalse(factorizer.isPrime(12));
  }

  @Test
  public void testIsPrime() {
      assertTrue(factorizer.isPrime(17));
  }

  @Test
  public void testNotPrime3() {
      assertFalse(factorizer.isPrime(1));
  }

  @Test
  public void testNotPrime4() {
      assertFalse(factorizer.isPrime(0));
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



