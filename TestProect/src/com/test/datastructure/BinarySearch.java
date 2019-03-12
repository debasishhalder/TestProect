package com.test.datastructure;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 7, 10, 34, 56, 78, 89 };
		int n = arr.length;
		int x = 101;
		int result = findIndex(arr, x, 0, n - 1);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	static int findIndex(int[] sortedArr, int n, int l, int r) {
		if (l <= r) {
			int mid = l + (r - l) / 2;
			if (sortedArr[mid] == n)
				return mid;

			if (sortedArr[mid] > n)
				return findIndex(sortedArr, n, l, mid - 1);

			return findIndex(sortedArr, n, mid + 1, r);
		}
		return -1;
	}
}
