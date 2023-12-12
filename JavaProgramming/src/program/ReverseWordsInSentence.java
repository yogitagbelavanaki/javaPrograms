package program;

public class ReverseWordsInSentence {
	
	public static void main(String[] args) {
		String sentence="It is a beautiful day out";
		String[] sentenceArray=sentence.split(" ");
		for (int i = 0; i < sentenceArray.length; i++) {
			
			String word=sentenceArray[i];
			String reversedWord="";
			for (int j = word.length()-1; j >=0; j--) {
				reversedWord=reversedWord+word.charAt(j);
			}
			System.out.println(reversedWord);
		}
		
	}

}
