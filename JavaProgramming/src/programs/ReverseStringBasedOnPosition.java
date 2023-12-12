package programs;

import java.util.Arrays;

public class ReverseStringBasedOnPosition {
	
	public static void main(String[] args) {

		String s="dogs are not allowed";
		 String[]arr=s.split(" ");
	//	String[]abb=new String[arr.length];
		//allowed are dogs not
   String  temp =arr[0];  
      arr[0]=arr[arr.length-1];
      arr[arr.length-1]       =arr[arr.length-2];
      arr[arr.length-2]=temp;
      for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}     	
	}
}