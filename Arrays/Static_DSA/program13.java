package Static_DS;

// write a program to find the maximum sum of sub array of size A.
public class program13 {

	public static int sum(int []a, int n, int k) {
		int max=0;
		for(int i=0;i<=n-k;i++) {
			int sum=0;
			for(int j=i;j<i+k;j++) {
				sum =sum+a[j];
			} 
			if(max<sum)
			max=sum;
		}		
		return max;
	}
	public static int sub(int []a, int n, int k) {
		int max=0;
		for(int i=0;i<k;i++) {
			max=max+a[i];
		}
		int Current_sum =max;
		for(int j=k;j<n;j++) {
			Current_sum=Current_sum+a[j]-a[j-k];
			max=Math.max(max, Current_sum);
		}
		return max; 
	}  
	
	public static void main(String[] args) {
		int []a= {2,1,5,1,3,2};
		int n=a.length;
		int k=3;
		System.out.println("Output is = "+sub(a,n,k));
		System.out.println("Output is = "+sum(a,n,k));
	}

}
