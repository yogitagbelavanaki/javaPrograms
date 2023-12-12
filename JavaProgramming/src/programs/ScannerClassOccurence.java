package programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ScannerClassOccurence {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string data...");
		String s_data = s.nextLine();
		
		HashMap<Character, Integer> hash=new HashMap<Character,Integer>();
		
		char[] charArray = s_data.toCharArray();
		
		for(char ch:charArray) {
			
			if(hash.containsKey(ch)) {
				hash.put(ch, hash.get(ch)+1);
			}
			else {
				hash.put(ch, 1);
			}
		}
		
		for(Entry<Character, Integer> entry : hash.entrySet()){
			System.out.print(entry.getKey()+""+entry.getValue());
		}
	}

}
