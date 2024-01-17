package com.skilldistillery.fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				// 3 and 5
				System.out.println("fizzbuzz");
			} else if (i % 3 == 0) {
				// divisible by 3
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				// divisible by 5
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
