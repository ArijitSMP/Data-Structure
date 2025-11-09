package Static_DS;

import java.util.Arrays;

//Write a program to Adding the element at specific index.
public class program14 {

	public static int[] add_Value(int []a,int n,int index) {
		if(index<0 || index>=a.length)
			throw new ArrayIndexOutOfBoundsException("Invalid index");
		
		else {
			int b[]=new int[a.length+1];
			for(int i=0;i<b.length;i++) {
				if(i<index)
					b[i]=a[i];
				else if(i==index)
					b[i]=n;
				else
					b[i]=a[i-1];
			}
			return b;
		}
	}
	
	public static void main(String[] args) {
		int a[]= {5,8,7,9,4,3,2};
		int n=5;
		int index=4;
		int c[]=add_Value(a, n, index);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		
	}
}
