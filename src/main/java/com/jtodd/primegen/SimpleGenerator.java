package com.jtodd.primegen;

import java.util.ArrayList;
import java.util.List;

public class SimpleGenerator implements PrimeNumberGenerator {

	public List<Integer> generate(int startingValue, int endingValue) {
		ArrayList<Integer> results = new ArrayList<>();
		int start = Math.min(startingValue,  endingValue);
		int end = Math.max(startingValue,  endingValue);
		for (int i = start; i <= end; ++i) {
			if (isPrime(i)) {
				results.add(i);
			}
		}
		return results;
	}

	public boolean isPrime(int value) {
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