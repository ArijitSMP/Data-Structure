package Static_DS;

//Find the fast maximum number
public class program3 {

	public static void maxNumber(int a[]) {
		
		int max=Integer.MIN_VALUE;
		for(int i:a) {
			if(i>max)
				max=i;
		}
		System.out.println("The max value is "+max);
	}
	public static void main(String[] args) {
		int a[]= {4,5,8,7,1,2};
		maxNumber(a);
	}
}
