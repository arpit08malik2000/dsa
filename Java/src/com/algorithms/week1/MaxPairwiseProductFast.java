package com.algorithms.week1;

import java.util.Scanner;

public class MaxPairwiseProductFast {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n; i++) {
			arr[i] = scan.nextInt();
		}
		long result = maxPairwiseProductFast(arr);
		System.out.println(result);
		scan.close();
	}
	
	public static long maxPairwiseProductFast(int[] arr) {
		int n = arr.length;
		
		int maxIndex1 = -1;
		for(int i = 0; i < n; i++) 
			if((maxIndex1 == -1) || (arr[i] > arr[maxIndex1]))
				maxIndex1 = i;
		
		int maxIndex2 = -1;
		for(int i=0; i< n; i++)
			if((i != maxIndex1) && ((maxIndex2 == -1) || (arr[i] > arr[maxIndex2])))
				maxIndex2 = i;
		
		return (long) arr[maxIndex1] * arr[maxIndex2];
	}

}
