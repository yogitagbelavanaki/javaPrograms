package programs;

public class Fibonacci {

	public static void main(String[] args) {
		
		int s=0,y=1,a;
		
		for(int i=2;i<10;i++) {
			a=s+y;
			System.out.println(a);
			s=y;
			y=a;
		}

	}

}
