package Stack;

import java.util.Stack;

public class Revarce {

	public static String reverse(String s) {
		Stack<Character> stack=new Stack<>();
//		System.out.println("Enter the Stack value : ");
		for (Character c : s.toCharArray()) {
			stack.push(c);
		}
		String rev="";
		
		while(!stack.isEmpty()) {
			rev = rev+stack.pop();
		}
		return rev;
	}
	
	public static void main(String[] args) {
		String s="java";
		System.out.println(reverse(s));
	}

}
