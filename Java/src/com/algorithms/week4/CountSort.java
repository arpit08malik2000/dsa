package com.algorithms.week4;

import java.util.Scanner;

public class CountSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int[] count = new int[3];
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				count[0]++;
			}
			if (arr[i] == 2) {
				count[1]++;
			}
			if (arr[i] == 3) {
				count[2]++;
			}
		}

		int j = 0;
		for (int i = 0; i < 3; i++) {
			for (; count[i] > 0; count[i]--) {
				arr[j] = i + 1;
				j++;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		scan.close();
	}

}
