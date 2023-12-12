package program;

public class CharFrom1StringIn2ndString {
	
	public static void main(String[] args) {
		String word1="Sandeep";
		String word2="Yogita";
		
		StringBuffer buffer=new StringBuffer(word1);
		
		for (int i = 0; i < buffer.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {
				if(word2.charAt(j)==buffer.charAt(i)) {
					buffer.deleteCharAt(i);
				}
			}
		}
		System.out.println(buffer+" After comparison");
	}

}
