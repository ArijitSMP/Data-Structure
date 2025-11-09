package Static_DS;

public class progeam6 {

	public static void SecoendSmallest(int a[]) {
		int min1=Integer.MAX_VALUE;
		for(int i:a) {
			if(i<min1)
				min1=i;
		}
		int min2=Integer.MAX_VALUE;
		for(int i:a) {
			if(i<min2 && i!=min1)
				min2=i;
		}
		System.out.println("Answer is "+min2);
	}
	public static void main(String[] args) {
		int a[]= {4,5,7,8,1,2,3};
		SecoendSmallest(a);
	}
}
