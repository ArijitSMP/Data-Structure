package Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int []a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>=key) { //loop continues until we find the correct position of key 
				a[j+1]=a[j];
				j--; //Decrementing j to search for another value which is still greater
			}
			a[j+1]=key; //copy the key to the next index of j
		}
	}
	public static void main(String[] args) {
		int a[]= {2,1,4,3,5};
		System.out.println(Arrays.toString(a));
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
