package com.algorithms.week4;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();

		majorityElement(arr);
		scan.close();
	}

	public static void majorityElement(int[] arr) {
		Arrays.sort(arr);
		int count = 1, max_ele = -1, temp = arr[0], f = 0;

		for (int i = 1; i < arr.length; i++) {
			if (temp == arr[i]) {
				count++;
			} else {
				count = 1;
				temp = arr[i];
			}

			if (max_ele < count) {
				max_ele = count;
				if (max_ele > (arr.length / 2)) {
					f = 1;
					break;
				}
			}
		}
		System.out.println(f);
	}

}
