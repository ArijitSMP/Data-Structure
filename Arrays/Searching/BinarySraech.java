package Searching;

import java.util.Arrays;

import Sorting.MargeSort;

public class BinarySraech {

	public static int binary(int arr[], int key) {
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			int mid= low+(high-low);
			
			if(key==arr[mid])
				return mid;
			
			else if(key<=arr[mid])
				high=mid-1;
			
			else
				low=mid+1;
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,5,7,8,4,2};
		Arrays.sort(arr);//Searching first
		System.out.println(Arrays.toString(arr));
		int key=8;
		int index=binary(arr, key);
		if(index!=-1)
			System.out.println("The key is : "+index);
		
		else
			System.err.println("key is not found");
	}
}
