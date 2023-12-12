package programs;

public class SwapTwoNumberWithout3rd {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		b=a+b; //30
		a=b-a; //20
		b=b-a;
		
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
	}
}