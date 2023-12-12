package program;

public class SwapTwoNumWOThirdVariable {
	
	public static void main(String[] args) {
		
		int a=35;
		int b=20;
		System.out.println("Before: "+a+" "+b);
		a=a+b; //a=30
		b=a-b; //b=10
		a=a-b;
		System.out.println("After: "+a+" "+b);
		
	}

}
