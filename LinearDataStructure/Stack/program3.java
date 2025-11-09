package Stack;

import java.util.Arrays;

public class program3 {

	
	public static void nextGreater(int []a) {
		int []res=new int[a.length];
		for(int i=0;i<a.length;i++) {
			boolean flag=true;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]){
					res[i]=a[j];
					flag=false;
					break;
				}
			}
			if(flag)
				res[i]=-1;
		}
		System.out.println(Arrays.toString(res));
	}
	public static void main(String[] args) {
		int []a= {4,5,2,3,25};
		nextGreater(a);

	}

}
