package com.algorithms.week2;

import java.util.Scanner;

/*** 
 *The sum of squares of fibonacci numbers up to n is equal to the product of 
 *nth and (n+1)th fibonacci numbers.
 */

public class FibonacciNumbersSquareSumLastDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		System.out.println(sum(n));
		scan.close();
	}
	
	public static int sum(long n) {
		int[] series = getSeries();
		n = n % 60;
		if(n == 59)
			return (series[(int)n]*series[0])%10;
		else 
			return (series[(int)n]*series[(int)n+1])%10;
	}
	
	public static int[] getSeries() {
		int[] series = new int[60];
		series[0] = 0;
		series[1] = 1;
		for(int i = 2; i < 60; i++) 
			series[i] = (series[i-1] + series[i-2])%10;
		return series;
	}

}
