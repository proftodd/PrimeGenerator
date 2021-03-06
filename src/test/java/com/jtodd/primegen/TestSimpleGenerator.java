package com.jtodd.primegen;

import org.junit.Test;

public class TestSimpleGenerator {
	
	private static final PrimeNumberGenerator generator = new SimpleGenerator();

	@Test
	public void testGenerate() {
		TestPrimeNumberGenerator.testGenerate(generator);
	}
	
	@Test
	public void testOrderDoesntMatter() {
		TestPrimeNumberGenerator.testOrderDoesntMatter(generator);
	}
}
