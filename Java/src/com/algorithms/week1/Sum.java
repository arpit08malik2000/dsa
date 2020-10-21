package com.algorithms.week1;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = sum(a,b);
		System.out.println(sum);
		scan.close();
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}

}
