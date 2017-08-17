package com.jtodd.primegen;

import org.junit.Assert;
import org.junit.Test;

public class TestPrimeNumberGenerator {
	
	private static final Integer [] empty = new Integer [] {};
	
	public static void testGenerate(PrimeNumberGenerator generator) {
		Integer [] expected = new Integer [] {7901, 7907, 7919};
		Assert.assertArrayEquals("Wrong set of primes returned", expected, generator.generate(7900, 7920).toArray(empty));
	}
	
	public static void testOrderDoesntMatter(PrimeNumberGenerator generator) {
		Assert.assertArrayEquals("Order should not matter", generator.generate(7900, 7920).toArray(empty), generator.generate(7920,  7900).toArray(empty));
	}
	
	@Test
	public void testIsPrime() {
		Assert.assertFalse("Incorrectly claims 1 is prime", PrimeNumberGenerator.isPrime(1));
		Assert.assertTrue("Incorrectly claims 2 is not prime", PrimeNumberGenerator.isPrime(2));
		Assert.assertTrue("Incorrectly claims 3 is not prime", PrimeNumberGenerator.isPrime(3));
		Assert.assertFalse("Incorrectly claims 4 is prime", PrimeNumberGenerator.isPrime(4));
		Assert.assertTrue("Incorrectly claims 17 is not prime", PrimeNumberGenerator.isPrime(17));
		Assert.assertFalse("Incorrectly claims 15 is prime", PrimeNumberGenerator.isPrime(15));
	}
}
