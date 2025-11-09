package Static_DS;

public class program10 {

	public static void missingNumber(int a[]) {
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=(a[i+1]-1)) {
				System.out.println("Missing number is ="+(a[i]+1));
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {2,3,5,7,8,10};
		missingNumber(a);
	}
}
