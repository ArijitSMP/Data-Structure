package Static_DS;

import java.util.Arrays;

//Write the program to left rotate the element
public class progeam7 {
	
	public static int [] leftRotate(int a[]) {
		int temp=a[0];
		for(int i=1;i<a.length;i++) {
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		return a;
	}

	public static void main(String[] args) {
		int a[]= {8,7,2,4,5,1};
		System.out.println("Brfore the left rotate = "+Arrays.toString(a));
		int b[]=leftRotate(a);
		System.out.println("After the left rotate = "+Arrays.toString(b));
	}
}
