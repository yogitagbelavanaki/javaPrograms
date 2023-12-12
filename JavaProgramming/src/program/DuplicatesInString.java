package program;

import java.util.TreeSet;

public class DuplicatesInString {
	 public static void main(String[] args) {
		 String sentence="Hello Hello my name is is Yogita";
		 usingLogic(sentence);
	}
	 public static void usingCollection(String sentence) {
		
			String[] sentenceArray=sentence.split(" ");
			TreeSet<String> hashset=new TreeSet<>();
			for(String word : sentenceArray) {
			hashset.add(word);
			}
			System.out.println(hashset);
	 }
	 public static void usingLogic(String sentence) {
		 
		 String[] sentenceArray=sentence.split(" ");
		 
		 for (int i = 0; i < sentenceArray.length; i++) {
			 int count=1;
			for (int j = i+1; j < sentenceArray.length; j++) {
				if(sentenceArray[i].equals(sentenceArray[j])) {
					count++;
					sentenceArray[j]="0";
				}
				
				if (sentenceArray[i] != "0" && count > 1)
		              System.out.print(" "+sentenceArray[i]+" ");
			}
		}
		 
		 
	 }

}
