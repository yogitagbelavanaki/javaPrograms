package programs;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String s="gadag";
		
		String y=s;
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			rev=rev+ch;
		}
		
		if(y.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
