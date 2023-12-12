package programs;

public class SumOfNumberMultiplesOfThree {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=26;i<=70;i++) {
			
			if(i % 3==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
