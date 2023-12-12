package programs;

public class ReverseMyNameisYouName {

	public static void main(String[] args) {
		
		String s="My name is YOURNAME";
		
		String[] y = s.split(" ");
		
		for(int i=y.length-1;i>=0;i--) {
			System.out.print(y[i]+" ");
		}
	}
}