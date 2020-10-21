package com.algorithms.week2;

import java.util.Scanner;

public class FibonacciNumbersNaiveAlgo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long number = nthFibonacciNumber(n);
		System.out.println(n+"th Fibonacci Number is "+number);
		scan.close();
	}
	
	public static long nthFibonacciNumber(int n) {
		switch(n) {
			case 0:
				return 0;
			case 1:
				return 1;
			default:
				return nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
		}
	}

}
