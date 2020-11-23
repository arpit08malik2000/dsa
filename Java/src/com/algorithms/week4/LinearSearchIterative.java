package com.algorithms.week4;

import java.util.Scanner;

public class LinearSearchIterative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		int key = scan.nextInt();

		int result = linearSearch(arr, key);
		System.out.println(result);
		scan.close();
	}

	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

}
