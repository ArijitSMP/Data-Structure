package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static int[] selectionSort(int []a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			int curr=i;
			for(int j=i+1;j<n;j++) {
//				int next=j;
				if(a[j]<a[curr])
					curr=j;
			}
			//curr(index) value with i(index) value , please swap
			// x = a[curr] , y=a[i]
			a[i]=a[curr]-a[i]+(a[curr]=a[i]);
		}
		return a;
	}
	public static void main(String[] args) {
		int a[]= {2,1,4,3,5};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(selectionSort(a)));
	}
}
