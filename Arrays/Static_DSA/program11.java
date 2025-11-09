package Static_DS;

import java.util.Arrays;

//Find the pairs of number whose 
public class program11 {

	public static void findPair(int []a,int terget) {
//		int b[]=new int[2];
//		System.out.println("The pair is =");
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]+a[j]==terget) {
//					b[0]=a[i];
//					b[1]=a[j];
//				}
//				
//			}
//			System.out.println(Arrays.toString(b));
//		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==terget) {
					System.out.println("{ "+a[i]+","+a[j]+" }");
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		findPair(a, 6);
		
	}
}
