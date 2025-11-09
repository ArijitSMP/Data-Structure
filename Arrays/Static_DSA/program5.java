package Static_DS;

//Fast smallest number in the array.
public class program5 {

	public static void smallest(int a[]) {
		int min=Integer.MAX_VALUE;
		for(int i:a) {
			if(i<min) {
				min=i;
			}
		}
		System.out.println("Output is "+min);
	}
	public static void main(String[] args) {
		int a[]= {8,7,5,4,2,3,4,1,5};
		smallest(a);
	}
}
