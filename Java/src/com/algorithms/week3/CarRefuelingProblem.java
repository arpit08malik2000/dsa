package com.algorithms.week3;

import java.util.Scanner;

public class CarRefuelingProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int f = scan.nextInt();
		int n = scan.nextInt();
		int[] arr = new int[n+2];
	
		arr[0] = 0;
		for(int i = 1; i < n + 1; i++)
			arr[i] = scan.nextInt();
		arr[arr.length-1] = l;
		
		int ctr = 0;
		int distLeft = f;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i+1] - arr[i] <= f) {
				if(distLeft < arr[i+1] - arr[i]) {
					//re-fueling
					ctr++;
					distLeft = f;
				}
				distLeft -= arr[i+1] - arr[i];
			} else {
				ctr = -1;
				break;
			}
		}
		System.out.println(ctr);
		scan.close();
	}

}
