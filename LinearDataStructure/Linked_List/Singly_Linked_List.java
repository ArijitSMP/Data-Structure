package Linked_List;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Singly_Linked_List {

	Node head;
	Node tail;
	private int size;
	
	public int getSize() {
		return size; 
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty())
			head = tail = newNode;
		else {
			newNode.next= head;
			head=newNode;
		}
		size++;
		System.out.println(this);
	}
	
	public void addLast(int data) {
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
	
	public void specificIndex(int index , int data) {
		if(index<getSize() && index >= 0) {
			if(index==0)
				addFirst(data);
			else if(index == getSize()-1)
				addLast(data);
			
			else {
				Node newNode = new Node(data);
				
				int count=0;
				Node temp = head;
				while(count!=index-1) {
					temp = temp.next;
					count++;
				}
				newNode.next = temp.next;
				temp.next = newNode;
				size++;
			}
				
		}
		else
			throw new IndexOutOfBoundsException("Invalid index");			
	}
	public void removeLast() {
		if(isEmpty())
			throw new NoSuchElementException();
		else if(getSize()==1)
			head = tail = null;
		else {
			Node temp = head;
			while(temp.next!=tail) {
				temp=temp.next;//removing the 
			}
			temp.next=null;
			tail=temp;
		}
		size--;
		System.out.println(this);
	}
	
	public int searching(int data) {
		Node temp=head;
		int index=0;
		while(temp!=null) { 
			if(temp.data==data)
				return index;
			index++;	
			temp = temp.next;
		}
		return -1;
	}
	
	public void removeFirst() {
		if(isEmpty())
			throw new NoSuchElementException();
		else if(getSize()==1)
			head = tail = null;
		else
		{
//			Node temp =head;
//			head =head.next;
//			temp=null;
			//Bouth are same
			Node temp=head.next;
			head.next=null;
			head=temp;
			System.out.println(this);
		}
		size--;
		System.out.println(this);
	}
	public void removeAtAnyPosition(int index) {
		if(isEmpty())
			throw new NoSuchElementException();
		else if(index==0)
			removeFirst();
		else if(index==getSize()-1)
			removeLast();
		else{
			int count=0;
			Node temp = head;
			while(count != index-1) {
				temp = temp.next;
				count++;
			}
			Node x=temp.next;
			temp.next=temp.next.next; //or temp.next=x.next;
			x.next=null;
		}
		size--;
		System.out.println(this);
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
}
