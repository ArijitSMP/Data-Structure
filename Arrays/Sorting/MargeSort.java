package Sorting;

import java.util.Arrays;

public class MargeSort {

	public static void devide(int []arr,int s,int e) {
		if(s>=e) // It is the based condition where the recursion is stop.
			return;
		//Here s is the starting index and e is the ending index.
		// mid is the middle index of the given index.
		int mid=s+(e-s)/2;
		devide(arr, s, mid);
		devide(arr, mid+1, e);
		merged(arr, s, e, mid);
	}
	public static void merged(int []arr,int s,int e,int mid) {
		int index1=s;
		int index2=mid+1;
		int marged[]=new int[e-s+1];
		int x=0;
		
		while(index1<=mid && index2<=e) {
			if(arr[index1]<=arr[index2])
			marged[x++]=arr[index1++];
			
			else
				marged[x++]=arr[index2++];			
		}
		
		while(index1<=mid) {
			marged[x++]=arr[index1++];
		}
		while(index2<=e) {
			marged[x++]=arr[index2++];
		}
		
		for(int i=s,j=0;j<marged.length;i++,j++) {
			arr[i]=marged[j];
		}
	}
	
	public static void main(String[] args) {
		int a[]= {2,1,4,3,5};
		System.out.println(Arrays.toString(a));
		devide(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
}
