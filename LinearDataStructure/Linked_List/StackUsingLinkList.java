package Linked_List;

import java.util.Scanner;

public class StackUsingLinkList {
	
	Node head; 
	Node tail;
	int size;
	
	public boolean isEmpty() {
		return head==null;
	}
	public void push(int data) {
		Node newNode = new Node(data);
		if(isEmpty())
			head = tail = newNode;
		else {
			tail.next=newNode;
			tail = newNode;
		}
			size++;
			System.err.println(this);
	}
	
	public void pop() {
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			Node temp=head;
			while(temp.next!=tail) {
				temp = temp.next;
			}
			temp.next=null;
			tail=temp;
		}
		size--;
		System.err.println(this);
	}
	
	public void peek() {
		System.err.println("The peek value is : "+tail.data);
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
		Scanner sc = new Scanner(System.in);
		StackUsingLinkList sul = new StackUsingLinkList();
		boolean flag=true;
		while(flag) {
			System.out.println("=============================");
			System.out.println("1.Add data \n2.Remove the data \n3.Peek");
			System.out.println("=============================");
			System.out.println("Enter your choise : ");
			int ch=sc.nextInt();
			System.out.println("=============================");
			switch (ch) {
			case 1: 
				System.out.println("Enter the value : ");
				int data = sc.nextInt();
				sul.push(data);
				System.out.println(sul);
				
				break;
				
			case 2 :
				sul.pop();
				
				break;
				
			case 3 :
				sul.peek();
				
				break;
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}
	}
}
