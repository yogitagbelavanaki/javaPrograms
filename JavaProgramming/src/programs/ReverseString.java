package programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="ELF2021SELENIUM";
		String y="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			char ch = s.charAt(i);
			y=y+ch;
		}
		System.out.println(y);
	}

}
