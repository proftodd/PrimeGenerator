package com.jtodd.primegen;

import java.util.List;

interface PrimeNumberGenerator {
	
	List<Integer> generate(int startingValue, int endingValue);
	
	static boolean isPrime(int value) {
		if (value < 2) {
			return false;
		}
		if (value == 2 || value == 3) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(value); ++i) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
}
