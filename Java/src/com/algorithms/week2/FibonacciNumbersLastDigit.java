package com.algorithms.week2;

import java.util.Scanner;

public class FibonacciNumbersLastDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long lastDigit = lastDigit(n);
		System.out.println(lastDigit);
		scan.close();
	}
	
	public static long[] getSeries() {
		long[] series = new long[60];
		series[0] = 0;
		series[1] = 1;
		for (int i = 2; i < 60; i++) 
			series[i] = (series[i-1] + series[i-2]) % 10;
		return series;
	}
	
	public static long lastDigit(long n) {
		long[] series = getSeries();
		return series[(int)(n % 60)];
	}

}

