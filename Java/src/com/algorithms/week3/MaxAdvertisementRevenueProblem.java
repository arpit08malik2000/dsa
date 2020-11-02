package com.algorithms.week3;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAdvertisementRevenueProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();
		for (int i = 0; i < n; i++)
			b[i] = scan.nextInt();

		Arrays.sort(a);
		Arrays.sort(b);
		long ans = 0;
		for (int i = 0; i < n; i++)
			ans += (long) a[i] * b[i];
		System.out.println(ans);
		scan.close();
	}

}
