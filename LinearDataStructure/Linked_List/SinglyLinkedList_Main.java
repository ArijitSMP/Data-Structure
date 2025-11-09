package Linked_List;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class SinglyLinkedList_Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Singly_Linked_List sll = new Singly_Linked_List();
		boolean flag=true; 
		
		while(flag) {
			System.out.println("***Welcome to Singly Link List*****");
			System.out.println("1.Add the value of list\n2.Display\n3.Get Size "
					+ "\n4.Add the first value\n5.Add the value in any position "
					+ "\n6.Remove from first \n7.Remove from Last"
					+ "\n8.RemoveAtAnyPosition\n9.Searehing the element\n10.Exit");
			System.out.println("*********");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1: System.out.print("Enter the data :");
						int data = sc.nextInt();
						
							sll.addLast(data);
							System.err.println(sll);
						
						break;
						
				case 2 :
							sll.toString();
							System.err.println(sll);
						
						break;
						
				case 3 : 
							System.err.println("The size is : "+sll.getSize());
						
						break;
						
				case 4 :
					System.out.print("Enter the data :");
					int data1 = sc.nextInt();
					
						sll.addFirst(data1);
						System.err.println(sll);
					
					break;
					
				case 5 :
					try {
					System.out.println("Enter the index : ");
					int index = sc.nextInt();
					
					System.out.print("Enter the data :");
					int data2 = sc.nextInt();
					
						sll.specificIndex(index, data2);
						System.err.println(sll);
					}
					catch(IndexOutOfBoundsException e){
						e.getMessage();
					}
					
					break;
					
				case 6 :
					try {
						sll.removeFirst();
					}
					catch(NoSuchElementException e){
						e.printStackTrace();
					}
					
					break;
					
				case 7 :
						try {
							sll.removeLast();
						}
						catch(IndexOutOfBoundsException e){
							e.printStackTrace();
						}
						
						break;
						
				case 8 :
					System.out.println("Enter the position : ");
					int index = sc.nextInt();
					sll.removeAtAnyPosition(index);
					
					break;
					
				case 9 :
					System.out.println("Enter the founding element : ");
					int data2 = sc.nextInt();
					int i=sll.searching(data2);
					System.err.println("The index no is : "+i);
					
					break;
				
				case 10 : 
					flag = false;
					
					break;
					
				
				default : System.err.println("Invalid option");
				
		}
		
		}		

	}
 
}
