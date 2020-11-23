package com.algorithms.week4;

import java.util.Scanner;

public class MultiplyingPolynomialsNaiveAlgo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}

		int[] res = new int[2 * n - 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				res[i + j] += a[i] * b[j];
			}
		}
		for (int i = 0; i < res.length; i++)
			System.out.println(res[i]);
		scan.close();
	}

}
