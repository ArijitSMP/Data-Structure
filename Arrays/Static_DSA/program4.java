package Static_DS;

//Write the program to find the 2nd largest value.
public class program4 {

	public static void SecondMax(int a[]) {
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i:a) {
			if(i>max1) {
				max1=i;
			}
		}
		for(int i: a) {
			if(i>max2 && i!=max1) {
				max2=i;
			}
		}
		System.out.println("Answer is "+max2);
	}
	
	public static void main(String[] args) {
		int a[]= {8,7,9,2,1,4,5,3};
		SecondMax(a);
	}
}
