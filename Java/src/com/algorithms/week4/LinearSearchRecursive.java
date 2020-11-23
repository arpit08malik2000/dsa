package com.algorithms.week4;

import java.util.Scanner;

public class LinearSearchRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		int key = scan.nextInt();

		int result = linearSearch(arr, 0, arr.length - 1, key);
		System.out.println(result);
		scan.close();
	}
	
	public static int linearSearch(int[] arr, int low, int high, int key) {
		if(high < low)
			return -1;
		if(arr[low] == key)
			return low;
		return linearSearch(arr, low+1, high, key);
	}

}
