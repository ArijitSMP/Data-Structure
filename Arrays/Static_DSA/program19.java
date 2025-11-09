package Static_DS;

import java.util.Scanner;

//write a program to print the sum of the number using recursion.
public class program19 {

	static int sum=0;
	public static void number(int count) {
		if(count==0)
			return;
		sum=sum+count;
		count --;
		number(count);
		
	}
	
	public static int makeSum(int n,int e) {
		
		if(n==e)
			return e;
		
		return (n + makeSum(n+1,e)); 
	}
//Reverse order
public static int makeSumInReverse(int n,int e) {
		
		if(n==e)
			return e;
		
		return (n + makeSum(n-1,e)); 
	}

// print the multiplication of number from 1 to n using recursion.

	public static int findFactorial(int n) {
		
		if(n==1 || n==0)
			return 1;
		
		return (n*findFactorial(--n));
	}
	
// print the sum of even numbers from n-1 using recursing.
	public static int evenSum(int n) {
		
		if(n==2)
			return n;
		if(n%2==0)// if even numbers then add do recursive call for another number.
		return n+ evenSum(--n);  
		
		else
			// if not just do recursive call for another number.
			return evenSum(--n);
	}
	
// print the sum of even numbers from n-1 using recursing.
	public static int oddSum(int n) {
		
		if(n==1)
			return n;
		if(n%2!=0)// if even numbers then add do recursive call for another number.
		return n+ oddSum(--n);  
		
		else
			// if not just do recursive call for another number.
			return oddSum(--n);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
//		System.out.println("Enter the last number : ");
//		int e=sc.nextInt();
//		number(n);
//		System.out.println("output is : "+sum);
//		System.out.println("output is : "+makeSum(n,e));
//		System.out.println("output is : "+makeSumInReverse(n,e));
//		System.out.println("output is : "+findFactorial(n));
//		System.out.println("output is : "+evenSum(n));
		System.out.println("output is : "+oddSum(n));
		
	}
}
