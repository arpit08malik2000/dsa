package com.algorithms.week3;

import java.util.Scanner;

public class FractionalKnapsackProblemGreedyAlgo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double W = scan.nextDouble();

		double[] values = new double[n];
		double[] weights = new double[n];
		for (int i = 0; i < n; i++) {
			values[i] = scan.nextDouble();
			weights[i] = scan.nextDouble();
		}

		double value = 0;
		while (W > 0) {
			int maxIndex = -1;
			for (int i = 0; i < weights.length; i++) {
				if ((i == 0) && (weights[i] != 0))
					maxIndex = i;
				else if (weights[i] != 0)
					if (values[i] / weights[i] > values[maxIndex] / weights[maxIndex])
						maxIndex = i;
			}
			if (maxIndex != -1) {
				double qty = weights[maxIndex];
				if (qty > W)
					qty = W;
				value += qty * values[maxIndex] / weights[maxIndex];
				weights[maxIndex] -= qty;
				W -= qty;
			}
			boolean needBreak = true;
			for(int i = 0; i< weights.length ; i++ ) {
				if(weights[i] != 0)
					needBreak = false;
			}
			if(needBreak)
				break;
		}
		System.out.println(value);
		scan.close();
	}

}
