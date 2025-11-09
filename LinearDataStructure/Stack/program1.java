package Stack;

public class program1 {

	int arr[];
	int capacity;
	int top;
	
	program1(int caparity){
		arr = new int [caparity];
		this.capacity=caparity;
		top=-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==capacity-1;
	}
	
	public void push(int data) {
		if(isFull())
			throw new StackError("Stack is full");
		
		else {
			arr[++top]=data;
			System.out.println("sucessfully inserted");
		}
	}
	
	public void pop() {
		if(isEmpty())
			throw new StackError("Stack is Empty");
		
		else {
			int data = arr[top--];
			System.out.println("sucessfully removing");
		}
	}
	
	public int peek() {
		if(isEmpty())
			throw new StackError("Stack is Empty");
		
		else
			return arr[top];
	}
	
	
	@Override
	public String toString() {
		String s="[";
		for(int i=0;i<=top;i++)
		{
			if(i!=top)
				s = s + arr[i] +",";
			else
				s = s + arr[i] ;
		}
		
		s = s +"]";
		
	return s;
	}

}
