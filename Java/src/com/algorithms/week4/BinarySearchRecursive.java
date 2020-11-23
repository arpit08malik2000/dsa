package com.algorithms.week4;

import java.util.Scanner;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int m = scan.nextInt();
		int[] key = new int[m];
		for (int i = 0; i < m; i++)
			key[i] = scan.nextInt();

		for (int i = 0; i < m; i++)
			System.out.print(binarySearch(arr, 0, arr.length - 1, key[i]) + " ");
		System.out.println();
		scan.close();
	}

	public static int binarySearch(int[] arr, int low, int high, int key) {
		if (high < low)
			return -1;

		int mid = (low + high) / 2;
		if (key == arr[mid])
			return mid;
		if (key < arr[mid])
			return binarySearch(arr, low, mid - 1, key);
		else
			return binarySearch(arr, mid + 1, high, key);
	}

}
