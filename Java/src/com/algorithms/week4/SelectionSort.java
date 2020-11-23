package com.algorithms.week4;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		arr = selectionSort(arr, 0);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i]+ " ");
		System.out.println();
		scan.close();
	}

	public static int[] selectionSort(int[] arr, int currentIndex) {
		if (currentIndex == arr.length - 1)
			return arr;

		int minIndex = currentIndex;
		for (int i = currentIndex + 1; i < arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		
		if(minIndex != currentIndex) {
			int temp = arr[minIndex];
			arr[minIndex] = arr[currentIndex];
			arr[currentIndex] = temp;
		}
		
		return selectionSort(arr, currentIndex + 1);
	}
}
