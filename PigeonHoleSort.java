package com.code;

import java.util.Arrays;

public class PigeonHoleSort {
	public static void main(String[] args) {
		int []a ={12,2,1,44,67,8765,55,2};
		HeapSort.printArray(a);
		System.out.println("After sorting , array will be");
		pigeonhole_sort(a, a.length);
		HeapSort.printArray(a);

	}

	public static void pigeonhole_sort(int arr[], int n) {
		int min = arr[0];
		int max = arr[0];
		int range, i, j, index;

		for (int a = 0; a < n; a++) {
			if (arr[a] > max)
				max = arr[a];
			if (arr[a] < min)
				min = arr[a];
		}

		range = max - min + 1;
		int[] phole = new int[range];
		Arrays.fill(phole, 0);

		for (i = 0; i < n; i++)
			phole[arr[i] - min]++;

		index = 0;

		for (j = 0; j < range; j++)
			while (phole[j]-- > 0)
				arr[index++] = j + min;

	}

}
