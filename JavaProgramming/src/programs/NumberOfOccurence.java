package programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class NumberOfOccurence {

	public static void main(String[] args) {
		
	/*	String s="hi hello welcome to your home town";
		char ch='h';
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("The number of times h occurs is "+count);  */
		
		String s="hi hello welcome to your home town";
		char[] charArray = s.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(char ch:charArray) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		
		for(Entry<Character, Integer> entry:hm.entrySet()) {
			if(entry.getKey()=='h') {
				System.out.println(entry.getKey()+"    "+entry.getValue());
			}
		}
	}

}
