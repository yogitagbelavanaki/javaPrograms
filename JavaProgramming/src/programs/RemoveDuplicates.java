package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String s="sandeep";
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> ls=new LinkedHashSet<>();
		
		for(char charat:ch) {
			ls.add(charat);
		}
		
		for(Character removed:ls) {
			System.out.print(removed);
		}
	}	
}
