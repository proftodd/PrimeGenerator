package com.jtodd.primegen;

import java.util.ArrayList;
import java.util.List;

public class SimpleGenerator implements PrimeNumberGenerator {

	public List<Integer> generate(int startingValue, int endingValue) {
		return new ArrayList<>();
	}

	public boolean isPrime(int value) {
		return false;
	}
}