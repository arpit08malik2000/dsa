package com.algorithms.week2;

import java.util.*;

public class GreatestCommonDivisorNaiveAlgo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long rslt = gcd(a,b);
		System.out.println("GCD of "+a+" and "+b+" is "+rslt);
		scan.close();
	}

	public static long gcd(long a, long b) {
		long ans = 0;
		for(long i = 1; i <= a + b; i++) 
			if((a % i == 0) && (b % i == 0)) 
				ans = i;
		return ans;
	}
	
}
