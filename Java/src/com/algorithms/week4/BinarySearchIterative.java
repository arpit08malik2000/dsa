package com.algorithms.week4;

import java.util.Scanner;

public class BinarySearchIterative {

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
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == arr[mid])
				return mid;
			else if (key < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

}
