package com.algorithms.week2;

import java.util.Scanner;

/*** 
 * @author ARPIT MALIK
 * The sum of fibonacci numbers from n to m is equal to subtraction of (n + 1) th number from (m + 2) th number
 */

public class FibonacciNumbersPartialSumLastDigit {

	private static long seriesSum = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long m = scan.nextLong();
		long sum = getSum(n,m);
		System.out.println(sum);
		scan.close();
	}

	public static long[] getSeries() {
		long[] series = new long[60];
		series[0] = 0;
		series[1] = 1;
		seriesSum = seriesSum + series[0] + series[1]; 
		for(int i = 2; i < 60; i++) {
			series[i] = (series[i-1] + series[i-2]);
			seriesSum += series[i];
		}
		return series;
	}
	
	public static long getSum(long n, long m) {
		long[] series = getSeries();
		
		int from = (int) ((n + 1) % 60);
		int to = (int) ((m + 2) % 60);
		
		if(from <= to)
			return (series[to] - series[from]) % 10;
		else 
			return (seriesSum - (series[from] - series[to])) % 10;
	}
	
}