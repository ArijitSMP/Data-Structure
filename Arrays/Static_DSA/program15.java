package Static_DS;

import java.util.Arrays;

//Write a program to Removing the element at specific index.
public class program15 {

	public static int[] removing(int []a,int index) {
		if(index<0 || index>=a.length)
			throw new ArrayIndexOutOfBoundsException("Invalid index");
		
		else {
			int b[]=new int[a.length-1];
			for(int i=0;i<b.length;i++) {
				if(i<index)
					b[i]=a[i];
				else {
					b[i]=a[i+1];
				}
			}
			return b;
		}
	}
	public static void main(String[] args) {
		int a[]= {5,8,7,9,4,2,3};
		int index=4;
		int c[]=removing(a, index);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
	}
}
