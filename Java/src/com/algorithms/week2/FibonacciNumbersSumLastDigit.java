package com.algorithms.week2;

import java.util.Scanner;

public class FibonacciNumbersSumLastDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		System.out.println(sum(n));
		scan.close();
	}
	
	public static int[] getSeries() {
		int[] series = new int[60];
		series[0] = 0;
		series[1] = 1;
		for(int i = 2; i < 60; i++) 
			series[i] = (series[i-1] + series[i-2]) % 10;
		return series;
	}
	
	public static int sum(long n) {
		int[] series = getSeries();
		long sum = 0;
		n = n % 60;
		for(int i = 0; i <= n; i++) {
			sum += series[i];
		}
		return (int) (sum % 10);
	}

}
