package Static_DS;

import java.util.Arrays;

public class program8 {

	public static int[] leftRotate(int []a,int n) {
		n=n%a.length;  //To avoid unnecessary rotation.
		if(n>0) {
		while(n!=0) {
			for(int i=1;i<a.length;i++) {
				int temp=a[i-1];
				a[i-1]=a[i];
				a[i]=temp;
				
			}
			n--;
		}
		}
		return a;
		
	}
	public static void main(String[] args) {
		int a[]= {7,8,5,4,2,1};
		System.out.println("Before rotate = "+Arrays.toString(a));
		int b[]=leftRotate(a,3);
		System.out.println("After rotate = "+Arrays.toString(b));
	}
}
