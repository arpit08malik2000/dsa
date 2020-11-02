package com.algorithms.week3;

import java.util.Scanner;

public class CarRefuelingProblemGreedyAlgo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int f = scan.nextInt();
		int n = scan.nextInt();
		int[] arr = new int[n+2];
		arr[0] = 0;
		for(int i = 1; i < arr.length - 1; i++)
			arr[i] = scan.nextInt();
		arr[arr.length-1] = l;
		
		System.out.println(minRefills(arr,n,f));
		scan.close();
	}
	
	public static int minRefills(int[] arr, int n, int full) {
		int lastRefill, numRefills = 0, currentRefill = 0;
		while(currentRefill <= n) {
			lastRefill = currentRefill;
			while (currentRefill <= n && arr[currentRefill + 1] - arr[lastRefill] <= full)
				currentRefill++;
			if(currentRefill == lastRefill) 
				return -1;
			if(currentRefill <= n) 
				numRefills++;
		}
		return numRefills;
	}

}
