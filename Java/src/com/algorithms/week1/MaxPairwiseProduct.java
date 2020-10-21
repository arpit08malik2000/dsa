package com.algorithms.week1;

import java.util.Scanner;

public class MaxPairwiseProduct {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n; i++) {
			arr[i] = scan.nextInt();
		}
		long result = maxPairwiseProduct(arr);
		System.out.println(result);
		//Arrays.sort(arr);
		//System.out.println(arr[n-2] * arr[n-1]);
		scan.close();
	}
	
	public static long maxPairwiseProduct(int[] arr) {
		long result = 0;
		int n = arr.length;
		for(int i = 0; i < n; i++) 
			for(int j =0; j < n; j++) 
				if((i!=j) && ((long) arr[i]*arr[j] > result))
					result = (long) arr[i]*arr[j];
		return result;
	}

}