package Stack;

import java.util.Stack;

public class ToPointerStack {

	public static boolean checkBalancesWithStack(String s) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='{' || c=='[' ||  c=='(') // if it is opening bracket push to stack
				stack.push(c);
			
			else {
				if(stack.isEmpty()) // if Stack become empty while iterating stack ,return false
					return false;
				
				else {
					char poped = stack.pop(); // pop if character is closing
					if(poped=='{' && (c==')' || c==']'))
						return false;
					
					if(poped=='(' && (c=='}' || c==']'))
						return false;
					
					if(poped=='[' && (c==')' || c=='}'))
						return false;
				}
			}
		}
		return true;
	} 
	
	public static void main(String[] args) {
		String s= "{[()]}";
		System.out.println(checkBalancesWithStack(s));
	}
}
