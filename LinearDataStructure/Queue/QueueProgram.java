package Queue;

public class QueueProgram {

		int [] arr;
		int front,rear,capacity;
		
		public QueueProgram(int capacity) {
			this.capacity=capacity;
			arr=new int[capacity];
			front = rear = -1;
		} 
		public boolean isEmpty() {
			return (front == -1 || rear == -1);
		}
		public boolean isFull() {
			return (rear+1)%capacity==front;
		}
		public void enqueue(int data)throws QueueException {
			if(isFull())   
				throw new QueueException("Queue is Full");
			
			else {
				if(isEmpty())
					front = rear =0;
				else
					rear=(rear+1)%capacity;
			
			arr[rear]=data;
			System.out.println("Data is sucessfully inserting");
			}
		}
		
		public void dequeue() throws QueueException {  
			if(isEmpty())  
				throw new QueueException("Queue is Empty");
			else {
				int data = arr[front];
				if(rear == front) 
					rear = front = -1;
				
				else
					front=(front+1)%capacity;
				System.out.println("Data is sucessfully removig");
			}
			
		}
		public int peek() throws QueueException {
			if(!isEmpty())
				throw new QueueException("Queue Underflow");
			else
				return arr[front];
		}
		@Override
		public String toString(){
	        String s ="[";
	        if(!isEmpty()){
	            for(int i=front;i!=rear;i=(i+1)%capacity){
	                s+=arr[i]+", ";
	            }
	            s+=arr[rear];
	        }
	        s+="]";
	        return s;

	    }
}
	
	

