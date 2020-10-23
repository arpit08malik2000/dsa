package com.algorithms.week2;

import java.util.Scanner;

public class FibonacciNumbersModuloM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long m = scan.nextLong();
		long number = getNumber(n,m);
		System.out.println(number);
		scan.close();
	}
	
	public static long getT(long m) {
		long a = 0, b = 1, c = (a+ b) % m, ctr = 0;	
		while(true) {
			ctr++;
			c = (a + b) % m;
			a = b;
			b = c;
			if ((a == 0) && (b == 1)) 
				return ctr;
		}
	}
	
	public static long getNumber(long n, long m) {
		long t = getT(m);
		int length = (int)(n % t) + 1;
		long[] series = new long[length];
		series[0] = 0;
		if(length > 1)
			series[1] = 1;
		for(int i = 2; i < length; i++) 
			series[i] = (series[i-1] + series[i-2]) % m;
		return series[length-1]; 
	}
	
}