package com.algorithms.week2;

import java.util.Scanner;

public class FibonacciNumbersEfficientAlgo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long number = nthFibonacciNumber(n);
		System.out.println(n+"th Fibonacci Number is "+number);
		scan.close();
	}
	
	public static long nthFibonacciNumber(int n) {
		long[] series = new long[n+1];
		series[0] = 0;
		series[1] = 1;
		for(int i = 2; i <= n; i++) 
			series[i] = series[i-1] + series[i-2];
		return series[n];
	}

}
