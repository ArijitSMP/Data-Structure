package Stack;

import java.util.Stack;
//Program to remove the Adjacent and Duplicate Character.
public class Program2 {

	public static String removeAbjointDublicate(String s) {
		Stack<Character> stack= new Stack<>();
		StringBuffer sb = new StringBuffer("");
		for (int i=0;i<s.length();i++) {
			if(stack.isEmpty() || !stack.peek().equals(s.charAt(i)))
				stack.push(s.charAt(i));
			else
				stack.pop();  
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		String s[]= {"abba","abaab","aaaba","aabcada"};
		for(String str: s) {
			System.out.println(str+" --------> "+removeAbjointDublicate(str));
		}
	}
}
