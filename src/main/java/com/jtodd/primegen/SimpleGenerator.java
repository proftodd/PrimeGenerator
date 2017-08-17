package com.jtodd.primegen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SimpleGenerator implements PrimeNumberGenerator {

	@Override
	public List<Integer> generate(int startingValue, int endingValue) {
		return IntStream.rangeClosed(Math.min(startingValue, endingValue), Math.max(startingValue, endingValue))
				        .parallel()
		                .filter(PrimeNumberGenerator::isPrime)
		                .collect(() -> new ArrayList<>(), (l, i) -> l.add(i), (l1, l2) -> l1.addAll(l2));
	}
}