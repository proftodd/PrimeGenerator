package com.jtodd.primegen;

import org.junit.Test;

public class TestSOEGenerator {

	private static final SOEGenerator generator = new SOEGenerator();

	@Test
	public void testGenerate() {
		TestPrimeNumberGenerator.testGenerate(generator);
	}
	
	@Test
	public void testOrderDoesntMatter() {
		TestPrimeNumberGenerator.testOrderDoesntMatter(generator);
	}
}
