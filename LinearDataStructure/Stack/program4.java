package Stack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class program4 {

	public static void nextGreater(int []a) {
		Stack<Integer> stack=new Stack<>();
		
		int res[]=new int [a.length];
		for (int i=res.length-1;i>=0; i--) {
			while(!stack.isEmpty() && a[i]< stack.peek())
				stack.pop();
				
			res[i]=stack.isEmpty() ? -1 : stack.peek();
			stack.push(a[i]);
		}
		System.out.println(Arrays.toString(res));
	}
	public static void main(String[] args) {
		int []a= {4,5,2,3,25};
		nextGreater(a);

	}

}
