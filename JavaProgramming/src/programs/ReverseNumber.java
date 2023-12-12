package programs;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int s=123145;
		int rev=0;
		
		while(s!=0) {
			int rem = s%10;
			rev=rev*10+rem;
			s=s/10;
		}
		
		System.out.println(rev);
	}
}