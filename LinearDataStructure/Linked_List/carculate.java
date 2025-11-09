package Linked_List;

import java.util.Scanner;

public class carculate {

	Node head;
	Node tail;
	private int size;
	
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return head==null; 
	}
	
	public void carc(int data) {
		Node newNode = new Node(data);
		if(isEmpty())
			head = tail = newNode;
		
		else {
			tail.next = newNode;
			tail = newNode;
		}
		
		size++;
		System.err.println(this);
	}
	
	public String toString(){
		String s="[ ";
		
		if(isEmpty())
			return s +" ]";
		else {
			Node temp = head;
			while(temp!=null) {
				if(temp!=tail)
					s=s+temp.data+" ,";
				else
					s=s+temp.data;
				
				temp = temp.next;
			}
			s = s + " ]";
			return s;
		}
	}

	public static void main(String[] args) {
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		while(flag) {
			System.out.println("Enter the data : ");
			int data = sc.nextInt();
			carculate cal=new carculate();
			cal.carc(data);
			System.out.println(cal);
		}
	}
}
