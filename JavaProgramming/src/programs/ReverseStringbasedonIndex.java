package programs;

public class ReverseStringbasedonIndex {

	public static void main(String[] args) {

		String s="Advanced Selenium";
		String[] split_value = s.split(" ");
		String y="";
		for(int i=0;i<split_value.length;i++) {
			
			String data = split_value[i];
			
			for(int j=data.length()-1;j>=0;j--) {
				
				y=y+data.charAt(j);
			}
			y+=" ";
		}
		System.out.println(y);
	}

}
