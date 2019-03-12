package com.test.datastructure;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 10, 23, 1, 3, 13, 21, 45, 32, 55, 54 };
		int n = 100;
		int index = linearSearch(arr, n);
		if(index == -1) 
	        System.out.print("Element is not present in array"); 
	    else
	        System.out.print("Element is present at index " + index);
	}

	static int linearSearch(int[] arr, int n) {
		/*int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				index = i;
			}
		}
		return index;*/
		
		
		if(arr==null)
			return -1;
		
		int length = arr.length;
		int i=0;
		while(i<length) {
			if(arr[i]==n)
				return i;
			else
				i++;
		}
		return -1;
	}

}
