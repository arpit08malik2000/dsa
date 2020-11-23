package com.algorithms.week4;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();

		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		scan.close();
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low > high)
			return;
		int pivotIndex = low;
		for (int i = low + 1; i <= high; i++) {
			if (arr[i] <= arr[pivotIndex]) {
				// swapping
				if(i == pivotIndex+1) {
					int temp = arr[pivotIndex];
					arr[pivotIndex] = arr[i];
					arr[i] = temp;
				} else {
					int temp1 = arr[pivotIndex];
					arr[pivotIndex] = arr[pivotIndex+1];
					arr[pivotIndex+1] = temp1;
					
					int temp2 = arr[pivotIndex];
					arr[pivotIndex] = arr[i];
					arr[i] = temp2;
				}
				pivotIndex++;
			}
		}
		
		quickSort(arr, low, pivotIndex - 1);
		quickSort(arr, pivotIndex + 1, high);
	}
}