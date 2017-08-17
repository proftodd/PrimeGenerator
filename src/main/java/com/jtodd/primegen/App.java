package com.jtodd.primegen;

import java.util.stream.Collectors;

public class App {
	
	private static final PrimeNumberGenerator gen1 = new SimpleGenerator();
	private static final PrimeNumberGenerator gen2 = new SOEGenerator();

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: App <start> <end>");
			System.exit(1);
		}
		
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		
		System.out.printf("Primes between %d and %d (Simple generator)\n", start, end);
		System.out.println(gen1.generate(start, end).stream().map(i -> Integer.toString(i)).collect(Collectors.joining(", ")));
		System.out.println();
		System.out.printf("Primes between %d and %d (Sieve of Eratosthenes generator)\n", start, end);
		System.out.println(gen2.generate(start, end).stream().map(i -> Integer.toString(i)).collect(Collectors.joining(", ")));
		
		System.exit(0);
	}
}
