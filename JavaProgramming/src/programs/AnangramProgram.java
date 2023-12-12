package programs;

import java.util.Arrays;

public class AnangramProgram {

	public static void main(String[] args) {
		
		String s1="Van";
		String s2="anV";
		
		String altered_s1 = s1.toLowerCase();
		String altered_s2 = s2.toLowerCase();
		
		if(altered_s1.length()==altered_s2.length()) {
			char[] s1_array = altered_s1.toCharArray();
			char[] s2_array = altered_s2.toCharArray();
			
			Arrays.sort(s1_array);
			Arrays.sort(s2_array);
			if(Arrays.equals(s1_array, s2_array)) {
			System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}
		else {
			System.out.println("Not anagram");
		}
	}
}