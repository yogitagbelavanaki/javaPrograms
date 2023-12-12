package program;

public class RevUsingStringBuffer {

	public static void main(String[] args) {
		
		String s="selenium";
		
		StringBuffer sb=new StringBuffer(s);
		sb.append("	niranjan");
		StringBuffer rev = sb.reverse();
		System.out.println(sb.capacity());	
		System.out.println(rev);
		System.out.println(sb);
			
	}
}