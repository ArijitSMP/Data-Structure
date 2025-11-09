package Static_DS;

//Recreation 
public class program16 {

	public static void name(int count) {
//		 if(count ==4)
//			return; 
//		System.out.println("hi");
//		count ++;	
//		name(count);
		if(count <1)
			return; 
		System.out.println("Sheela");
		count --;	
		name(count);
		System.out.println("by");
	}
	public static void main(String[] args) {
		name(5);
	}
}
