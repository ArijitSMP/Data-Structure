package Static_DS;

// Given array is palindrom
public class program12 {

	public static boolean findPalindrom(int []a) {
		int start=0;
		int end=a.length-1; 
		while(start<end) {
			if(a[start]!=a[end]) {
				return false;
			}
			start++;
			end--;
		} 
		return true;
	}
	public static void main(String[] args) {
		int []a= {4,2,3,5,3,2,4};
		
		System.out.println(findPalindrom(a));
	}
}
