package Static_DS;

import java.util.Arrays;

public class program9 {

		public static int[] leftRotate(int []a,int n) {
			n=n%a.length;  //To avoid unnecessary rotation.
			if(n>0) {
			while(n!=0) 
			{
				for(int i=a.length-1;i>0;i--) 
				{
					// x--> a[i]    y--> a[i-1]
					int temp=a[i];
					a[i]=a[i-1];
					a[i-1]=temp;
					 
				}
//				for(int i=a.length-2;i>=0;i--) {
//					int temp=a[i];
//					a[i]=a[i+1];
//					a[i+1]=temp;
//					
//				}
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

