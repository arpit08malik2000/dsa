package com.algorithms.week3;

import java.util.Scanner;

public class MoneyChangeProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		int[] denominations = new int[] { 10, 5, 1 };
		int ctr = 0;
		while (money > 0) {
			if (money - denominations[0] >= 0) {
				money -= denominations[0];
				ctr++;
			} else if (money - denominations[1] >= 0) {
				money -= denominations[1];
				ctr++;
			} else if (money - denominations[2] >= 0) {
				money -= denominations[1];
				ctr++;
			}
		}
		System.out.println(ctr);
		scan.close();
	}

}
