package com.algorithms.week3;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxNumberOfPrizes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> nos = new ArrayList<Integer>();

		if (n == 2) {
			nos.add(2);
		} else {
			int i=1;
			while (n > 0) {
				if (n - i <= i) {
					i = n;
				}
				nos.add(i);
				n -= i;
				i++;
			}
		}
		
		System.out.println(nos.size());
		for(int i1 = 0; i1<nos.size();i1++)
			System.out.print(nos.get(i1)+" ");
		System.out.println();
		scan.close();
	}

}
