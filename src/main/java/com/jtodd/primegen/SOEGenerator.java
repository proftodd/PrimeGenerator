package com.jtodd.primegen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// Prime number generator based on the Sieve of Eratosthenes
// https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
public class SOEGenerator implements PrimeNumberGenerator {

	@Override
	public List<Integer> generate(int startingValue, int endingValue) {
		int start = Math.min(startingValue, endingValue);
		int end = Math.max(startingValue, endingValue);
		boolean [] primes = new boolean[end - start + 1];
		Arrays.fill(primes, Boolean.TRUE);
		for (int i = 2; i < Math.sqrt(end); ++i) {
			for (int j = start / i; j <= end / i; ++j) {
				int index = i * j - start;
				if (index >= 0 && index < primes.length) {
					primes[index] = false;
				}
			}
		}
		return IntStream.rangeClosed(start, end)
				.parallel()
				.filter(i -> primes[i - start])
				.collect(() -> new ArrayList<>(), (l, i) -> l.add(i), (l1, l2) -> l1.addAll(l2));
	}
}