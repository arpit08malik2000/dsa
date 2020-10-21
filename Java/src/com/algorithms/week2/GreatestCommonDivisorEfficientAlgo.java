package com.algorithms.week2;

import java.util.Scanner;

public class GreatestCommonDivisorEfficientAlgo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int gcd = gcd(a,b);
		System.out.println(gcd);
		scan.close();
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) 
			return a;
		return gcd(b,a % b);
	}

}