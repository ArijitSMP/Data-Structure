package Static_DS;

import java.util.Scanner;

//write a program to print 1 to n using recurtion and n is user throw input.
public class program18 {

	public static void number(int count,int n) {
		if(count>n)
			return;
		System.out.println(count);
		count ++;
		number(count,n);
	}
// Print the reverse order.
	public static void printRev(int count) {
		if(count==0)
			return;
		System.out.println(count);
		count --;

		printRev(count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		printRev(n);
	}
}
