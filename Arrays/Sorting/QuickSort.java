package Sorting;

import java.util.Arrays;

public class QuickSort {

	public static void swap(int arr[], int i, int j) {
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp; 
	}
	
	public static int partition(int arr[], int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		int j=low;
		
		for( ;j<=high-1;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr, i, j);
			}
		} 
		swap(arr, i+1, high);
		return i+1;
		
	}
	
	public static void quickSort(int []arr, int low, int high) {
		if(low>=high)
			return;
		
		int partion = partition(arr, low, high);
		
		quickSort(arr, low, partion-1);
		quickSort(arr, partion+1, high);
	}
	
	public static void main(String[] args) {
		int a[]= {2,1,4,3,5};
		System.out.println(Arrays.toString(a));
		quickSort(a,0,a.length-1); 
		System.out.println(Arrays.toString(a));

	}

}
