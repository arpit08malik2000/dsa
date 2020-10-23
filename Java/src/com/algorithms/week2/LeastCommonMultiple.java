package com.algorithms.week2;

import java.util.Scanner;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		System.out.println(lcm(a,b));
		scan.close();
	}
	
	public static long lcm(long a, long b) {
		long max = 0, step = 0;
		if(a > b) max = step = a;
		else max = step = b;
		while(true) {
			if((max % a == 0) && (max % b == 0))
				return max;
			max += step;
		}
	}

}
