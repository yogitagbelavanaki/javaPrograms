package programs;

public class PalindromeOrNot {

	public static void main(String[] args) {
		
		int y=1234321;
		int a=y;
		int s=0;
		
		while(y!=0) {
			
			int rem=y%10;
			s=s*10+rem;
			y=y/10;
		}
		
		
		if(s==a) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
