package Static_DS;
//write a program to print your name 20 times using recurtion.
public class program17 {

	public static void name(int count) {
		if(count<0)
			return;
		
		System.out.println("Arijit");
		count --;
		name(count);
	}
	public static void main(String[] args) {
		name(20);
	}
}
