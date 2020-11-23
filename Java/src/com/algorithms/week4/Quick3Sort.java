package com.algorithms.week4;

import java.util.Random;
import java.util.Scanner;

public class Quick3Sort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();

		quickSort(arr);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		scan.close();
	}

	private static void quickSort(int[] array) {
		shuffleArray(array);
		quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int[] array, int lo, int hi) {
		if (hi <= lo)
			return;

		int lowerIndex = lo;
		int greaterIndex = hi;
		int element = array[lo];
		int i = lo;

		while (i <= greaterIndex) {
			if (array[i] < element)
				swap(array, lowerIndex++, i++);
			else if (array[i] > element)
				swap(array, i, greaterIndex--);
			else
				i++;
		}

		quickSort(array, lo, lowerIndex - 1);
		quickSort(array, greaterIndex + 1, hi);
	}

	private static void shuffleArray(int[] ar) {
		Random rnd = new Random();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			swap(ar, i, index);
		}
	}

	private static void swap(int[] array, int i, int j) {
		int a = array[i];
		array[i] = array[j];
		array[j] = a;
	}

}