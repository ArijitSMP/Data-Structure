package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static int[] bubbleSort(int []a) {
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					a[j]=a[j-1]-a[j]+(a[j-1]=a[j]);
					flag=false;
				}
			}
			if(flag==true)
				break;
		} 
		return a;
	}
	public static void main(String[] args) {
		System.out.println("Unsort Array");
		int a[]= {1,3,2,5,4};
		System.out.println(Arrays.toString(a));
		System.out.println("Sort Array");
		System.out.println(Arrays.toString(bubbleSort(a)));
	}
}
