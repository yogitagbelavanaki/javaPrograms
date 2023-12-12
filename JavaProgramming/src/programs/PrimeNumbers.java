package programs;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int count=0;
		for(int i=1;i<=25;i++) {
			count=0;
			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
					count ++;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
	}
}