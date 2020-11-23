package com.algorithms.week4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class InversionsCount {
	public static long inversions = 0;
		
	public static int[] sortAndCountInversions(int[] a) {
		
		if(a.length == 1) { 
			return a;
		} else { 
			int[] firstHalf = sortAndCountInversions(Arrays.copyOfRange(a,0, a.length/2));
			int[] secondHalf = sortAndCountInversions(Arrays.copyOfRange(a, (a.length/2), a.length));
			return mergeAndCountSplitInversions(firstHalf, secondHalf); 
		}
	}
	
	public static int[] mergeAndCountSplitInversions(int[] a, int[] b) {
		int j = 0; 
		int k = 0; 
		
		int[] result = new int[a.length+b.length];

		for(int i = 0; i < result.length; i++) {
			if(j < a.length && k < b.length) { 
				if(a[j] <= b[k]) {
					result[i] = a[j];
					j++;
				} else {
					result[i] = b[k];
					k++;
					

					inversions += a.length - j; 
				}
				
			} else if(j < a.length) { 
				result[i] = a[j];
				j++;
			} else if(k < b.length) { 
				result[i] = b[k];
				k++;
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		inversions = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] numbers = new int[n];
		for(int i =0; i<n;i++) {
			numbers[i] = scan.nextInt();
		}
		sortAndCountInversions(numbers);
		System.out.println(inversions);
		scan.close();
	}
}