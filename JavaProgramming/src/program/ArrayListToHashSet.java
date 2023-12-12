package program;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToHashSet {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add("Hello");
		arrayList.add('S');
		arrayList.add(12.5);
		
		HashSet hashSet=new HashSet(arrayList);
		System.out.println(hashSet);
	}

}
