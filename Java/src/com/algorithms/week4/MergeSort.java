package com.algorithms.week4;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();

		mergeSort(arr, 0, arr.length - 1);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		scan.close();
	}

	public static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (high + low) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		int length1 = mid - low + 1;
		int length2 = high - mid;
		int A[] = new int[length1];
		int B[] = new int[length2];
		for (int i = 0; i < length1; i++)
			A[i] = arr[low + i];
		for (int i = 0; i < length2; i++)
			B[i] = arr[mid + i + 1];

		int i = 0, j = 0;
		int k = low;
		while (i < length1 && j < length2) {
			if (A[i] <= B[j]) {
				arr[k] = A[i];
				k++;
				i++;
			} else {
				arr[k] = B[j];
				k++;
				j++;
			}
		}
		while (i < length1) {
			arr[k] = A[i];
			k++;
			i++;
		}
		while (j < length2) {
			arr[k] = B[j];
			k++;
			j++;
		}
	}

}
