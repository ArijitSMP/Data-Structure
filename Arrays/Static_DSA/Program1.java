package Static_DS;

//sum of the all the element in the array
public class Program1 {	
	
	public static void sum(int []a) {
		int sum=0;
		for(int i:a) {
			sum=sum+i;
		}
		System.out.println("Answer is "+sum);
		
	}
	
	public static void main(String[] args) {
		int []a= {1,2,5,4,8};
		sum(a);
	}
}
