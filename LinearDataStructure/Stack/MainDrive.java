package Stack;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {      
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		program1 p=new program1(sc.nextInt());
		boolean flag=true;
		
		while(flag) {
			System.out.println("***Welcome to stacks*****");
			System.out.println("1.Push\n2.Pop\n3.Peek\n4.isEmpty?\n5.isFull?\n6.Display\n7.Exit");
			System.out.println("*********");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1: System.out.print("Enter the data :"); int data = sc.nextInt();
						try
						{
							p.push(data);
							System.err.println(p);
						}
						catch(StackError e)
						{
							System.err.println(e.getMessage());
						}
						
						break;
						
				case 2 : try 
						{
							p.pop();
							System.err.println(p);
						}
						catch(StackError e)
						{
								System.err.println(e.getMessage());	
						}
				
						break;
						
				case 3 :  try 
						{
							System.out.println(p.peek());
						}
						catch(StackError e)
						{
								System.err.println(e.getMessage());	
						}
				
						break;
				
				case 4 : System.out.println(p.isEmpty() ? "stack is empty" : "stack is not empty");
						 break;
				
				case 5 : System.out.println(p.isFull() ? "stack is full" : "stack is not full");
				
						break;
						
				case 6 : System.err.println(p); break;
				
				case 7 : flag = false; break;
				
				default : System.err.println("Invalid option");
				
		}
		
		}		
	}

}
