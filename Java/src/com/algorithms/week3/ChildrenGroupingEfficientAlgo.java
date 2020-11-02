package com.algorithms.week3;

import java.util.Arrays;
import java.util.Scanner;

public class ChildrenGroupingEfficientAlgo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		float[] children = new float[n];
		for (int i = 0; i < n; i++)
			children[i] = scan.nextInt();

		Arrays.sort(children);
		int groups = getGroups(children);
		System.out.println(groups);
		scan.close();
	}

	public static int getGroups(float[] children) {
		int lastChild = children.length;
		int currentChild = 1;
		int startingPoint = 0;
		int groups = 0;

		while (currentChild < lastChild) {
			if (children[currentChild] - children[startingPoint] > 1) {
				startingPoint = currentChild;
				groups++;
			}

			if (currentChild == lastChild - 1) {
				groups++;
			}
			currentChild++;
		}

		return groups;
	}
}
