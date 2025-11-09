package Searching;

public class LinearSearch {

	public static int limear(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key)
				return i;
		}
		return -1; 
	}
	public static void main(String[] args) {
		int arr[]= {1,5,7,8,4,2,};
		int key=5;
		int index=limear(arr, key);
		if(index!=-1)
			System.out.println("The key is : "+index);
		
		else
			System.out.println("key is not found");
	}
} 
