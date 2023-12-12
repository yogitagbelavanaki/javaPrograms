package programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicateCharacterinGivenString {

	public static void main(String[] args) {
		
		String s="my name is mohan and i am from mangalore";
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		for(Entry<Character, Integer> entry:hm.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"    "+entry.getValue());
			}
		}
	}
}