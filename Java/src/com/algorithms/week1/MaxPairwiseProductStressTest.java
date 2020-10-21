package com.algorithms.week1;

import java.util.Scanner;

public class MaxPairwiseProductStressTest {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
	        int n = (int)(Math.random() * 1000) + 2;
	        System.out.println(n);
	        int[] a = new int[n];
	        for(int i = 0; i < n; i++) {
	            a[i] = (int)(Math.random() * 1000000);
	        }
	        for( int i = 0; i < n; i++)
	            System.out.print(a[i]+" ");
	        System.out.println();
	        long res1 = MaxPairwiseProduct.maxPairwiseProduct(a);
	        long res2 = MaxPairwiseProductFast.maxPairwiseProductFast(a);
	        if(res1 != res2) {
	            System.out.println("Wrong Answer: "+res1+" "+res2);
	            break;
	        } else {
	            System.out.println("OK");
	        }
	    }

	    int n = scan.nextInt();
	    int[] numbers = new int[n];
	    for(int i = 0; i < n; i++) {
	    	numbers[i] = scan.nextInt();
		}
	    
	    long result = MaxPairwiseProductFast.maxPairwiseProductFast(numbers);
	    System.out.println(result);
		scan.close();
	}
 	
}