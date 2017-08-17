package com.jtodd.primegen;

import org.junit.Assert;
import org.junit.Test;

public class TestSimpleGenerator {
	
	private static final PrimeNumberGenerator generator = new SimpleGenerator();
	private static final Integer [] empty = new Integer [] {};

	@Test
	public void testGenerate() {
		Integer [] expected = new Integer [] {7901, 7907, 7919};
		Assert.assertArrayEquals("Wrong set of primes returned", expected, generator.generate(7900, 7920).toArray(empty));
	}
	
	@Test
	public void testOrderDoesntMatter() {
		Assert.assertArrayEquals("Order should not matter", generator.generate(7900, 7920).toArray(empty), generator.generate(7920,  7900).toArray(empty));
	}
	
	@Test
	public void testIsPrime() {
		Assert.assertTrue("Incorrectly claims 3 is not prime", generator.isPrime(3));
		Assert.assertFalse("Incorrectly claims 4 is prime", generator.isPrime(4));
		
		try {
			generator.isPrime(1);
			Assert.fail("Should catch IllegalArgumentException for argument less than 2");
		} catch (IllegalArgumentException e) {}
	}
}
