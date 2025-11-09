package Static_DS;

import java.util.Arrays;

//Merge two array
public class program2 {

	public static int[] merge(int []a,int []b) {
		int []c=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
			else {
				c[i]=b[k++]; 
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int a[]= {4,5,7,8};
		int b[]= {0,9,7,3,1};
		int c[]=merge(a, b);
		System.out.println(Arrays.toString(c));
	}
}
