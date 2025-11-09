package Stack;

public class ToPointer {

	
	public static boolean approch(String s) {
		int start=0;
		int end=s.length()-1;
		if(s.length()%2==1)
			return false;
		
		while(start<end) {
			char c1=s.charAt(start);
			char c2=s.charAt(end);
			
			
			if(c1=='{' && (c2==')' || c2==']'))
				return false;
			
			if(c1=='(' && (c2=='}' || c2==']'))
				return false;
			
			if(c1=='[' && (c2==')' || c2=='}'))
				return false;
			
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s= "{[()]}";
		System.out.println(approch(s));
		

	}

}
